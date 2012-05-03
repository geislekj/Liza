package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Skeleton;
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
import Liza.LizaSkeleton;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftSkeleton is the Liza entity representation of
 *  the Bukkit Skeleton class.
 *  
 *  @author collinbc
 */
public class LizaCraftSkeleton implements LizaSkeleton {
	private Skeleton skeleton;
	
	/**
	 * LizaCraftSkeleton Constructor
	 * 
	 * @param skeleton A Bukkit Skeleton
	 */
	public LizaCraftSkeleton(Skeleton skeleton) {
		this.skeleton = skeleton;
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.skeleton.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.skeleton.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.skeleton.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.skeleton.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.skeleton.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.skeleton.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.skeleton.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.skeleton.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.skeleton.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.skeleton.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.skeleton.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.skeleton.getLastTwoTargetBlocks(transparent,
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
		return this.skeleton.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.skeleton.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.skeleton.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.skeleton.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.skeleton.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.skeleton.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.skeleton.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.skeleton.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.skeleton.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.skeleton.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.skeleton.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.skeleton.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.skeleton.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.skeleton.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.skeleton.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.skeleton.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.skeleton.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.skeleton.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.skeleton.eject();
	}

	@Override
	public int getEntityId() {
		return this.skeleton.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.skeleton.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.skeleton.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.skeleton.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.skeleton.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.skeleton.getMaxFireTicks();
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
		List<Entity> el = this.skeleton.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.skeleton.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.skeleton.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.skeleton.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.skeleton.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.skeleton.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.skeleton.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.skeleton.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.skeleton.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.skeleton.playEffect(type);
	}

	@Override
	public void remove() {
		this.skeleton.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.skeleton.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.skeleton.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.skeleton.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.skeleton.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.skeleton.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.skeleton.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.skeleton.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.skeleton.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.skeleton.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.skeleton.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.skeleton.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.skeleton.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.skeleton.getNearbyEntities(x, y, z);
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
