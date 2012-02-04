package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftChicken;
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

import Liza.LizaChicken;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 * @author collinbc
 *
 *  LizaCraftChicken is the Liza entity representation of
 *  the Bukkit CraftChicken class.
 */
public class LizaCraftChicken implements LizaChicken {
	private CraftChicken chicken;

	public LizaCraftChicken(CraftChicken chicken) {
		this.chicken = chicken;
	}

	@Override
	public boolean canBreed() {
		return this.chicken.canBreed();
	}

	@Override
	public int getAge() {
		return this.chicken.getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.chicken.getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.chicken.isAdult();
	}

	@Override
	public void setAdult() {
		this.chicken.setAdult();
	}

	@Override
	public void setAge(int age) {
		this.chicken.setAge(age);
	}

	@Override
	public void setAgeLock(boolean lock) {
		this.chicken.setAgeLock(lock);
	}

	@Override
	public void setBaby() {
		this.chicken.setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.chicken.setBreed(breed);
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.chicken.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.chicken.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.chicken.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.chicken.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.chicken.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.chicken.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.chicken.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.chicken.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.chicken.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.chicken.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.chicken.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.chicken.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.chicken.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.chicken.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.chicken.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.chicken.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.chicken.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.chicken.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.chicken.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.chicken.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.chicken.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.chicken.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.chicken.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.chicken.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.chicken.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.chicken.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.chicken.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.chicken.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.chicken.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.chicken.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.chicken.eject();
	}

	@Override
	public int getEntityId() {
		return this.chicken.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.chicken.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.chicken.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.chicken.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.chicken.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.chicken.getMaxFireTicks();
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
		List<Entity> el = this.chicken.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.chicken.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.chicken.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.chicken.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.chicken.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.chicken.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.chicken.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.chicken.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.chicken.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.chicken.playEffect(type);
	}

	@Override
	public void remove() {
		this.chicken.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.chicken.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.chicken.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.chicken.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.chicken.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.chicken.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.chicken.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.chicken.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.chicken.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.chicken.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.chicken.teleport(destination, cause);
	}

}
