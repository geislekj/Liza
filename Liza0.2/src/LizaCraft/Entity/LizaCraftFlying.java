package LizaCraft.Entity;

import org.bukkit.entity.Flying;

import Liza.LizaFlying;

/**
 *  LizaCraftFlying is the Liza entity representation of
 *  the Bukkit Flying class.
 *  
 *  @author collinbc
 */
public class LizaCraftFlying extends LizaCraftLivingEntity implements LizaFlying {
	/**
	 * LizaCraftFlying Constructor
	 * 
	 * @param flying A Bukkit Flying
	 */
	public LizaCraftFlying(Flying flying) {
		super(flying);
	}
	
	@Override
	public Flying getBukkitHandle() {
		return (Flying)this.entity;
	}

}
