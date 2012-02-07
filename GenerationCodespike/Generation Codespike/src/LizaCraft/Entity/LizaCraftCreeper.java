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
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaCreeper;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftCreeper is the Liza entity representation of
 *  the Bukkit Creeper class.
 *  
 *  @author collinbc
 */
public class LizaCraftCreeper implements LizaCreeper {
	private Creeper creeper;
	
	/**
	 * LizaCraftCreeper Constructor
	 * 
	 * @param creeper A Bukkit Creeper
	 */
	public LizaCraftCreeper(Creeper creeper) {
		this.creeper = creeper;
	}
	
	@Override
	public boolean isPowered() {
		return this.creeper.isPowered();
	}

	@Override
	public void setPowered(boolean powered) {
		this.creeper.setPowered(powered);
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.creeper.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.creeper.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.creeper.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.creeper.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.creeper.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.creeper.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.creeper.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.creeper.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.creeper.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.creeper.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.creeper.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.creeper.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.creeper.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.creeper.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.creeper.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.creeper.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.creeper.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.creeper.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.creeper.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.creeper.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.creeper.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.creeper.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.creeper.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.creeper.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.creeper.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.creeper.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.creeper.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.creeper.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.creeper.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.creeper.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.creeper.eject();
	}

	@Override
	public int getEntityId() {
		return this.creeper.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.creeper.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.creeper.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.creeper.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.creeper.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.creeper.getMaxFireTicks();
	}

	/**
	 * TODO: A method may be needed that will return type List<LizaEntity>.
	 * 
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 */
	@Override
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.creeper.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.creeper.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.creeper.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.creeper.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.creeper.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.creeper.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.creeper.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.creeper.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.creeper.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.creeper.playEffect(type);
	}

	@Override
	public void remove() {
		this.creeper.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.creeper.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.creeper.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.creeper.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.creeper.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.creeper.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.creeper.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.creeper.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.creeper.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.creeper.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.creeper.teleport(destination, cause);
	}

}
