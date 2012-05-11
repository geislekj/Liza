package LizaCraft.Entity;

import org.bukkit.entity.FallingSand;

import Liza.LizaFallingSand;

/**
 * LizeCraftFallingSand is the Liza entity representation of the Bukkit
 * FallingSand class.
 * 
 * @author geislekj
 */
public class LizaCraftFallingSand extends LizaCraftEntity implements
		LizaFallingSand {
	
	/**
	 * LizaCraftFallingSand Constructor.
	 *
	 * @param fallingSand This is a Bukkit FallingSand entity
	 */
	public LizaCraftFallingSand(FallingSand fallingSand) {
		super(fallingSand);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getBukkitHandle()
	 */
	@Override
	public FallingSand getBukkitHandle() {
		return (FallingSand) this.entity;
	}

}
