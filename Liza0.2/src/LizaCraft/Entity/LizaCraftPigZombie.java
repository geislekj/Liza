package LizaCraft.Entity;

import org.bukkit.entity.PigZombie;
import Liza.LizaPigZombie;

/**
 *  LizaCraftPigZombie is the Liza entity representation of
 *  the Bukkit PigZombie class.
 *  
 *  @author collinbc
 */
public class LizaCraftPigZombie extends LizaCraftMonster implements LizaPigZombie {
	/**
	 * LizaCraftPigZombie Constructor
	 * 
	 * @param zombiePigman A Bukkit PigZombie
	 */
	public LizaCraftPigZombie(PigZombie zombiePigman) {
		super(zombiePigman);
	}
	
	@Override
	public PigZombie getBukkitHandle() {
		return (PigZombie)this.entity;
	}

	@Override
	public int getAnger() {
		return this.getBukkitHandle().getAnger();
	}

	@Override
	public boolean isAngry() {
		return this.getBukkitHandle().isAngry();
	}

	@Override
	public void setAnger(int anger) {
		this.getBukkitHandle().setAnger(anger);
	}

	@Override
	public void setAngry(boolean angry) {
		this.getBukkitHandle().setAngry(angry);
	}
}
