package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MushroomCow;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaMushroomCow;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftMushroomCow is the Liza entity representation of
 *  the Bukkit MushroomCow class.
 *  
 *  @author collinbc
 */
public class LizaCraftMushroomCow implements LizaMushroomCow {
	private MushroomCow mooshroom;

	/**
	 * LizaCraftMushroomCow Constructor
	 * 
	 * @param mooshroom A Bukkit MushroomCow
	 */
	public LizaCraftMushroomCow(MushroomCow mooshroom) {
		this.mooshroom = mooshroom;
	}

	@Override
	public boolean canBreed() {
		return this.mooshroom.canBreed();
	}

	@Override
	public int getAge() {
		return this.mooshroom.getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.mooshroom.getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.mooshroom.isAdult();
	}

	@Override
	public void setAdult() {
		this.mooshroom.setAdult();
	}

	@Override
	public void setAge(int age) {
		this.mooshroom.setAge(age);
	}

	@Override
	public void setAgeLock(boolean lock) {
		this.mooshroom.setAgeLock(lock);
	}

	@Override
	public void setBaby() {
		this.mooshroom.setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.mooshroom.setBreed(breed);
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.mooshroom.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.mooshroom.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.mooshroom.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.mooshroom.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.mooshroom.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.mooshroom.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.mooshroom.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.mooshroom.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.mooshroom.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.mooshroom.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.mooshroom.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		return bl;
	}
	
	@Override
	@Deprecated
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.mooshroom.getLastTwoTargetBlocks(transparent,
				maxDistance);

		for (Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.mooshroom.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.mooshroom.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.mooshroom.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.mooshroom.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.mooshroom.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.mooshroom.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.mooshroom.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.mooshroom.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.mooshroom.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.mooshroom.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.mooshroom.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.mooshroom.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.mooshroom.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.mooshroom.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.mooshroom.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.mooshroom.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.mooshroom.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.mooshroom.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.mooshroom.eject();
	}

	@Override
	public int getEntityId() {
		return this.mooshroom.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.mooshroom.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.mooshroom.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.mooshroom.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.mooshroom.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.mooshroom.getMaxFireTicks();
	}

	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 */
	@Override
	@Deprecated
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		List<Entity> el = this.mooshroom.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.mooshroom.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.mooshroom.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.mooshroom.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.mooshroom.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.mooshroom.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.mooshroom.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.mooshroom.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.mooshroom.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.mooshroom.playEffect(type);
	}

	@Override
	public void remove() {
		this.mooshroom.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.mooshroom.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.mooshroom.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.mooshroom.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.mooshroom.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.mooshroom.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.mooshroom.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.mooshroom.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.mooshroom.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.mooshroom.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.mooshroom.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.mooshroom.getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLineOfSight, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.mooshroom.getLastTwoTargetBlocks(transparent,
				maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	/**
	 * @param x
	 *            Size of the box along x axis
	 * @param y
	 *            Size of the box along y axis
	 * @param z
	 *            Size of the box along z axis
	 * @return The result of getNearbyEntities, but as LizaEntities.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.mooshroom.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}
}
