package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlaze;
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
 * LizaCraftBlaze is the Liza entity representation of
 *  the Bukkit Blaze class.
 *  
 *  @author collinbc
 */
public class LizaCraftBlaze implements LizaBlaze {
	private Blaze blaze;
	
	/**
	 * LizaCraftBlaze Constructor
	 * 
	 * @param blaze A Bukkit Blaze
	 */
	public LizaCraftBlaze(Blaze blaze) {
		this.blaze = blaze;
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.blaze.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.blaze.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.blaze.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.blaze.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.blaze.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.blaze.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.blaze.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.blaze.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.blaze.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.blaze.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.blaze.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.blaze.getLastTwoTargetBlocks(transparent,
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
		return this.blaze.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.blaze.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.blaze.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.blaze.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.blaze.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.blaze.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.blaze.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.blaze.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.blaze.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.blaze.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.blaze.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.blaze.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.blaze.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.blaze.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.blaze.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.blaze.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.blaze.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.blaze.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.blaze.eject();
	}

	@Override
	public int getEntityId() {
		return this.blaze.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.blaze.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.blaze.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.blaze.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.blaze.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.blaze.getMaxFireTicks();
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
		List<Entity> el = this.blaze.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.blaze.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.blaze.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.blaze.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.blaze.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.blaze.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.blaze.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.blaze.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.blaze.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.blaze.playEffect(type);
	}

	@Override
	public void remove() {
		this.blaze.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.blaze.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.blaze.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.blaze.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.blaze.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.blaze.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.blaze.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.blaze.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.blaze.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.blaze.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.blaze.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.blaze.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.blaze.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.blaze.getNearbyEntities(x, y, z);
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
