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
	 * LizaCraftSheep Constructor.
	 *
	 * @param sheep A Bukkit Sheep
	 */
	public LizaCraftSheep(Sheep sheep) {
		super(sheep);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftAnimals#getBukkitHandle()
	 */
	@Override
	public Sheep getBukkitHandle() {
		return (Sheep) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Sheep#isSheared()
	 */
	@Override
	public boolean isSheared() {
		return this.getBukkitHandle().isSheared();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Sheep#setSheared(boolean)
	 */
	@Override
	public void setSheared(boolean sheared) {
		this.getBukkitHandle().setSheared(sheared);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.material.Colorable#getColor()
	 */
	@Override
	public DyeColor getColor() {
		return this.getBukkitHandle().getColor();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.material.Colorable#setColor(org.bukkit.DyeColor)
	 */
	@Override
	public void setColor(DyeColor color) {
		this.getBukkitHandle().setColor(color);
	}
}
