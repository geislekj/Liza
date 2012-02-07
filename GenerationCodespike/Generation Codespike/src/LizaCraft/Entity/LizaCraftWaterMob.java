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
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.entity.WaterMob;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaWaterMob;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftWaterMob is the Liza entity representation of
 *  the Bukkit WaterMob class.
 *  
 *  @author collinbc
 */
public class LizaCraftWaterMob implements LizaWaterMob {
	private WaterMob waterMob;
	
	/**
	 * LizaCraftWaterMob Constructor
	 * 
	 * @param waterMob A Bukkit WaterMob
	 */
	public LizaCraftWaterMob(WaterMob waterMob){
		this.waterMob = waterMob;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.waterMob.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.waterMob.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.waterMob.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.waterMob.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.waterMob.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.waterMob.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.waterMob.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.waterMob.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.waterMob.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.waterMob.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.waterMob.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.waterMob.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.waterMob.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.waterMob.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.waterMob.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.waterMob.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.waterMob.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.waterMob.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.waterMob.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.waterMob.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.waterMob.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.waterMob.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.waterMob.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.waterMob.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.waterMob.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.waterMob.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.waterMob.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.waterMob.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.waterMob.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.waterMob.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.waterMob.eject();
	}

	@Override
	public int getEntityId() {
		return this.waterMob.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.waterMob.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.waterMob.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.waterMob.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.waterMob.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.waterMob.getMaxFireTicks();
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
		List<Entity> el = this.waterMob.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.waterMob.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.waterMob.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.waterMob.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.waterMob.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.waterMob.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.waterMob.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.waterMob.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.waterMob.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.waterMob.playEffect(type);
	}

	@Override
	public void remove() {
		this.waterMob.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.waterMob.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.waterMob.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.waterMob.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.waterMob.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.waterMob.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.waterMob.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.waterMob.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.waterMob.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.waterMob.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.waterMob.teleport(destination, cause);
	}

}
