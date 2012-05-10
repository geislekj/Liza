package LizaCraft.Entity;

import org.bukkit.entity.Snowman;

import Liza.LizaSnowman;

/**
 * LizaCraftSnowman is the Liza entity representation of the Bukkit Snowman
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftSnowman extends LizaCraftCreature implements LizaSnowman {
	/**
	 * LizaCraftSnowman Constructor
	 * 
	 * @param snowman
	 *            A Bukkit Snowman
	 */
	public LizaCraftSnowman(Snowman snowman) {
		super(snowman);
	}

	@Override
	public Snowman getBukkitHandle() {
		return (Snowman) this.entity;
	}

}
