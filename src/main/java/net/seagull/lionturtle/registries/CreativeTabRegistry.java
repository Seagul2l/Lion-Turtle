package net.seagull.lionturtle.registries;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

import net.seagull.lionturtle.LionTurtle;
import net.seagull.lionturtle.registries.ItemRegistry;

@EventBusSubscriber(modid = LionTurtle.MODID, bus = EventBusSubscriber.Bus.MOD)
public class CreativeTabRegistry {

    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LionTurtle.MODID);

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LION_TURTLE = TABS.register("lion_turtle", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + LionTurtle.MODID + ".lion_turtle_tab"))
            //add icon
            .displayItems((enabledFeatures, entries) -> {
            })
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .build());
}