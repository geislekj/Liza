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
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaGhast;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftGhast is the Liza entity representation of
 *  the Bukkit Ghast class.
 *  
 *  @author collinbc
 */
public class LizaCraftGhast implements LizaGhast {
	private Ghast ghast;
	
	/**
	 * LizaCraftGhast Constructor
	 * 
	 * @param ghast A Bukkit Ghast
	 */
	public LizaCraftGhast(Ghast ghast) {
		this.ghast = ghast;
	}

	@Override
	public void damage(int amount) {
		this.ghast.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.ghast.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.ghast.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.ghast.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.ghast.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.ghast.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.ghast.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.ghast.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.ghast.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.ghast.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.ghast.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.ghast.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.ghast.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.ghast.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.ghast.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.ghast.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.ghast.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.ghast.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.ghast.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.ghast.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.ghast.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.ghast.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.ghast.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.ghast.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.ghast.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.ghast.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.ghast.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.ghast.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.ghast.eject();
	}

	@Override
	public int getEntityId() {
		return this.ghast.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.ghast.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.ghast.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.ghast.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.ghast.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.ghast.getMaxFireTicks();
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
		List<Entity> el = this.ghast.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.ghast.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.ghast.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.ghast.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.ghast.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.ghast.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.ghast.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.ghast.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.ghast.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.ghast.playEffect(type);
	}

	@Override
	public void remove() {
		this.ghast.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.ghast.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.ghast.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.ghast.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.ghast.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.ghast.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.ghast.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.ghast.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.ghast.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.ghast.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.ghast.teleport(destination, cause);
	}

}
