/**
 * 
 */
package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaCreature;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 * @author geislekj
 *
 *  LizeCraftCreature is the Liza entity representation of
 *  the Bukkit Creature class.
 */
public class LizaCraftCreature implements LizaCreature{

	private Creature creature;
	
	/**
	 * LizaCraftEntity Constructor
	 * 
	 * @param entity This is a Bukkit entity 
	 */
	public LizaCraftCreature(Creature creature){
		this.creature = creature;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.creature.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.creature.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.creature.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.creature.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.creature.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.creature.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.creature.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.creature.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.creature.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.creature.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.creature.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.creature.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.creature.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.creature.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.creature.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.creature.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.creature.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.creature.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.creature.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.creature.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.creature.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.creature.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.creature.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.creature.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.creature.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.creature.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.creature.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.creature.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.creature.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.creature.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.creature.eject();
	}

	@Override
	public int getEntityId() {
		return this.creature.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.creature.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.creature.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.creature.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.creature.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.creature.getMaxFireTicks();
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
		List<Entity> el = this.creature.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.creature.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.creature.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.creature.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.creature.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.creature.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.creature.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.creature.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.creature.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.creature.playEffect(type);
	}

	@Override
	public void remove() {
		this.creature.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.creature.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.creature.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.creature.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.creature.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.creature.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.creature.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.creature.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.creature.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.creature.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.creature.teleport(destination, cause);
	}

}
