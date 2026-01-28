package net.seagull.lionturtle.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.seagull.lionturtle.LionTurtle;


public final class EntityRegistry {
    private EntityRegistry() {
    }


    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, LionTurtle.MODID);


    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

}


    //Bending ENITITES

