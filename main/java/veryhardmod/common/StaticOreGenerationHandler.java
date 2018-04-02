package veryhardmod.common;

import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StaticOreGenerationHandler {
    @SubscribeEvent
    public static void onChunkOreGeneration(GenerateMinable event) {
    	
		if (event.getType() == EventType.DIAMOND){
    		System.out.println(event.getType()+" is denied");
    		event.setResult(Result.DENY);

    		BlockPos blockPos = event.getPos();
    		blockPos.getX();

    	}
    	
        
    }
}