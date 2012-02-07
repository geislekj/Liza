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
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaSilverfish;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftSilverfish is the Liza entity representation of
 *  the Bukkit Silverfish class.
 *  
 *  @author collinbc
 */
public class LizaCraftSilverfish implements LizaSilverfish {
	private Silverfish silverfish;
	
	/**
	 * LizaCraftSilverfish Constructor
	 * 
	 * @param silverfish A Bukkit Silverfish
	 */
	public LizaCraftSilverfish(Silverfish silverfish) {
		this.silverfish = silverfish;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.silverfish.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.silverfish.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.silverfish.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.silverfish.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.silverfish.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.silverfish.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.silverfish.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.silverfish.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.silverfish.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.silverfish.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.silverfish.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.silverfish.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.silverfish.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.silverfish.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.silverfish.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.silverfish.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.silverfish.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.silverfish.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.silverfish.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.silverfish.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.silverfish.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.silverfish.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.silverfish.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.silverfish.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.silverfish.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.silverfish.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.silverfish.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.silverfish.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.silverfish.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.silverfish.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.silverfish.eject();
	}

	@Override
	public int getEntityId() {
		return this.silverfish.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.silverfish.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.silverfish.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.silverfish.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.silverfish.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.silverfish.getMaxFireTicks();
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
		List<Entity> el = this.silverfish.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.silverfish.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.silverfish.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.silverfish.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.silverfish.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.silverfish.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.silverfish.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.silverfish.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.silverfish.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.silverfish.playEffect(type);
	}

	@Override
	public void remove() {
		this.silverfish.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.silverfish.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.silverfish.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.silverfish.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.silverfish.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.silverfish.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.silverfish.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.silverfish.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.silverfish.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.silverfish.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.silverfish.teleport(destination, cause);
	}

}
