package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaHumanEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;
import LizaCraft.Entity.LizaCraftEntity;

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
public class LizaCraftHumanEntity implements LizaHumanEntity {
	private HumanEntity humanEntity;
	
	/**
	 * LizaCraftHumanEntity Constructor
	 * 
	 * @param humanEntity A Bukkit HumanEntity
	 */
	public LizaCraftHumanEntity(HumanEntity humanEntity) {
		this.humanEntity = humanEntity;
	}

	@Override
	public GameMode getGameMode() {
		return this.humanEntity.getGameMode();
	}

	/**
	 * TODO: Change once LizaCraftPlayerInventory is implemented.
	 */
	@Override
	public PlayerInventory getInventory() {
		return this.humanEntity.getInventory();
	}

	@Override
	public ItemStack getItemInHand() {
		return this.humanEntity.getItemInHand();
	}

	@Override
	public String getName() {
		return this.humanEntity.getName();
	}

	@Override
	public int getSleepTicks() {
		return this.humanEntity.getSleepTicks();
	}

	@Override
	public boolean isSleeping() {
		return this.humanEntity.isSleeping();
	}

	@Override
	public void setGameMode(GameMode mode) {
		this.humanEntity.setGameMode(mode);
	}

	@Override
	public void setItemInHand(ItemStack item) {
		this.humanEntity.setItemInHand(item);
	}

	@Override
	public void damage(int amount) {
		this.humanEntity.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.humanEntity.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.humanEntity.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.humanEntity.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.humanEntity.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.humanEntity.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.humanEntity.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.humanEntity.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.humanEntity.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}
	
	@Override
	@Deprecated
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.humanEntity.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.humanEntity.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.humanEntity.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.humanEntity.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.humanEntity.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.humanEntity.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.humanEntity.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.humanEntity.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.humanEntity.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.humanEntity.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.humanEntity.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.humanEntity.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.humanEntity.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.humanEntity.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.humanEntity.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.humanEntity.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.humanEntity.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.humanEntity.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.humanEntity.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.humanEntity.eject();
	}

	@Override
	public int getEntityId() {
		return this.humanEntity.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.humanEntity.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.humanEntity.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.humanEntity.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.humanEntity.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.humanEntity.getMaxFireTicks();
	}

	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 */
	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.humanEntity.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.humanEntity.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.humanEntity.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.humanEntity.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.humanEntity.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.humanEntity.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.humanEntity.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.humanEntity.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.humanEntity.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.humanEntity.playEffect(type);
	}

	@Override
	public void remove() {
		this.humanEntity.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.humanEntity.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.humanEntity.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.humanEntity.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.humanEntity.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.humanEntity.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.humanEntity.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.humanEntity.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.humanEntity.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.humanEntity.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.humanEntity.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.humanEntity.getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLineOfSight, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.humanEntity.getLastTwoTargetBlocks(transparent,
				maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 * @return The result of getNearbyEntities, but as LizaEntities.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.humanEntity.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin) {
		return this.humanEntity.addAttachment(plugin);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		return this.humanEntity.addAttachment(plugin, ticks);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value) {
		return this.humanEntity.addAttachment(plugin, name, value);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value, int ticks) {
		return this.humanEntity.addAttachment(plugin, name, value, ticks);
	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return this.humanEntity.getEffectivePermissions();
	}

	@Override
	public boolean hasPermission(String name) {
		return this.humanEntity.hasPermission(name);
	}

	@Override
	public boolean hasPermission(Permission perm) {
		return this.humanEntity.hasPermission(perm);
	}

	@Override
	public boolean isPermissionSet(String name) {
		return this.humanEntity.isPermissionSet(name);
	}

	@Override
	public boolean isPermissionSet(Permission perm) {
		return this.humanEntity.isPermissionSet(perm);
	}

	@Override
	public void recalculatePermissions() {
		this.humanEntity.recalculatePermissions();
	}

	@Override
	public void removeAttachment(PermissionAttachment attachment) {
		this.humanEntity.removeAttachment(attachment);
	}

	@Override
	public boolean isOp() {
		return this.humanEntity.isOp();
	}

	@Override
	public void setOp(boolean value) {
		this.humanEntity.setOp(value);
	}

}
