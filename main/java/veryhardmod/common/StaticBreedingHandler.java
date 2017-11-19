package veryhardmod.common;

import java.util.HashMap;
import java.util.UUID;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StaticBreedingHandler {
	static HashMap<UUID, Integer> animalBreedingMap = new HashMap<UUID, Integer>();
	static UUID animalID;
	static final int startingCount = 30000; //25minute cooldown
	static int animalBreedingCountdown = 30000;
	
    @SubscribeEvent
    public static void onLivingUpdateEvent(LivingUpdateEvent event) {
    	
       if (event.getEntityLiving() instanceof EntityAnimal){
		   EntityAnimal entityAnimal = ((EntityAnimal) event.getEntityLiving());
           int growingAge = entityAnimal.getGrowingAge();
           animalID = entityAnimal.getUniqueID();
           
           if (growingAge > 10){
        	   
        	   animalBreedingMap.putIfAbsent(animalID, startingCount);
        	   animalBreedingCountdown = animalBreedingMap.get(animalID);

        	   animalBreedingCountdown--;
        	   animalBreedingMap.replace(animalID,animalBreedingCountdown);
        	   ((EntityAnimal) event.getEntityLiving()).setGrowingAge(animalBreedingCountdown);
        	   
        	   //System.out.println("animal id is "+animalID+" : growing age is "+growingAge+" : animalbreedingcountdown is "+animalBreedingCountdown);
           }else{
        	   animalBreedingMap.remove(animalID);
           }
       }
    }
}