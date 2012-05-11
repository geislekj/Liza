package LizaCraft.Entity;

import org.bukkit.entity.MagmaCube;

import Liza.LizaMagmaCube;

/**
 * LizaCraftMagmaCube is the Liza entity representation of the Bukkit MagmaCube
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftMagmaCube extends LizaCraftSlime implements LizaMagmaCube {
	
	/**
	 * LizaCraftMagmaCube Constructor.
	 *
	 * @param magmaCube A Bukkit MagmaCube
	 */
	public LizaCraftMagmaCube(MagmaCube magmaCube) {
		super(magmaCube);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftSlime#getBukkitHandle()
	 */
	@Override
	public MagmaCube getBukkitHandle() {
		return (MagmaCube) this.entity;
	}

}
