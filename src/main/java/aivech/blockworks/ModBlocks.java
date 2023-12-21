package aivech.blockworks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PIPE = new Block(FabricBlockSettings.create());

    public static void init() {
        Registry.register(Registries.BLOCK, new Identifier(Blockworks.MOD_ID, "pipe"), PIPE);
        Registry.register(Registries.ITEM, new Identifier(Blockworks.MOD_ID, "pipe"), new BlockItem(PIPE, new FabricItemSettings()));

    }
}
