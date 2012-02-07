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
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaSnowman;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftMonster is the Liza entity representation of
 *  the Bukkit Monster class.
 *  
 *  @author collinbc
 */
public class LizaCraftSnowman implements LizaSnowman {
	private Snowman snowman;
	
	/**
	 * LizaCraftsnowman Constructor
	 * 
	 * @param snowman A Bukkit snowman
	 */
	public LizaCraftSnowman(Snowman snowman) {
		this.snowman = snowman;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.snowman.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.snowman.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.snowman.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.snowman.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.snowman.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.snowman.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.snowman.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.snowman.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.snowman.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.snowman.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.snowman.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.snowman.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.snowman.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.snowman.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.snowman.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.snowman.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.snowman.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.snowman.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.snowman.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.snowman.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.snowman.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.snowman.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.snowman.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.snowman.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.snowman.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.snowman.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.snowman.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.snowman.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.snowman.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.snowman.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.snowman.eject();
	}

	@Override
	public int getEntityId() {
		return this.snowman.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.snowman.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.snowman.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.snowman.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.snowman.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.snowman.getMaxFireTicks();
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
		List<Entity> el = this.snowman.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.snowman.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.snowman.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.snowman.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.snowman.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.snowman.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.snowman.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.snowman.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.snowman.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.snowman.playEffect(type);
	}

	@Override
	public void remove() {
		this.snowman.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.snowman.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.snowman.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.snowman.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.snowman.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.snowman.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.snowman.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.snowman.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.snowman.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.snowman.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.snowman.teleport(destination, cause);
	}

}
