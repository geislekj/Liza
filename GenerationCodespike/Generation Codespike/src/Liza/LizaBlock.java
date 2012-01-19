package Liza;

import org.bukkit.Material;
import org.bukkit.block.Block;

/**
 * @author kimsj
 *
 *  LizaBlock is the Liza interface representation of
 *  the Bukkit Block interface
 */
public interface LizaBlock extends Block {

	/**
	 * Asserts Block Type
	 * @param type
	 * @return boolean
	 */
	public boolean assertBlockType(Material type);
}
