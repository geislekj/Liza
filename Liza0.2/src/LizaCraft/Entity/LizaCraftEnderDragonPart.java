package LizaCraft.Entity;

import org.bukkit.entity.EnderDragonPart;

import Liza.LizaEnderDragon;
import Liza.LizaEnderDragonPart;

/**
 *  LizaCraftEnderDragonPart is the Liza entity representation of
 *  the Bukkit EnderDragonPart class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderDragonPart extends LizaCraftComplexEntityPart implements LizaEnderDragonPart {
	
	/**
	 * LizaCraftEnderDragonPart Constructor.
	 *
	 * @param part A Bukkit EnderDragonPart
	 */
	public LizaCraftEnderDragonPart(EnderDragonPart part) {
		super(part);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftComplexEntityPart#getBukkitHandle()
	 */
	@Override
	public EnderDragonPart getBukkitHandle() {
		return (EnderDragonPart) this.entity;
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftComplexEntityPart#getParent()
	 */
	@Override
	public LizaEnderDragon getParent() {
		return new LizaCraftEnderDragon(this.getBukkitHandle().getParent());
	}
}
