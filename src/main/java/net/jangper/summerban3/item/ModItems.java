package net.jangper.summerban3.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.jangper.summerban3.SummerBan3;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems{
    public static final Item FLUORITA = registerItem("fluorita",
            properties -> new Item(properties));

    public static final Item FLUORITA_BRUTA = registerItem("fluorita_bruta",
            properties -> new Item(properties));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(SummerBan3.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SummerBan3.MOD_ID, name)))));
    }


    public static void registerModItems() {
        SummerBan3.LOGGER.info("Registrando items del Mod " + SummerBan3.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(FLUORITA);
            output.accept(FLUORITA_BRUTA);
        });
    }

}
