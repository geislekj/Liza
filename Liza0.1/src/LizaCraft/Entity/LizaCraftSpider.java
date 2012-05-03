package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Spider;
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
import Liza.LizaSpider;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftSpider is the Liza entity representation of
 *  the Bukkit Spider class.
 *  
 *  @author collinbc
 */
public class LizaCraftSpider implements LizaSpider {
	private Spider spider;
	
	/**
	 * LizaCraftSpider Constructor
	 * 
	 * @param spider A Bukkit Spider
	 */
	public LizaCraftSpider(Spider spider) {
		this.spider = spider;
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.spider.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.spider.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.spider.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.spider.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.spider.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.spider.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.spider.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.spider.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.spider.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.spider.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.spider.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.spider.getLastTwoTargetBlocks(transparent,
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
		return this.spider.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.spider.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.spider.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.spider.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.spider.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.spider.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.spider.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.spider.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.spider.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.spider.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.spider.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.spider.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.spider.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.spider.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.spider.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.spider.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.spider.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.spider.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.spider.eject();
	}

	@Override
	public int getEntityId() {
		return this.spider.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.spider.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.spider.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.spider.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.spider.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.spider.getMaxFireTicks();
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
		List<Entity> el = this.spider.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.spider.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.spider.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.spider.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.spider.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.spider.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.spider.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.spider.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.spider.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.spider.playEffect(type);
	}

	@Override
	public void remove() {
		this.spider.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.spider.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.spider.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.spider.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.spider.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.spider.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.spider.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.spider.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.spider.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.spider.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.spider.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.spider.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.spider.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.spider.getNearbyEntities(x, y, z);
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
