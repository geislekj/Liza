package LizaCraft.Entity;

import org.bukkit.entity.EnderDragon;
import Liza.LizaEnderDragon;

/**
 *  LizaCraftEnderDragon is the Liza entity representation of
 *  the Bukkit EnderDragon class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderDragon extends LizaCraftComplexLivingEntity implements LizaEnderDragon {
	
	/**
	 * LizaCraftEnderDragon Constructor
	 * 
	 * @param ynderDragon A Bukkit EnderDragon
	 */
	public LizaCraftEnderDragon(EnderDragon enderDragon) {
		super(enderDragon);
	}
	
	@Override
	public EnderDragon getBukkitHandle() {
		return (EnderDragon) this.entity;
	}
}
