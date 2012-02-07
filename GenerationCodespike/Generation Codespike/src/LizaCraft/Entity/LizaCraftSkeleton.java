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
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaSkeleton;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftSkeleton is the Liza entity representation of
 *  the Bukkit Skeleton class.
 *  
 *  @author collinbc
 */
public class LizaCraftSkeleton implements LizaSkeleton {
	private Skeleton skeleton;
	
	/**
	 * LizaCraftSkeleton Constructor
	 * 
	 * @param skeleton A Bukkit Skeleton
	 */
	public LizaCraftSkeleton(Skeleton skeleton) {
		this.skeleton = skeleton;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.skeleton.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.skeleton.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.skeleton.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.skeleton.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.skeleton.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.skeleton.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.skeleton.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.skeleton.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.skeleton.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.skeleton.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.skeleton.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.skeleton.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.skeleton.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.skeleton.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.skeleton.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.skeleton.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.skeleton.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.skeleton.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.skeleton.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.skeleton.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.skeleton.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.skeleton.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.skeleton.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.skeleton.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.skeleton.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.skeleton.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.skeleton.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.skeleton.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.skeleton.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.skeleton.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.skeleton.eject();
	}

	@Override
	public int getEntityId() {
		return this.skeleton.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.skeleton.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.skeleton.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.skeleton.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.skeleton.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.skeleton.getMaxFireTicks();
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
		List<Entity> el = this.skeleton.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.skeleton.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.skeleton.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.skeleton.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.skeleton.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.skeleton.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.skeleton.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.skeleton.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.skeleton.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.skeleton.playEffect(type);
	}

	@Override
	public void remove() {
		this.skeleton.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.skeleton.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.skeleton.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.skeleton.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.skeleton.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.skeleton.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.skeleton.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.skeleton.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.skeleton.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.skeleton.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.skeleton.teleport(destination, cause);
	}

}
