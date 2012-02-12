package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Flying;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaFlying;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftFlying is the Liza entity representation of
 *  the Bukkit Flying class.
 *  
 *  @author collinbc
 */
public class LizaCraftFlying implements LizaFlying {
	private Flying flying;
	
	/**
	 * LizaCraftFlying Constructor
	 * 
	 * @param flying A Bukkit Flying
	 */
	public LizaCraftFlying(Flying flying) {
		this.flying = flying;
	}

	@Override
	public void damage(int amount) {
		this.flying.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.flying.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.flying.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.flying.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.flying.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.flying.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.flying.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.flying.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.flying.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.flying.getLastTwoTargetBlocks(transparent,
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
		return this.flying.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.flying.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.flying.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.flying.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.flying.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.flying.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.flying.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.flying.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.flying.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.flying.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.flying.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.flying.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.flying.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.flying.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.flying.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.flying.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.flying.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.flying.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.flying.eject();
	}

	@Override
	public int getEntityId() {
		return this.flying.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.flying.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.flying.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.flying.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.flying.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.flying.getMaxFireTicks();
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
		List<Entity> el = this.flying.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.flying.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.flying.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.flying.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.flying.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.flying.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.flying.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.flying.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.flying.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.flying.playEffect(type);
	}

	@Override
	public void remove() {
		this.flying.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.flying.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.flying.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.flying.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.flying.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.flying.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.flying.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.flying.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.flying.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.flying.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.flying.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.flying.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.flying.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.flying.getNearbyEntities(x, y, z);
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
