package net.seagull.lionturtle.registries;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.seagull.lionturtle.LionTurtle;
import java.util.Collection;
import java.util.function.Supplier;


import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.seagull.lionturtle.LionTurtle;

public class ItemRegistry {
    // Speciální helper pro itemy (NeoForge)
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(LionTurtle.MODID);

    public static final DeferredItem<Item> FIREBENDING_SCROLL =
            ITEMS.register("firebending_scroll",
                    () -> new Item(new Item.Properties().stacksTo(1)));
}