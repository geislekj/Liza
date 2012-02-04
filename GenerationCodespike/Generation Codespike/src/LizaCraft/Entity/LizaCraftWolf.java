package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftWolf;
import org.bukkit.entity.AnimalTamer;
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

import Liza.LizaWolf;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 * @author collinbc
 * 
 *  LizaCraftWolf is the Liza entity representation of
 *  the Bukkit CraftWolf class.
 */
public class LizaCraftWolf implements LizaWolf {
	private CraftWolf wolf;

	public LizaCraftWolf(CraftWolf wolf) {
		this.wolf = wolf;
	}

	@Override
	public boolean isAngry() {
		return this.wolf.isAngry();
	}

	@Override
	public boolean isSitting() {
		return this.wolf.isSitting();
	}

	@Override
	public void setAngry(boolean angry) {
		this.wolf.setAngry(angry);
	}

	@Override
	public void setSitting(boolean sitting) {
		this.wolf.setSitting(sitting);
	}

	@Override
	public boolean canBreed() {
		return this.wolf.canBreed();
	}

	@Override
	public int getAge() {
		return this.wolf.getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.wolf.getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.wolf.isAdult();
	}

	@Override
	public void setAdult() {
		this.wolf.setAdult();
	}

	@Override
	public void setAge(int age) {
		this.wolf.setAge(age);
	}

	@Override
	public void setAgeLock(boolean lock) {
		this.wolf.setAgeLock(lock);
	}

	@Override
	public void setBaby() {
		this.wolf.setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.wolf.setBreed(breed);
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.wolf.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.wolf.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.wolf.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.wolf.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.wolf.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.wolf.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.wolf.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.wolf.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.wolf.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.wolf.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.wolf.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.wolf.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.wolf.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.wolf.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.wolf.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.wolf.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.wolf.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.wolf.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.wolf.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.wolf.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.wolf.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.wolf.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.wolf.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.wolf.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.wolf.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.wolf.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.wolf.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.wolf.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.wolf.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.wolf.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.wolf.eject();
	}

	@Override
	public int getEntityId() {
		return this.wolf.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.wolf.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.wolf.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.wolf.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.wolf.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.wolf.getMaxFireTicks();
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
		List<Entity> el = this.wolf.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.wolf.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.wolf.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.wolf.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.wolf.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.wolf.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.wolf.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.wolf.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.wolf.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.wolf.playEffect(type);
	}

	@Override
	public void remove() {
		this.wolf.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.wolf.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.wolf.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.wolf.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.wolf.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.wolf.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.wolf.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.wolf.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.wolf.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.wolf.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.wolf.teleport(destination, cause);
	}

	@Override
	public AnimalTamer getOwner() {
		return this.wolf.getOwner();
	}

	@Override
	public boolean isTamed() {
		return this.wolf.isTamed();
	}

	@Override
	public void setOwner(AnimalTamer tamer) {
		this.wolf.setOwner(tamer);
	}

	@Override
	public void setTamed(boolean tame) {
		this.wolf.setTamed(tame);
	}

}
