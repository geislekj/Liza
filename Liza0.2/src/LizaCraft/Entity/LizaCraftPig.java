package LizaCraft.Entity;

import org.bukkit.entity.Pig;
import Liza.LizaPig;

/**
 *  LizaCraftPig is the Liza entity representation of
 *  the Bukkit CraftPig class.
 *  
 * @author collinbc
 */
public class LizaCraftPig extends LizaCraftAnimals implements LizaPig {
	/**
	 * LizaCraftPig Constructor
	 * 
	 * @param pig A Bukkit Pig
	 */
	public LizaCraftPig(Pig pig) {
		super(pig);
	}
	
	@Override
	public Pig getBukkitHandle() {
		return (Pig)this.entity;
	}

	@Override
	public boolean hasSaddle() {
		return this.getBukkitHandle().hasSaddle();
	}

	@Override
	public void setSaddle(boolean saddled) {
		this.getBukkitHandle().setSaddle(saddled);
	}

}
