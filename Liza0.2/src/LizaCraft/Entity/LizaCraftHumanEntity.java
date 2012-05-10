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

// TODO: Auto-generated Javadoc
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
	 * LizaCraftHumanEntity Constructor.
	 *
	 * @param humanEntity A Bukkit HumanEntity
	 */
	public LizaCraftHumanEntity(HumanEntity humanEntity) {
		super(humanEntity);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftLivingEntity#getBukkitHandle()
	 */
	@Override
	public HumanEntity getBukkitHandle() {
		return (HumanEntity) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#getGameMode()
	 */
	@Override
	public GameMode getGameMode() {
		return this.getBukkitHandle().getGameMode();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#getInventory()
	 */
	@Override
	public PlayerInventory getInventory() {
		return this.getBukkitHandle().getInventory();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#getItemInHand()
	 */
	@Override
	public ItemStack getItemInHand() {
		return this.getBukkitHandle().getItemInHand();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#getName()
	 */
	@Override
	public String getName() {
		return this.getBukkitHandle().getName();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#getSleepTicks()
	 */
	@Override
	public int getSleepTicks() {
		return this.getBukkitHandle().getSleepTicks();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#isSleeping()
	 */
	@Override
	public boolean isSleeping() {
		return this.getBukkitHandle().isSleeping();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#setGameMode(org.bukkit.GameMode)
	 */
	@Override
	public void setGameMode(GameMode mode) {
		this.getBukkitHandle().setGameMode(mode);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#setItemInHand(org.bukkit.inventory.ItemStack)
	 */
	@Override
	public void setItemInHand(ItemStack item) {
		this.getBukkitHandle().setItemInHand(item);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#addAttachment(org.bukkit.plugin.Plugin)
	 */
	@Override
	public PermissionAttachment addAttachment(Plugin plugin) {
		return this.getBukkitHandle().addAttachment(plugin);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#addAttachment(org.bukkit.plugin.Plugin, int)
	 */
	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		return this.getBukkitHandle().addAttachment(plugin, ticks);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#addAttachment(org.bukkit.plugin.Plugin, java.lang.String, boolean)
	 */
	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value) {
		return this.getBukkitHandle().addAttachment(plugin, name, value);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#addAttachment(org.bukkit.plugin.Plugin, java.lang.String, boolean, int)
	 */
	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value, int ticks) {
		return this.getBukkitHandle().addAttachment(plugin, name, value, ticks);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#getEffectivePermissions()
	 */
	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return this.getBukkitHandle().getEffectivePermissions();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#hasPermission(java.lang.String)
	 */
	@Override
	public boolean hasPermission(String name) {
		return this.getBukkitHandle().hasPermission(name);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#hasPermission(org.bukkit.permissions.Permission)
	 */
	@Override
	public boolean hasPermission(Permission perm) {
		return this.getBukkitHandle().hasPermission(perm);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#isPermissionSet(java.lang.String)
	 */
	@Override
	public boolean isPermissionSet(String name) {
		return this.getBukkitHandle().isPermissionSet(name);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#isPermissionSet(org.bukkit.permissions.Permission)
	 */
	@Override
	public boolean isPermissionSet(Permission perm) {
		return this.getBukkitHandle().isPermissionSet(perm);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#recalculatePermissions()
	 */
	@Override
	public void recalculatePermissions() {
		this.getBukkitHandle().recalculatePermissions();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.Permissible#removeAttachment(org.bukkit.permissions.PermissionAttachment)
	 */
	@Override
	public void removeAttachment(PermissionAttachment attachment) {
		this.getBukkitHandle().removeAttachment(attachment);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.ServerOperator#isOp()
	 */
	@Override
	public boolean isOp() {
		return this.getBukkitHandle().isOp();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.permissions.ServerOperator#setOp(boolean)
	 */
	@Override
	public void setOp(boolean value) {
		this.getBukkitHandle().setOp(value);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#closeInventory()
	 */
	@Override
	public void closeInventory() {
		this.getBukkitHandle().closeInventory();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#getItemOnCursor()
	 */
	@Override
	public ItemStack getItemOnCursor() {
		return this.getBukkitHandle().getItemOnCursor();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#getOpenInventory()
	 */
	@Override
	public InventoryView getOpenInventory() {
		return this.getBukkitHandle().getOpenInventory();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#openEnchanting(org.bukkit.Location, boolean)
	 */
	@Override
	public InventoryView openEnchanting(Location location, boolean force) {
		return this.getBukkitHandle().openEnchanting(location, force);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#openInventory(org.bukkit.inventory.Inventory)
	 */
	@Override
	public InventoryView openInventory(Inventory inventory) {
		return this.getBukkitHandle().openInventory(inventory);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#openInventory(org.bukkit.inventory.InventoryView)
	 */
	@Override
	public void openInventory(InventoryView inventory) {
		this.getBukkitHandle().openInventory(inventory);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#openWorkbench(org.bukkit.Location, boolean)
	 */
	@Override
	public InventoryView openWorkbench(Location location, boolean force) {
		return this.getBukkitHandle().openWorkbench(location, force);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#setItemOnCursor(org.bukkit.inventory.ItemStack)
	 */
	@Override
	public void setItemOnCursor(ItemStack item) {
		this.getBukkitHandle().setItemOnCursor(item);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.HumanEntity#setWindowProperty(org.bukkit.inventory.InventoryView.Property, int)
	 */
	@Override
	public boolean setWindowProperty(Property prop, int value) {
		return this.getBukkitHandle().setWindowProperty(prop, value);
	}

}
