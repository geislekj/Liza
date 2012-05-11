package LizaCraft.Entity;

import org.bukkit.entity.StorageMinecart;
import org.bukkit.inventory.Inventory;

import Liza.LizaStorageMinecart;

/**
 * The Class LizaCraftStorageMinecart.
 */
public class LizaCraftStorageMinecart extends LizaCraftMinecart implements
		LizaStorageMinecart {

	/**
	 * Instantiates a new liza craft storage minecart.
	 *
	 * @param minecart the minecart
	 */
	public LizaCraftStorageMinecart(StorageMinecart minecart) {
		super(minecart);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMinecart#getBukkitHandle()
	 */
	@Override
	public StorageMinecart getBukkitHandle() {
		return (StorageMinecart) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.inventory.InventoryHolder#getInventory()
	 */
	@Override
	public Inventory getInventory() {
		return this.getBukkitHandle().getInventory();
	}

}
