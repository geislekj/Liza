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
	 * LizaCraftEnderDragonPart Constructor
	 * 
	 * @param part A Bukkit EnderDragonPart
	 */
	public LizaCraftEnderDragonPart(EnderDragonPart part) {
		super(part);
	}
	
	@Override
	public EnderDragonPart getBukkitHandle() {
		return (EnderDragonPart) this.entity;
	}

	@Override
	public LizaEnderDragon getParent() {
		return new LizaCraftEnderDragon(this.getBukkitHandle().getParent());
	}
}
