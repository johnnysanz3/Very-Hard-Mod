package com.example.examplemod;

import net.minecraftforge.event.world.BlockEvent.CropGrowEvent.Pre;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StaticCropGrowthHandler {
    @SubscribeEvent
    public static void onCropGrowth(Pre preCropGrowth) {
    	
    	//don't even THINK about growing
		preCropGrowth.setResult(Result.DENY);
        
    }
}