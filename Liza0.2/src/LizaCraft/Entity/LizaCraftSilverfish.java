package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Silverfish;
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
import Liza.LizaSilverfish;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftSilverfish is the Liza entity representation of
 *  the Bukkit Silverfish class.
 *  
 *  @author collinbc
 */
public class LizaCraftSilverfish implements LizaSilverfish {
	private Silverfish silverfish;
	
	/**
	 * LizaCraftSilverfish Constructor
	 * 
	 * @param silverfish A Bukkit Silverfish
	 */
	public LizaCraftSilverfish(Silverfish silverfish) {
		this.silverfish = silverfish;
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.silverfish.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.silverfish.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.silverfish.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.silverfish.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.silverfish.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.silverfish.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.silverfish.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.silverfish.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.silverfish.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.silverfish.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.silverfish.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.silverfish.getLastTwoTargetBlocks(transparent,
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
		return this.silverfish.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.silverfish.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.silverfish.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.silverfish.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.silverfish.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.silverfish.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.silverfish.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.silverfish.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.silverfish.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.silverfish.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.silverfish.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.silverfish.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.silverfish.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.silverfish.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.silverfish.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.silverfish.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.silverfish.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.silverfish.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.silverfish.eject();
	}

	@Override
	public int getEntityId() {
		return this.silverfish.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.silverfish.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.silverfish.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.silverfish.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.silverfish.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.silverfish.getMaxFireTicks();
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
		List<Entity> el = this.silverfish.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.silverfish.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.silverfish.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.silverfish.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.silverfish.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.silverfish.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.silverfish.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.silverfish.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.silverfish.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.silverfish.playEffect(type);
	}

	@Override
	public void remove() {
		this.silverfish.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.silverfish.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.silverfish.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.silverfish.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.silverfish.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.silverfish.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.silverfish.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.silverfish.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.silverfish.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.silverfish.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.silverfish.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.silverfish.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.silverfish.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.silverfish.getNearbyEntities(x, y, z);
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
