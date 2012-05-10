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
	 * LizaCraftAnimals Constructor
	 * 
	 * @param animal
	 *            A Bukkit Animals
	 */
	public LizaCraftAnimals(Animals animal) {
		super(animal);
	}

	@Override
	public Animals getBukkitHandle() {
		return (Animals) this.entity;
	}

	@Override
	public boolean canBreed() {
		return this.getBukkitHandle().canBreed();
	}

	@Override
	public int getAge() {
		return this.getBukkitHandle().getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.getBukkitHandle().getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.getBukkitHandle().isAdult();
	}

	@Override
	public void setAdult() {
		this.getBukkitHandle().setAdult();
	}

	@Override
	public void setAge(int age) {
		this.getBukkitHandle().setAge(age);
	}

	@Override
	public void setAgeLock(boolean ageLock) {
		this.getBukkitHandle().setAgeLock(ageLock);
	}

	@Override
	public void setBaby() {
		this.getBukkitHandle().setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.getBukkitHandle().setBreed(breed);
	}
}