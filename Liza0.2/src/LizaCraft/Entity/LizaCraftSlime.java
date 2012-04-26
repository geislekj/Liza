package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Slime;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSlime;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftSlime is the Liza entity representation of
 *  the Bukkit Slime class.
 *  
 *  @author collinbc
 */
public class LizaCraftSlime implements LizaSlime {
	private Slime slime;
	
	/**
	 * LizaCraftSlime Constructor
	 * 
	 * @param slime A Bukkit Slime
	 */
	public LizaCraftSlime(Slime slime) {
		this.slime = slime;
	}
	
	@Override
	public int getSize() {
		return this.slime.getSize();
	}

	@Override
	public void setSize(int size) {
		this.slime.setSize(size);
	}

	@Override
	public void damage(int amount) {
		this.slime.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.slime.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.slime.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.slime.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.slime.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.slime.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.slime.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.slime.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.slime.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.slime.getLastTwoTargetBlocks(transparent,
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
		return this.slime.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.slime.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.slime.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.slime.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.slime.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.slime.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.slime.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.slime.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.slime.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.slime.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.slime.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.slime.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.slime.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.slime.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.slime.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.slime.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.slime.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.slime.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.slime.eject();
	}

	@Override
	public int getEntityId() {
		return this.slime.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.slime.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.slime.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.slime.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.slime.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.slime.getMaxFireTicks();
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
		List<Entity> el = this.slime.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.slime.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.slime.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.slime.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.slime.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.slime.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.slime.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.slime.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.slime.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.slime.playEffect(type);
	}

	@Override
	public void remove() {
		this.slime.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.slime.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.slime.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.slime.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.slime.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.slime.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.slime.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.slime.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.slime.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.slime.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.slime.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.slime.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.slime.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.slime.getNearbyEntities(x, y, z);
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
