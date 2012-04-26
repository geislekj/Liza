package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaCreeper;
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
 *  LizaCraftCreeper is the Liza entity representation of
 *  the Bukkit Creeper class.
 *  
 *  @author collinbc
 */
public class LizaCraftCreeper implements LizaCreeper {
	private Creeper creeper;
	
	/**
	 * LizaCraftCreeper Constructor
	 * 
	 * @param creeper A Bukkit Creeper
	 */
	public LizaCraftCreeper(Creeper creeper) {
		this.creeper = creeper;
	}
	
	@Override
	public boolean isPowered() {
		return this.creeper.isPowered();
	}

	@Override
	public void setPowered(boolean powered) {
		this.creeper.setPowered(powered);
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.creeper.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.creeper.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.creeper.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.creeper.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.creeper.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.creeper.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.creeper.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.creeper.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.creeper.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.creeper.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.creeper.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.creeper.getLastTwoTargetBlocks(transparent,
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
		return this.creeper.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.creeper.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.creeper.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.creeper.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.creeper.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.creeper.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.creeper.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.creeper.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.creeper.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.creeper.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.creeper.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.creeper.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.creeper.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.creeper.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.creeper.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.creeper.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.creeper.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.creeper.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.creeper.eject();
	}

	@Override
	public int getEntityId() {
		return this.creeper.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.creeper.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.creeper.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.creeper.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.creeper.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.creeper.getMaxFireTicks();
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
		List<Entity> el = this.creeper.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.creeper.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.creeper.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.creeper.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.creeper.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.creeper.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.creeper.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.creeper.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.creeper.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.creeper.playEffect(type);
	}

	@Override
	public void remove() {
		this.creeper.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.creeper.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.creeper.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.creeper.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.creeper.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.creeper.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.creeper.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.creeper.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.creeper.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.creeper.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.creeper.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.creeper.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.creeper.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.creeper.getNearbyEntities(x, y, z);
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
