package LizaCraft.Entity;

import org.bukkit.entity.StorageMinecart;
import org.bukkit.inventory.Inventory;

import Liza.LizaStorageMinecart;

public class LizaCraftStorageMinecart extends LizaCraftMinecart implements
		LizaStorageMinecart {

	public LizaCraftStorageMinecart(StorageMinecart minecart) {
		super(minecart);
	}

	@Override
	public StorageMinecart getBukkitHandle() {
		return (StorageMinecart) this.entity;
	}

	@Override
	public Inventory getInventory() {
		return this.getBukkitHandle().getInventory();
	}

}
