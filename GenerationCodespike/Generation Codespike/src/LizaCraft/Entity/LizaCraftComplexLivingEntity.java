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
import org.bukkit.entity.ComplexLivingEntity;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaComplexLivingEntity;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftComplexLivingEntity is the Liza entity representation of
 *  the Bukkit ComplexLivingEntity class.
 *  
 *  @author collinbc
 */
public class LizaCraftComplexLivingEntity implements LizaComplexLivingEntity {
	private ComplexLivingEntity cle;
	
	/**
	 * LizaCraftComplexLivingEntity Constructor
	 * 
	 * @param cle A Bukkit ComplexLivingEntity
	 */
	public LizaCraftComplexLivingEntity(ComplexLivingEntity cle) {
		this.cle = cle;
	}

	@Override
	public Set<ComplexEntityPart> getParts() {
		Set<ComplexEntityPart> parts = this.cle.getParts();
		for (ComplexEntityPart part : parts) {
			part = new LizaCraftComplexEntityPart(part);
		}
		return parts;
	}

	@Override
	public void damage(int amount) {
		this.cle.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.cle.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.cle.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.cle.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.cle.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.cle.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.cle.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.cle.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.cle.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.cle.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.cle.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.cle.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.cle.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.cle.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.cle.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.cle.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.cle.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.cle.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.cle.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.cle.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.cle.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.cle.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.cle.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.cle.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.cle.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.cle.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.cle.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.cle.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.cle.eject();
	}

	@Override
	public int getEntityId() {
		return this.cle.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.cle.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.cle.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.cle.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.cle.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.cle.getMaxFireTicks();
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
		List<Entity> el = this.cle.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.cle.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.cle.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.cle.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.cle.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.cle.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.cle.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.cle.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.cle.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.cle.playEffect(type);
	}

	@Override
	public void remove() {
		this.cle.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.cle.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.cle.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.cle.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.cle.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.cle.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.cle.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.cle.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.cle.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.cle.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.cle.teleport(destination, cause);
	}

}
