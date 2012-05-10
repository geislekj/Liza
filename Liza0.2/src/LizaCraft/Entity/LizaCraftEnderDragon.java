package LizaCraft.Entity;

import org.bukkit.entity.EnderDragon;
import Liza.LizaEnderDragon;

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftEnderDragon is the Liza entity representation of
 *  the Bukkit EnderDragon class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderDragon extends LizaCraftComplexLivingEntity implements LizaEnderDragon {
	
	/**
	 * LizaCraftEnderDragon Constructor.
	 *
	 * @param enderDragon the ender dragon
	 */
	public LizaCraftEnderDragon(EnderDragon enderDragon) {
		super(enderDragon);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftComplexLivingEntity#getBukkitHandle()
	 */
	@Override
	public EnderDragon getBukkitHandle() {
		return (EnderDragon) this.entity;
	}
}
