package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEnderDragon;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftEnderDragon is the Liza entity representation of
 *  the Bukkit EnderDragon class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderDragon implements LizaEnderDragon {
	private EnderDragon enderDragon;
	
	/**
	 * LizaCraftEnderDragon Constructor
	 * 
	 * @param ynderDragon A Bukkit EnderDragon
	 */
	public LizaCraftEnderDragon(EnderDragon enderDragon) {
		this.enderDragon = enderDragon;
	}

	@Override
	public Set<ComplexEntityPart> getParts() {
		Set<ComplexEntityPart> parts = this.enderDragon.getParts();
		for (ComplexEntityPart part : parts) {
			part = new LizaCraftComplexEntityPart(part);
		}
		return parts;
	}

	@Override
	public void damage(int amount) {
		this.enderDragon.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.enderDragon.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.enderDragon.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.enderDragon.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.enderDragon.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.enderDragon.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.enderDragon.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.enderDragon.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.enderDragon.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.enderDragon.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.enderDragon.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.enderDragon.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.enderDragon.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.enderDragon.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.enderDragon.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.enderDragon.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.enderDragon.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.enderDragon.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.enderDragon.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.enderDragon.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.enderDragon.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.enderDragon.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.enderDragon.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.enderDragon.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.enderDragon.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.enderDragon.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.enderDragon.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.enderDragon.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.enderDragon.eject();
	}

	@Override
	public int getEntityId() {
		return this.enderDragon.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.enderDragon.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.enderDragon.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.enderDragon.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.enderDragon.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.enderDragon.getMaxFireTicks();
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
		List<Entity> el = this.enderDragon.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.enderDragon.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.enderDragon.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.enderDragon.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.enderDragon.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.enderDragon.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.enderDragon.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.enderDragon.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.enderDragon.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.enderDragon.playEffect(type);
	}

	@Override
	public void remove() {
		this.enderDragon.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.enderDragon.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.enderDragon.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.enderDragon.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.enderDragon.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.enderDragon.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.enderDragon.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.enderDragon.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.enderDragon.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.enderDragon.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.enderDragon.teleport(destination, cause);
	}

}
