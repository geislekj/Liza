package LizaCraft.Entity;

import org.bukkit.entity.Minecart;
import org.bukkit.entity.PoweredMinecart;

import Liza.LizaPoweredMinecart;

// TODO: Auto-generated Javadoc
/**
 * The Class LizaCraftPoweredMinecart.
 */
public class LizaCraftPoweredMinecart extends LizaCraftMinecart implements
		LizaPoweredMinecart {

	/**
	 * Instantiates a new liza craft powered minecart.
	 *
	 * @param minecart the minecart
	 */
	public LizaCraftPoweredMinecart(Minecart minecart) {
		super(minecart);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMinecart#getBukkitHandle()
	 */
	@Override
	public PoweredMinecart getBukkitHandle(){
		return (PoweredMinecart)this.entity;
	}
	
}
