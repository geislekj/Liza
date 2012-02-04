package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftCow;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaCow;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 * @author collinbc
 * 
 *  LizaCraftCow is the Liza entity representation of
 *  the Bukkit CraftCow class.
 */
public class LizaCraftCow implements LizaCow {
	private CraftCow cow;

	public LizaCraftCow(CraftCow cow) {
		this.cow = cow;
	}

	@Override
	public boolean canBreed() {
		return this.cow.canBreed();
	}

	@Override
	public int getAge() {
		return this.cow.getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.cow.getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.cow.isAdult();
	}

	@Override
	public void setAdult() {
		this.cow.setAdult();
	}

	@Override
	public void setAge(int age) {
		this.cow.setAge(age);
	}

	@Override
	public void setAgeLock(boolean lock) {
		this.cow.setAgeLock(lock);
	}

	@Override
	public void setBaby() {
		this.cow.setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.cow.setBreed(breed);
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.cow.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.cow.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.cow.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.cow.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.cow.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.cow.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.cow.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.cow.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.cow.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.cow.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.cow.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.cow.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.cow.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.cow.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.cow.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.cow.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.cow.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.cow.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.cow.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.cow.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.cow.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.cow.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.cow.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.cow.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.cow.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.cow.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.cow.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.cow.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.cow.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.cow.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.cow.eject();
	}

	@Override
	public int getEntityId() {
		return this.cow.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.cow.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.cow.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.cow.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.cow.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.cow.getMaxFireTicks();
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
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.cow.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.cow.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.cow.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.cow.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.cow.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.cow.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.cow.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.cow.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.cow.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.cow.playEffect(type);
	}

	@Override
	public void remove() {
		this.cow.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.cow.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.cow.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.cow.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.cow.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.cow.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.cow.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.cow.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.cow.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.cow.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.cow.teleport(destination, cause);
	}

}
