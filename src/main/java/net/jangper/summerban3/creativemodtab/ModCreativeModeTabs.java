package net.jangper.summerban3.creativemodtab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.jangper.summerban3.SummerBan3;
import net.jangper.summerban3.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab FLUORITA_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(SummerBan3.MOD_ID, "fluorita_item_tab"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.FLUORITA))
                    .title(Component.translatable("creativemodtab.summerban3.fluorita_item_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.FLUORITA);
                        output.accept(ModItems.FLUORITA_BRUTA);
                    }).build());

    public static void registerModCreativeModeTabs() {
        SummerBan3.LOGGER.info("Registrando Pestañas de creativo para " + SummerBan3.MOD_ID);
    }
}
