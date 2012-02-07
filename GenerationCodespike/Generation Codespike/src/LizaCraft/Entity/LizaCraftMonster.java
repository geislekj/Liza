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
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaMonster;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftMonster is the Liza entity representation of
 *  the Bukkit Monster class.
 *  
 *  @author collinbc
 */
public class LizaCraftMonster implements LizaMonster {
	private Monster monster;
	
	/**
	 * LizaCraftMonster Constructor
	 * 
	 * @param monster A Bukkit Monster
	 */
	public LizaCraftMonster(Monster monster) {
		this.monster = monster;
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.monster.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.monster.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.monster.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.monster.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.monster.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.monster.getEyeHeight(ignoreSneaking);
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getEyeLocation() {
		return this.monster.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.monster.getHealth();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Player getKiller() {
		return this.monster.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.monster.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.monster.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.monster.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.monster.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.monster.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.monster.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.monster.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.monster.getRemainingAir();
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.monster.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public Vehicle getVehicle() {
		return new LizaCraftVehicle(this.monster.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.monster.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.monster.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.monster.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.monster.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.monster.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.monster.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.monster.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.monster.setRemainingAir(ticks);
	}

	@Override
	public Arrow shootArrow() {
		return new LizaCraftArrow(this.monster.shootArrow());
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Egg throwEgg() {
		return this.monster.throwEgg();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Snowball throwSnowball() {
		return this.monster.throwSnowball();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.monster.eject();
	}

	@Override
	public int getEntityId() {
		return this.monster.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.monster.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.monster.getFireTicks();
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.monster.getLastDamageCause();
	}

	/**
	 * TODO: Change once LizaCraftLocation is implemented.
	 */
	@Override
	public Location getLocation() {
		return this.monster.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.monster.getMaxFireTicks();
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
		List<Entity> el = this.monster.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public Entity getPassenger() {
		return new LizaCraftEntity(this.monster.getPassenger());
	}

	/**
	 * TODO: Review this method.
	 */
	@Override
	public Server getServer() {
		return new LizaCraftServer(this.monster.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.monster.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.monster.getUniqueId();
	}

	/**
	 * TODO: Change if LizaCraftVector is implemented.
	 */
	@Override
	public Vector getVelocity() {
		return this.monster.getVelocity();
	}

	@Override
	public World getWorld() {
		return new LizaCraftWorld(this.monster.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.monster.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.monster.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.monster.playEffect(type);
	}

	@Override
	public void remove() {
		this.monster.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.monster.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.monster.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.monster.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.monster.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.monster.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.monster.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.monster.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.monster.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.monster.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.monster.teleport(destination, cause);
	}

}
