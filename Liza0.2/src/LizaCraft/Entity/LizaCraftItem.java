package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import Liza.LizaItem;


/**
 *  LizeCraftItem is the Liza entity representation of
 *  the Bukkit Item class.
 *  
 * @author geislekj
 */
public class LizaCraftItem extends LizaCraftEntity implements LizaItem{
	
	/**
	 * LizaCraftItem Constructor
	 * 
	 * @param item This is a Bukkit Item entity 
	 */
	public LizaCraftItem(Item item) {
		super(item);
	}
	
	@Override
	public Item getBukkitHandle() {
		return (Item)this.entity;
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
