package LizaCraft.HumanEntity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import Liza.LizaBlock;
import Liza.LizaHumanEntity;
import LizaCraft.Block.LizaCraftBlock;
import LizaCraft.Entity.LizaCraftEntity;

/**
 * @author collinbc
 *
 *  LizaCraftHumanEntity is the Liza HumanEntity representation of
 *  the Bukkit HumanEntity class.
 *  
 *  TODO: Methods that return Bukkit classes that may later be implemented
 *  in Liza should be changed to use those interfaces and classes after
 *  they are created.
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
	public void setGameMode(GameMode arg0) {
		this.humanEntity.setGameMode(arg0);
	}

	@Override
	public void setItemInHand(ItemStack arg0) {
		this.humanEntity.setItemInHand(arg0);
	}

	@Override
	public void damage(int arg0) {
		this.humanEntity.damage(arg0);
	}

	@Override
	public void damage(int arg0, Entity arg1) {
		this.humanEntity.damage(arg0, arg1);
	}

	@Override
	public double getEyeHeight() {
		return this.humanEntity.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean arg0) {
		return this.humanEntity.getEyeHeight();
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
	public Player getKiller() {
		return this.humanEntity.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.humanEntity.getLastDamage();
	}

	// TODO: The methods should return List<LizaBlock>, so changes are needed.
	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> arg0, int arg1) {
		return this.humanEntity.getLastTwoTargetBlocks(arg0, arg1);
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> arg0, int arg1) {
		return this.humanEntity.getLineOfSight(arg0, arg1);
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
	public LizaBlock getTargetBlock(HashSet<Byte> arg0, int arg1) {
		return new LizaCraftBlock(this.humanEntity.getTargetBlock(arg0, arg1));
	}

	@Override
	public Vehicle getVehicle() {
		return this.humanEntity.getVehicle();
	}

	@Override
	public boolean isInsideVehicle() {
		return this.humanEntity.isInsideVehicle();
	}

	@Override
	public boolean leaveVehicle() {
		return this.humanEntity.leaveVehicle();
	}

	@Override
	public void setHealth(int arg0) {
		this.humanEntity.setHealth(arg0);
	}

	@Override
	public void setLastDamage(int arg0) {
		this.humanEntity.setLastDamage(arg0);
	}

	@Override
	public void setMaximumAir(int arg0) {
		this.humanEntity.setMaximumAir(arg0);
	}

	@Override
	public void setMaximumNoDamageTicks(int arg0) {
		this.humanEntity.setMaximumNoDamageTicks(arg0);
	}

	@Override
	public void setNoDamageTicks(int arg0) {
		this.humanEntity.setNoDamageTicks(arg0);
	}

	@Override
	public void setRemainingAir(int arg0) {
		this.humanEntity.setRemainingAir(arg0);
	}

	@Override
	public Arrow shootArrow() {
		return this.humanEntity.shootArrow();
	}

	@Override
	public Egg throwEgg() {
		return this.humanEntity.throwEgg();
	}

	@Override
	public Snowball throwSnowball() {
		return this.humanEntity.throwSnowball();
	}

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

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.humanEntity.getNearbyEntities(arg0, arg1, arg2);
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.humanEntity.getPassenger());
	}

	@Override
	public Server getServer() {
		return this.humanEntity.getServer();
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
	public World getWorld() {
		return this.humanEntity.getWorld();
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
	public void playEffect(EntityEffect arg0) {
		this.humanEntity.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.humanEntity.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.humanEntity.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.humanEntity.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.humanEntity.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.humanEntity.setPassenger(arg0);
	}

	@Override
	public void setTicksLived(int arg0) {
		this.humanEntity.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.humanEntity.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.humanEntity.teleport(arg0);
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.humanEntity.teleport(arg0);
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.humanEntity.teleport(arg0, arg1);
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.humanEntity.teleport(arg0, arg1);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0) {
		return this.humanEntity.addAttachment(arg0);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
		return this.humanEntity.addAttachment(arg0, arg1);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1,
			boolean arg2) {
		return this.humanEntity.addAttachment(arg0, arg1, arg2);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1,
			boolean arg2, int arg3) {
		return this.humanEntity.addAttachment(arg0, arg1, arg2, arg3);
	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return this.humanEntity.getEffectivePermissions();
	}

	@Override
	public boolean hasPermission(String arg0) {
		return this.humanEntity.hasPermission(arg0);
	}

	@Override
	public boolean hasPermission(Permission arg0) {
		return this.humanEntity.hasPermission(arg0);
	}

	@Override
	public boolean isPermissionSet(String arg0) {
		return this.humanEntity.isPermissionSet(arg0);
	}

	@Override
	public boolean isPermissionSet(Permission arg0) {
		return this.humanEntity.isPermissionSet(arg0);
	}

	@Override
	public void recalculatePermissions() {
		this.humanEntity.recalculatePermissions();
	}

	@Override
	public void removeAttachment(PermissionAttachment arg0) {
		this.humanEntity.removeAttachment(arg0);
	}

	@Override
	public boolean isOp() {
		return this.humanEntity.isOp();
	}

	@Override
	public void setOp(boolean arg0) {
		this.humanEntity.setOp(arg0);
	}

}
