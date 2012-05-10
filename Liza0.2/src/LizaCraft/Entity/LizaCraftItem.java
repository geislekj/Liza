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
	 * LizaCraftItem Constructor
	 * 
	 * @param item
	 *            This is a Bukkit Item entity
	 */
	public LizaCraftItem(Item item) {
		super(item);
	}

	@Override
	public Item getBukkitHandle() {
		return (Item) this.entity;
	}

	@Override
	public ItemStack getItemStack() {
		return this.getBukkitHandle().getItemStack();
	}

	@Override
	public int getPickupDelay() {
		return this.getBukkitHandle().getPickupDelay();
	}

	@Override
	public void setItemStack(ItemStack stack) {
		this.getBukkitHandle().setItemStack(stack);
	}

	@Override
	public void setPickupDelay(int delay) {
		this.getBukkitHandle().setPickupDelay(delay);

	}

}
