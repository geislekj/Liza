package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.NPC;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaNPC;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftnpc is the Liza entity representation of
 *  the Bukkit npc class.
 *  
 *  @author collinbc
 */
public class LizaCraftNPC implements LizaNPC {
	private NPC npc;
	
	/**
	 * LizaCraftnpc Constructor
	 * 
	 * @param npc A Bukkit NPC
	 */
	public LizaCraftNPC(NPC npc) {
		this.npc = npc;
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.npc.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.npc.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.npc.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.npc.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.npc.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.npc.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.npc.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.npc.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.npc.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.npc.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.npc.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.npc.getLastTwoTargetBlocks(transparent,
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
		return this.npc.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.npc.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.npc.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.npc.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.npc.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.npc.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public LizaVehicle getVehicle() {
		return new LizaCraftVehicle(this.npc.getVehicle());
	}

	@Override
	public boolean isInsideVehicle() {
		return this.npc.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.npc.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.npc.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.npc.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.npc.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.npc.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.npc.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.npc.setRemainingAir(ticks);
	}

	@Override
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.npc.shootArrow());
	}

	@Override
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.npc.throwEgg());
	}

	@Override
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.npc.throwSnowball());
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean eject() {
		return this.npc.eject();
	}

	@Override
	public int getEntityId() {
		return this.npc.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.npc.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.npc.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.npc.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.npc.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.npc.getMaxFireTicks();
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
		List<Entity> el = this.npc.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.npc.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.npc.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.npc.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.npc.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.npc.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.npc.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.npc.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.npc.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.npc.playEffect(type);
	}

	@Override
	public void remove() {
		this.npc.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.npc.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.npc.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.npc.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.npc.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.npc.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.npc.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.npc.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.npc.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.npc.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.npc.teleport(destination, cause);
	}

	/**
	 * @param transparent
	 * @param maxDistance
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.npc.getLastTwoTargetBlocks(transparent, maxDistance);
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
		List<Block> bl = this.npc.getLastTwoTargetBlocks(transparent,
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
		List<Entity> el = this.npc.getNearbyEntities(x, y, z);
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
