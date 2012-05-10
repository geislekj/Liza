package LizaCraft.Entity;

import org.bukkit.entity.Blaze;
import Liza.LizaBlaze;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftBlaze is the Liza entity representation of the Bukkit Blaze class.
 * 
 * @author collinbc
 */
public class LizaCraftBlaze extends LizaCraftMonster implements LizaBlaze {

	/**
	 * LizaCraftBlaze Constructor.
	 *
	 * @param blaze A Bukkit Blaze
	 */
	public LizaCraftBlaze(Blaze blaze) {
		super(blaze);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMonster#getBukkitHandle()
	 */
	@Override
	public Blaze getBukkitHandle() {
		return (Blaze) this.entity;
	}

}
