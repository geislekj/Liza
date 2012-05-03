package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.WaterMob;
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
import Liza.LizaWaterMob;
import Liza.LizaWorld;
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
	public LizaLivingEntity getTarget() {
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

	@Override
	public Location getEyeLocation() {
		return this.waterMob.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.waterMob.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.waterMob.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.waterMob.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.waterMob.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.waterMob.getLastTwoTargetBlocks(transparent,
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
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.waterMob.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
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
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.waterMob.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.waterMob.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.waterMob.throwSnowball());
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

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.waterMob.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.waterMob.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.waterMob.getMaxFireTicks();
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
		List<Entity> el = this.waterMob.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.waterMob.getPassenger());
	}

	@Override
	public LizaServer getServer() {
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

	@Override
	public Vector getVelocity() {
		return this.waterMob.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
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

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.waterMob.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.waterMob.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.waterMob.getNearbyEntities(x, y, z);
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
