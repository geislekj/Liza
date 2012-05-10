package LizaCraft.Entity;

import org.bukkit.entity.Creeper;
import Liza.LizaCreeper;

/**
 * LizaCraftCreeper is the Liza entity representation of the Bukkit Creeper
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftCreeper extends LizaCraftMonster implements LizaCreeper {
	/**
	 * LizaCraftCreeper Constructor
	 * 
	 * @param creeper
	 *            A Bukkit Creeper
	 */
	public LizaCraftCreeper(Creeper creeper) {
		super(creeper);
	}

	@Override
	public Creeper getBukkitHandle() {
		return (Creeper) this.entity;
	}

	@Override
	public boolean isPowered() {
		return this.getBukkitHandle().isPowered();
	}

	@Override
	public void setPowered(boolean power) {
		this.getBukkitHandle().setPowered(power);

	}

}
