package veryhardmod.common;

import java.util.Random;

import net.minecraftforge.event.world.BlockEvent.CropGrowEvent.Pre;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StaticCropGrowthHandler {
    @SubscribeEvent
    public static void onCropGrowth(Pre preCropGrowth) {
    	
    	System.out.println(preCropGrowth.getResult().toString());
    	
    	//same as vanilla logic, vanilla method is protected and can't be called
    	float f = CustomBlockCrops.getGrowthChance(preCropGrowth.getState().getBlock(), preCropGrowth.getWorld(), preCropGrowth.getPos());
    	
    	Random rand = new Random();
    	
    	//default is 25.0f / f, changing it to 50.0
    	if (rand.nextInt((int)(50.0F / f) + 1) == 0){
    		preCropGrowth.setResult(Result.ALLOW);
    		System.out.println("CROP GROWTH ALLOWED");
    	}else{
    		System.out.println("DON'T EVEN THINK ABOUT GROWING");
    		preCropGrowth.setResult(Result.DENY);
    	}
    }
}