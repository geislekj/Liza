package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.material.MaterialData;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEnderman;
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
 *  LizaCraftEnderman is the Liza entity representation of
 *  the Bukkit Enderman class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderman implements LizaEnderman {
	private Enderman enderman;
	
	/**
	 * LizaCraftSpider Constructor
	 * 
	 * @param spider A Bukkit Spider
	 */
	public LizaCraftEnderman(Enderman enderman) {
		this.enderman = enderman;
	}
	
	@Override
	public MaterialData getCarriedMaterial() {
		return this.enderman.getCarriedMaterial();
	}

	@Override
	public void setCarriedMaterial(MaterialData material) {
		this.enderman.setCarriedMaterial(material);
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.enderman.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.enderman.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.enderman.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.enderman.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.enderman.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.enderman.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.enderman.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.enderman.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.enderman.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.enderman.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.enderman.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.enderman.getLastTwoTargetBlocks(transparent,
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
		return this.enderman.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.enderman.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.enderman.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.enderman.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.enderman.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.enderman.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.enderman.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.enderman.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.enderman.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.enderman.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.enderman.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.enderman.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.enderman.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.enderman.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.enderman.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.enderman.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.enderman.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.enderman.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.enderman.eject();
	}

	@Override
	public int getEntityId() {
		return this.enderman.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.enderman.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.enderman.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.enderman.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.enderman.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.enderman.getMaxFireTicks();
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
		List<Entity> el = this.enderman.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.enderman.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.enderman.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.enderman.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.enderman.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.enderman.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.enderman.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.enderman.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.enderman.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.enderman.playEffect(type);
	}

	@Override
	public void remove() {
		this.enderman.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.enderman.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.enderman.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.enderman.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.enderman.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.enderman.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.enderman.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.enderman.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.enderman.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.enderman.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.enderman.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.enderman.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.enderman.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.enderman.getNearbyEntities(x, y, z);
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
