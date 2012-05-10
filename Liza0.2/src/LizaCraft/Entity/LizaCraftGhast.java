package LizaCraft.Entity;

import org.bukkit.entity.Ghast;

import Liza.LizaGhast;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftGhast is the Liza entity representation of the Bukkit Ghast class.
 * 
 * @author collinbc
 */
public class LizaCraftGhast extends LizaCraftFlying implements LizaGhast {
	
	/**
	 * LizaCraftGhast Constructor.
	 *
	 * @param ghast A Bukkit Ghast
	 */
	public LizaCraftGhast(Ghast ghast) {
		super(ghast);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftFlying#getBukkitHandle()
	 */
	@Override
	public Ghast getBukkitHandle() {
		return (Ghast) this.entity;
	}

}
