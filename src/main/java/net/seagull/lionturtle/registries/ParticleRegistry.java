package net.seagull.lionturtle.registries;


import net.seagull.lionturtle.LionTurtle;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ParticleRegistry {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(Registries.PARTICLE_TYPE, LionTurtle.MODID);

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }


    /*
    To Create Particle:
    - textures + json
    - particle class
    - register it here
    - add it to particle helper
    - register it in client setup
     */
    public static final Supplier<SimpleParticleType> FIRE_TRAIL_PARTICLE =
            PARTICLE_TYPES.register("fire_trail", () -> new SimpleParticleType(false));
    public static final Supplier<SimpleParticleType> BLUE_FIRE_TRAIL_PARTICLE =
            PARTICLE_TYPES.register("blue_fire_trail", () -> new SimpleParticleType(false));
}