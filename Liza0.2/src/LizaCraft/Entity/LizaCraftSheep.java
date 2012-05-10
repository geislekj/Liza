package LizaCraft.Entity;

import org.bukkit.DyeColor;
import org.bukkit.entity.Sheep;
import Liza.LizaSheep;

/**
 * LizaCraftSheep is the Liza entity representation of the Bukkit CraftSheep
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftSheep extends LizaCraftAnimals implements LizaSheep {
	/**
	 * LizaCraftSheep Constructor
	 * 
	 * @param sheep
	 *            A Bukkit Sheep
	 */
	public LizaCraftSheep(Sheep sheep) {
		super(sheep);
	}

	@Override
	public Sheep getBukkitHandle() {
		return (Sheep) this.entity;
	}

	@Override
	public boolean isSheared() {
		return this.getBukkitHandle().isSheared();
	}

	@Override
	public void setSheared(boolean sheared) {
		this.getBukkitHandle().setSheared(sheared);
	}

	@Override
	public DyeColor getColor() {
		return this.getBukkitHandle().getColor();
	}

	@Override
	public void setColor(DyeColor color) {
		this.getBukkitHandle().setColor(color);
	}
}
