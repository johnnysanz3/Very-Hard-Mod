package veryhardmod.init;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@EventBusSubscriber
public class Registrar {
    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
    	ResourceLocation acaciaPlanks = new ResourceLocation("minecraft:acacia_planks");
    	ResourceLocation birchPlanks = new ResourceLocation("minecraft:birch_planks");
    	ResourceLocation darkOakPlanks = new ResourceLocation("minecraft:dark_oak_planks");
    	ResourceLocation junglePlanks = new ResourceLocation("minecraft:jungle_planks");
    	ResourceLocation oakPlanks = new ResourceLocation("minecraft:oak_planks");
    	ResourceLocation sprucePlanks = new ResourceLocation("minecraft:spruce_planks");

    	IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
        
    	modRegistry.remove(acaciaPlanks);
    	modRegistry.remove(birchPlanks);
    	modRegistry.remove(darkOakPlanks);
    	modRegistry.remove(junglePlanks);
    	modRegistry.remove(oakPlanks);
    	modRegistry.remove(sprucePlanks);
        
}
}
