package LizaCraft.Entity;

import org.bukkit.entity.Animals;
import Liza.LizaAnimals;

/**
 * LizaCraftAnimals is the Liza entity representation of the Bukkit CraftAnimals
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftAnimals extends LizaCraftCreature implements LizaAnimals {

	/**
	 * LizaCraftAnimals Constructor.
	 *
	 * @param animal A Bukkit Animals
	 */
	public LizaCraftAnimals(Animals animal) {
		super(animal);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftCreature#getBukkitHandle()
	 */
	@Override
	public Animals getBukkitHandle() {
		return (Animals) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#canBreed()
	 */
	@Override
	public boolean canBreed() {
		return this.getBukkitHandle().canBreed();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#getAge()
	 */
	@Override
	public int getAge() {
		return this.getBukkitHandle().getAge();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#getAgeLock()
	 */
	@Override
	public boolean getAgeLock() {
		return this.getBukkitHandle().getAgeLock();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#isAdult()
	 */
	@Override
	public boolean isAdult() {
		return this.getBukkitHandle().isAdult();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#setAdult()
	 */
	@Override
	public void setAdult() {
		this.getBukkitHandle().setAdult();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#setAge(int)
	 */
	@Override
	public void setAge(int age) {
		this.getBukkitHandle().setAge(age);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#setAgeLock(boolean)
	 */
	@Override
	public void setAgeLock(boolean ageLock) {
		this.getBukkitHandle().setAgeLock(ageLock);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#setBaby()
	 */
	@Override
	public void setBaby() {
		this.getBukkitHandle().setBaby();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Animals#setBreed(boolean)
	 */
	@Override
	public void setBreed(boolean breed) {
		this.getBukkitHandle().setBreed(breed);
	}
}