package Liza;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.CraftChunk;
import org.bukkit.craftbukkit.block.CraftBlock;

public class LizaCraftBlock extends CraftBlock implements LizaBlock {

	public LizaCraftBlock(CraftChunk chunk, int x, int y, int z) {
		super(chunk, x, y, z);
	}
	
	public LizaCraftBlock(Block block) {
		super((CraftChunk)block.getChunk(), block.getX(), block.getY(), block.getZ());
	}

	public boolean assertBlockType(Material type) {
		return this.getType().equals(type);
	}

}
