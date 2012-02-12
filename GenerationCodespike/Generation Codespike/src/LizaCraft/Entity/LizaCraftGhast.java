package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Ghast;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaGhast;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftGhast is the Liza entity representation of
 *  the Bukkit Ghast class.
 *  
 *  @author collinbc
 */
public class LizaCraftGhast implements LizaGhast {
	private Ghast ghast;
	
	/**
	 * LizaCraftGhast Constructor
	 * 
	 * @param ghast A Bukkit Ghast
	 */
	public LizaCraftGhast(Ghast ghast) {
		this.ghast = ghast;
	}

	@Override
	public void damage(int amount) {
		this.ghast.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.ghast.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.ghast.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.ghast.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.ghast.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.ghast.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.ghast.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.ghast.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.ghast.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.ghast.getLastTwoTargetBlocks(transparent,
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
		return this.ghast.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.ghast.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.ghast.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.ghast.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.ghast.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.ghast.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.ghast.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.ghast.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.ghast.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.ghast.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.ghast.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.ghast.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.ghast.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.ghast.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.ghast.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.ghast.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.ghast.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.ghast.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.ghast.eject();
	}

	@Override
	public int getEntityId() {
		return this.ghast.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.ghast.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.ghast.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.ghast.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.ghast.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.ghast.getMaxFireTicks();
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
		List<Entity> el = this.ghast.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.ghast.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.ghast.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.ghast.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.ghast.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.ghast.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.ghast.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.ghast.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.ghast.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.ghast.playEffect(type);
	}

	@Override
	public void remove() {
		this.ghast.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.ghast.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.ghast.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.ghast.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.ghast.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.ghast.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.ghast.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.ghast.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.ghast.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.ghast.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.ghast.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.ghast.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.ghast.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.ghast.getNearbyEntities(x, y, z);
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
