package net.malanak.modlearn.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.malanak.modlearn.LearnMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup LEARNMOD = FabricItemGroupBuilder.build(new Identifier(LearnMod.MOD_ID, "mylearnmod"), () -> new ItemStack(ModItems.MYTHRIL_INGOT));
}
