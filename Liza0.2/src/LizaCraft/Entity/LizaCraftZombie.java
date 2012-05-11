package LizaCraft.Entity;

import org.bukkit.entity.Zombie;

import Liza.LizaZombie;

/**
 * LizaCraftZombie is the Liza entity representation of the Bukkit Zombie class.
 * 
 * @author collinbc
 */
public class LizaCraftZombie extends LizaCraftMonster implements LizaZombie {
	
	/**
	 * LizaCraftZombie Constructor.
	 *
	 * @param zombie A Bukkit Zombie
	 */
	public LizaCraftZombie(Zombie zombie) {
		super(zombie);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMonster#getBukkitHandle()
	 */
	@Override
	public Zombie getBukkitHandle() {
		return (Zombie) this.entity;
	}
}
