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
	 * LizaCraftCreeper Constructor.
	 *
	 * @param creeper A Bukkit Creeper
	 */
	public LizaCraftCreeper(Creeper creeper) {
		super(creeper);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMonster#getBukkitHandle()
	 */
	@Override
	public Creeper getBukkitHandle() {
		return (Creeper) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Creeper#isPowered()
	 */
	@Override
	public boolean isPowered() {
		return this.getBukkitHandle().isPowered();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Creeper#setPowered(boolean)
	 */
	@Override
	public void setPowered(boolean power) {
		this.getBukkitHandle().setPowered(power);

	}

}
