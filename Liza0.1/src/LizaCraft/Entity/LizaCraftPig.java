package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftPig;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPig;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftPig is the Liza entity representation of
 *  the Bukkit CraftPig class.
 *  
 * @author collinbc
 */
public class LizaCraftPig implements LizaPig {
	private CraftPig pig;

	/**
	 * LizaCraftPig Constructor
	 * 
	 * @param pig A Bukkit Pig
	 */
	public LizaCraftPig(CraftPig pig) {
		this.pig = pig;
	}

	@Override
	public boolean canBreed() {
		return this.pig.canBreed();
	}

	@Override
	public int getAge() {
		return this.pig.getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.pig.getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.pig.isAdult();
	}

	@Override
	public void setAdult() {
		this.pig.setAdult();
	}

	@Override
	public void setAge(int age) {
		this.pig.setAge(age);
	}

	@Override
	public void setAgeLock(boolean lock) {
		this.pig.setAgeLock(lock);
	}

	@Override
	public void setBaby() {
		this.pig.setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.pig.setBreed(breed);
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.pig.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.pig.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.pig.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.pig.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.pig.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.pig.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.pig.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.pig.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.pig.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.pig.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.pig.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.pig.getLastTwoTargetBlocks(transparent,
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
		return this.pig.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.pig.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.pig.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.pig.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.pig.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.pig.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.pig.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.pig.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.pig.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.pig.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.pig.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.pig.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.pig.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.pig.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.pig.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.pig.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.pig.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.pig.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.pig.eject();
	}

	@Override
	public int getEntityId() {
		return this.pig.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.pig.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.pig.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.pig.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.pig.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.pig.getMaxFireTicks();
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
		List<Entity> el = this.pig.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.pig.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.pig.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.pig.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.pig.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.pig.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.pig.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.pig.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.pig.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.pig.playEffect(type);
	}

	@Override
	public void remove() {
		this.pig.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.pig.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.pig.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.pig.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.pig.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.pig.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.pig.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.pig.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.pig.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.pig.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.pig.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.pig.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.pig.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.pig.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}

	@Override
	public boolean hasSaddle() {
		return this.pig.hasSaddle();
	}

	@Override
	public void setSaddle(boolean saddled) {
		this.pig.setSaddle(saddled);
	}

}
