package net.malanak.modlearn.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.malanak.modlearn.LearnMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings().group(ModItemGroup.LEARNMOD)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new FabricItemSettings().group(ModItemGroup.LEARNMOD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LearnMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LearnMod.LOGGER.info("Registering Items for LearnMod");
    }
}
