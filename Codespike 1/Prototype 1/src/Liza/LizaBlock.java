package Liza;

import org.bukkit.Material;
import org.bukkit.block.Block;

public interface LizaBlock extends Block {

	public boolean assertBlockType(Material type);
}
