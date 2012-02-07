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
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaVillager;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftVillager is the Liza entity representation of
 *  the Bukkit Villager class.
 *  
 *  @author collinbc
 */
public class LizaCraftVillager implements LizaVillager {
	private Villager villager;
	
	/**
	 * LizaCraftVillager Constructor
	 * 
	 * @param villager A Bukkit Villager
	 */
	public LizaCraftVillager(Villager villager) {
		this.villager = villager;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.villager.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.villager.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.villager.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.villager.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.villager.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.villager.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.villager.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.villager.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.villager.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.villager.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.villager.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.villager.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.villager.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.villager.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.villager.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.villager.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.villager.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.villager.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.villager.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.villager.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.villager.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.villager.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.villager.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.villager.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.villager.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.villager.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.villager.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.villager.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.villager.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.villager.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.villager.eject();
	}

	@Override
	public int getEntityId() {
		return this.villager.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.villager.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.villager.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.villager.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.villager.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.villager.getMaxFireTicks();
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
		List<Entity> el = this.villager.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.villager.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.villager.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.villager.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.villager.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.villager.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.villager.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.villager.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.villager.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.villager.playEffect(type);
	}

	@Override
	public void remove() {
		this.villager.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.villager.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.villager.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.villager.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.villager.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.villager.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.villager.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.villager.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.villager.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.villager.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.villager.teleport(destination, cause);
	}

}
