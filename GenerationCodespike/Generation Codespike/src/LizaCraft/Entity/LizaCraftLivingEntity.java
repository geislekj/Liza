package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
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
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftLivingEntity is the Liza entity representation of
 *  the Bukkit LivingEntity class.
 *  
 *  DONE: Methods that return Bukkit classes that may later be implemented
 *  in Liza should be changed to use those interfaces and classes after
 *  they are created.
 *  
 *  @author collinbc
 */
public class LizaCraftLivingEntity implements LizaLivingEntity {
	private LivingEntity livingEntity;
	
	/**
	 * LizaCraftLivingEntity Constructor
	 * 
	 * @param livingEntity A Bukkit LivingEntity
	 */
	public LizaCraftLivingEntity(LivingEntity livingEntity) {
		this.livingEntity = livingEntity;
	}
	
	@Override
	public void damage(int amount) {
		this.livingEntity.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.livingEntity.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.livingEntity.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.livingEntity.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.livingEntity.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.livingEntity.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.livingEntity.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.livingEntity.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.livingEntity.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.livingEntity.getLastTwoTargetBlocks(transparent,
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
		return this.livingEntity.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.livingEntity.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.livingEntity.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.livingEntity.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.livingEntity.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.livingEntity.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.livingEntity.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.livingEntity.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.livingEntity.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.livingEntity.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.livingEntity.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.livingEntity.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.livingEntity.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.livingEntity.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.livingEntity.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.livingEntity.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.livingEntity.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.livingEntity.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.livingEntity.eject();
	}

	@Override
	public int getEntityId() {
		return this.livingEntity.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.livingEntity.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.livingEntity.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.livingEntity.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.livingEntity.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.livingEntity.getMaxFireTicks();
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
		List<Entity> el = this.livingEntity.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.livingEntity.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.livingEntity.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.livingEntity.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.livingEntity.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.livingEntity.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.livingEntity.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.livingEntity.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.livingEntity.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.livingEntity.playEffect(type);
	}

	@Override
	public void remove() {
		this.livingEntity.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.livingEntity.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.livingEntity.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.livingEntity.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.livingEntity.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.livingEntity.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.livingEntity.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.livingEntity.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.livingEntity.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.livingEntity.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.livingEntity.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.livingEntity.getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl;
/*
 * Don't do this.
		Class<? extends List> c = bl.getClass();
		try {
			lbl = c.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
 */
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
		List<Block> bl = this.livingEntity.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.livingEntity.getNearbyEntities(x, y, z);
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
