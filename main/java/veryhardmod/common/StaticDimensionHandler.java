package veryhardmod.common;

import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StaticDimensionHandler {
    @SubscribeEvent
    public static void entityTravelToDimension(EntityTravelToDimensionEvent event) {
        System.out.println("Entity traveled to dimension!"+event.getDimension());

        System.out.println(event.getEntity().getPosition().getX());
        System.out.println(event.getEntity().getPosition().getZ());
        System.out.println(event.getDimension()); //to dimension
        System.out.println(event.getEntity().dimension); //from dimension
        
        //-1 nether
        //0 overworld
        int fromDimension = event.getEntity().dimension;
        int toDimension = event.getDimension();
        double xPosition = event.getEntity().getPosition().getX();
        double zPosition = event.getEntity().getPosition().getZ();
        
        //from nether to overworld
        if (fromDimension == -1 && toDimension == 0){
        	xPosition = xPosition / 8.0D;
        	zPosition = zPosition / 8.0D;
        }
        //from overworld to nether
        if (fromDimension == 0 && toDimension == -1){
        	xPosition = xPosition * 8.0D;
        	zPosition = zPosition * 8.0D;
        }
        
        event.getEntity().setPosition(xPosition, event.getEntity().getPosition().getY(), zPosition);
        
    }
}