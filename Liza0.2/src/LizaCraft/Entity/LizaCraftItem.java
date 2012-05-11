package LizaCraft.Entity;

import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import Liza.LizaItem;

/**
 * LizeCraftItem is the Liza entity representation of the Bukkit Item class.
 * 
 * @author geislekj
 */
public class LizaCraftItem extends LizaCraftEntity implements LizaItem {

	/**
	 * LizaCraftItem Constructor.
	 *
	 * @param item This is a Bukkit Item entity
	 */
	public LizaCraftItem(Item item) {
		super(item);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getBukkitHandle()
	 */
	@Override
	public Item getBukkitHandle() {
		return (Item) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Item#getItemStack()
	 */
	@Override
	public ItemStack getItemStack() {
		return this.getBukkitHandle().getItemStack();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Item#getPickupDelay()
	 */
	@Override
	public int getPickupDelay() {
		return this.getBukkitHandle().getPickupDelay();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Item#setItemStack(org.bukkit.inventory.ItemStack)
	 */
	@Override
	public void setItemStack(ItemStack stack) {
		this.getBukkitHandle().setItemStack(stack);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Item#setPickupDelay(int)
	 */
	@Override
	public void setPickupDelay(int delay) {
		this.getBukkitHandle().setPickupDelay(delay);

	}

}
