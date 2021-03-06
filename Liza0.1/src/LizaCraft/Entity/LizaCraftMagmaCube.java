package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.MagmaCube;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaMagmaCube;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftMagmaCube is the Liza entity representation of
 *  the Bukkit MagmaCube class.
 *  
 *  @author collinbc
 */
public class LizaCraftMagmaCube implements LizaMagmaCube {
	private MagmaCube magmaCube;
	
	/**
	 * LizaCraftMagmaCube Constructor
	 * 
	 * @param magmaCube A Bukkit MagmaCube
	 */
	public LizaCraftMagmaCube(MagmaCube magmaCube) {
		this.magmaCube = magmaCube;
	}
	
	@Override
	public int getSize() {
		return this.magmaCube.getSize();
	}

	@Override
	public void setSize(int size) {
		this.magmaCube.setSize(size);
	}

	@Override
	public void damage(int amount) {
		this.magmaCube.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.magmaCube.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.magmaCube.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.magmaCube.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.magmaCube.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.magmaCube.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.magmaCube.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.magmaCube.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.magmaCube.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.magmaCube.getLastTwoTargetBlocks(transparent,
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
		return this.magmaCube.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.magmaCube.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.magmaCube.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.magmaCube.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.magmaCube.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.magmaCube.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.magmaCube.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.magmaCube.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.magmaCube.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.magmaCube.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.magmaCube.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.magmaCube.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.magmaCube.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.magmaCube.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.magmaCube.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.magmaCube.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.magmaCube.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.magmaCube.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.magmaCube.eject();
	}

	@Override
	public int getEntityId() {
		return this.magmaCube.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.magmaCube.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.magmaCube.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.magmaCube.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.magmaCube.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.magmaCube.getMaxFireTicks();
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
		List<Entity> el = this.magmaCube.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.magmaCube.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.magmaCube.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.magmaCube.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.magmaCube.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.magmaCube.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.magmaCube.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.magmaCube.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.magmaCube.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.magmaCube.playEffect(type);
	}

	@Override
	public void remove() {
		this.magmaCube.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.magmaCube.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.magmaCube.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.magmaCube.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.magmaCube.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.magmaCube.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.magmaCube.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.magmaCube.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.magmaCube.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.magmaCube.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.magmaCube.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.magmaCube.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.magmaCube.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.magmaCube.getNearbyEntities(x, y, z);
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
