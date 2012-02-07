package LizaCraft.Entity;

import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Tameable;

import Liza.LizaTameable;

/**
 *  LizaCraftMonster is the Liza entity representation of
 *  the Bukkit Monster class.
 *  
 *  @author collinbc
 */
public class LizaCraftTameable implements LizaTameable {
	private Tameable tameable;
	
	/**
	 * LizaCraftTameable Constructor
	 * 
	 * @param tameable A Bukkit Tameable object
	 */
	public LizaCraftTameable(Tameable tameable) {
		this.tameable = tameable;
	}
	@Override
	public AnimalTamer getOwner() {
		return this.tameable.getOwner();
	}

	@Override
	public boolean isTamed() {
		return this.tameable.isTamed();
	}

	@Override
	public void setOwner(AnimalTamer tamer) {
		this.tameable.setOwner(tamer);
	}

	@Override
	public void setTamed(boolean tame) {
		this.tameable.setTamed(tame);
	}

}
