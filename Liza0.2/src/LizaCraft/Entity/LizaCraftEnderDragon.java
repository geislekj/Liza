package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaComplexEntityPart;
import Liza.LizaEgg;
import Liza.LizaEnderDragon;
import Liza.LizaEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftEnderDragon is the Liza entity representation of
 *  the Bukkit EnderDragon class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderDragon implements LizaEnderDragon {
	private EnderDragon enderDragon;
	
	/**
	 * LizaCraftEnderDragon Constructor
	 * 
	 * @param ynderDragon A Bukkit EnderDragon
	 */
	public LizaCraftEnderDragon(EnderDragon enderDragon) {
		this.enderDragon = enderDragon;
	}

	@Override
	@Deprecated
	public Set<ComplexEntityPart> getParts() {
		Set<ComplexEntityPart> parts = this.enderDragon.getParts();
		for (ComplexEntityPart part : parts) {
			part = new LizaCraftComplexEntityPart(part);
		}
		return parts;
	}

	@Override
	public void damage(int amount) {
		this.enderDragon.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.enderDragon.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.enderDragon.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.enderDragon.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.enderDragon.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.enderDragon.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.enderDragon.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.enderDragon.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.enderDragon.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.enderDragon.getLastTwoTargetBlocks(transparent,
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
		return this.enderDragon.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.enderDragon.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.enderDragon.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.enderDragon.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.enderDragon.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.enderDragon.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.enderDragon.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.enderDragon.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.enderDragon.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.enderDragon.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.enderDragon.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.enderDragon.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.enderDragon.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.enderDragon.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.enderDragon.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.enderDragon.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.enderDragon.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.enderDragon.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.enderDragon.eject();
	}

	@Override
	public int getEntityId() {
		return this.enderDragon.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.enderDragon.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.enderDragon.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.enderDragon.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.enderDragon.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.enderDragon.getMaxFireTicks();
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
		List<Entity> el = this.enderDragon.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.enderDragon.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.enderDragon.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.enderDragon.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.enderDragon.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.enderDragon.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.enderDragon.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.enderDragon.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.enderDragon.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.enderDragon.playEffect(type);
	}

	@Override
	public void remove() {
		this.enderDragon.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.enderDragon.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.enderDragon.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.enderDragon.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.enderDragon.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.enderDragon.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.enderDragon.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.enderDragon.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.enderDragon.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.enderDragon.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.enderDragon.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.enderDragon.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.enderDragon.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.enderDragon.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Set<LizaComplexEntityPart> getPartsLiza() {
		Set<ComplexEntityPart> parts = this.enderDragon.getParts();
		Set<LizaComplexEntityPart> lizaParts;

		for(ComplexEntityPart p : parts) {
			parts.remove(p);
			LizaComplexEntityPart lp = new LizaCraftComplexEntityPart(p);
			parts.add(lp);
		}
		lizaParts = (Set) parts;
		return lizaParts;
	}
}
