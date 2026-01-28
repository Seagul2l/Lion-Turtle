package net.seagull.lionturtle.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.seagull.lionturtle.LionTurtle;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(Registries.SOUND_EVENT, LionTurtle.MODID);



    private static DeferredHolder<SoundEvent, SoundEvent> register(String id) {
        return SOUNDS.register(id, () ->
                SoundEvent.createVariableRangeEvent(
                        ResourceLocation.fromNamespaceAndPath(LionTurtle.MODID, id)
                )
        );
    }

    private SoundRegistry() {}




}