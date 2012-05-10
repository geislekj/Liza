package LizaCraft.Entity;

import org.bukkit.entity.Pig;
import Liza.LizaPig;

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftPig is the Liza entity representation of
 *  the Bukkit CraftPig class.
 *  
 * @author collinbc
 */
public class LizaCraftPig extends LizaCraftAnimals implements LizaPig {
	
	/**
	 * LizaCraftPig Constructor.
	 *
	 * @param pig A Bukkit Pig
	 */
	public LizaCraftPig(Pig pig) {
		super(pig);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftAnimals#getBukkitHandle()
	 */
	@Override
	public Pig getBukkitHandle() {
		return (Pig)this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Pig#hasSaddle()
	 */
	@Override
	public boolean hasSaddle() {
		return this.getBukkitHandle().hasSaddle();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Pig#setSaddle(boolean)
	 */
	@Override
	public void setSaddle(boolean saddled) {
		this.getBukkitHandle().setSaddle(saddled);
	}

}
