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
	 * LizaCraftPigZombie Constructor.
	 *
	 * @param zombiePigman A Bukkit PigZombie
	 */
	public LizaCraftPigZombie(PigZombie zombiePigman) {
		super(zombiePigman);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMonster#getBukkitHandle()
	 */
	@Override
	public PigZombie getBukkitHandle() {
		return (PigZombie)this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.PigZombie#getAnger()
	 */
	@Override
	public int getAnger() {
		return this.getBukkitHandle().getAnger();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.PigZombie#isAngry()
	 */
	@Override
	public boolean isAngry() {
		return this.getBukkitHandle().isAngry();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.PigZombie#setAnger(int)
	 */
	@Override
	public void setAnger(int anger) {
		this.getBukkitHandle().setAnger(anger);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.PigZombie#setAngry(boolean)
	 */
	@Override
	public void setAngry(boolean angry) {
		this.getBukkitHandle().setAngry(angry);
	}
}
