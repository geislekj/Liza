package LizaCraft.Entity;

import org.bukkit.entity.Blaze;
import Liza.LizaBlaze;

/**
 * LizaCraftBlaze is the Liza entity representation of the Bukkit Blaze class.
 * 
 * @author collinbc
 */
public class LizaCraftBlaze extends LizaCraftMonster implements LizaBlaze {

	/**
	 * LizaCraftBlaze Constructor
	 * 
	 * @param blaze
	 *            A Bukkit Blaze
	 */
	public LizaCraftBlaze(Blaze blaze) {
		super(blaze);
	}

	@Override
	public Blaze getBukkitHandle() {
		return (Blaze) this.entity;
	}

}
