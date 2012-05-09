package LizaCraft.Entity;

import java.util.Set;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import Liza.LizaHumanEntity;

/**
 *  LizaCraftHumanEntity is the Liza HumanEntity representation of
 *  the Bukkit HumanEntity class.
 *  
 *  DONE: Methods that return Bukkit classes that may later be implemented
 *  in Liza should be changed to use those interfaces and classes after
 *  they are created.
 *  
 * @author collinbc
 */
public class LizaCraftHumanEntity extends LizaCraftLivingEntity implements LizaHumanEntity {
	
	/**
	 * LizaCraftHumanEntity Constructor
	 * 
	 * @param humanEntity A Bukkit HumanEntity
	 */
	public LizaCraftHumanEntity(HumanEntity humanEntity) {
		super(humanEntity);
	}
	
	@Override
	public HumanEntity getBukkitHandle() {
		return (HumanEntity) this.entity;
	}

	@Override
	public GameMode getGameMode() {
		return this.getBukkitHandle().getGameMode();
	}

	@Override
	public PlayerInventory getInventory() {
		return this.getBukkitHandle().getInventory();
	}

	@Override
	public ItemStack getItemInHand() {
		return this.getBukkitHandle().getItemInHand();
	}

	@Override
	public String getName() {
		return this.getBukkitHandle().getName();
	}

	@Override
	public int getSleepTicks() {
		return this.getBukkitHandle().getSleepTicks();
	}

	@Override
	public boolean isSleeping() {
		return this.getBukkitHandle().isSleeping();
	}

	@Override
	public void setGameMode(GameMode mode) {
		this.getBukkitHandle().setGameMode(mode);
	}

	@Override
	public void setItemInHand(ItemStack item) {
		this.getBukkitHandle().setItemInHand(item);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin) {
		return this.getBukkitHandle().addAttachment(plugin);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		return this.getBukkitHandle().addAttachment(plugin, ticks);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value) {
		return this.getBukkitHandle().addAttachment(plugin, name, value);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value, int ticks) {
		return this.getBukkitHandle().addAttachment(plugin, name, value, ticks);
	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return this.getBukkitHandle().getEffectivePermissions();
	}

	@Override
	public boolean hasPermission(String name) {
		return this.getBukkitHandle().hasPermission(name);
	}

	@Override
	public boolean hasPermission(Permission perm) {
		return this.getBukkitHandle().hasPermission(perm);
	}

	@Override
	public boolean isPermissionSet(String name) {
		return this.getBukkitHandle().isPermissionSet(name);
	}

	@Override
	public boolean isPermissionSet(Permission perm) {
		return this.getBukkitHandle().isPermissionSet(perm);
	}

	@Override
	public void recalculatePermissions() {
		this.getBukkitHandle().recalculatePermissions();
	}

	@Override
	public void removeAttachment(PermissionAttachment attachment) {
		this.getBukkitHandle().removeAttachment(attachment);
	}

	@Override
	public boolean isOp() {
		return this.getBukkitHandle().isOp();
	}

	@Override
	public void setOp(boolean value) {
		this.getBukkitHandle().setOp(value);
	}

	@Override
	public void closeInventory() {
		this.getBukkitHandle().closeInventory();
	}

	@Override
	public ItemStack getItemOnCursor() {
		return this.getBukkitHandle().getItemOnCursor();
	}

	@Override
	public InventoryView getOpenInventory() {
		return this.getBukkitHandle().getOpenInventory();
	}

	@Override
	public InventoryView openEnchanting(Location location, boolean force) {
		return this.getBukkitHandle().openEnchanting(location, force);
	}

	@Override
	public InventoryView openInventory(Inventory inventory) {
		return this.getBukkitHandle().openInventory(inventory);
	}

	@Override
	public void openInventory(InventoryView inventory) {
		this.getBukkitHandle().openInventory(inventory);
	}

	@Override
	public InventoryView openWorkbench(Location location, boolean force) {
		return this.getBukkitHandle().openWorkbench(location, force);
	}

	@Override
	public void setItemOnCursor(ItemStack item) {
		this.getBukkitHandle().setItemOnCursor(item);
	}

	@Override
	public boolean setWindowProperty(Property prop, int value) {
		return this.getBukkitHandle().setWindowProperty(prop, value);
	}

}
