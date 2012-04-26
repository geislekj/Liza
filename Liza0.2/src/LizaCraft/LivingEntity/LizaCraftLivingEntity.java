package LizaCraft.LivingEntity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaBlock;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import LizaCraft.Block.LizaCraftBlock;
import LizaCraft.Entity.LizaCraftEntity;

/**
 * @author collinbc
 *
 *  LizaCraftLivingEntity is the Liza LivingEntity representation of
 *  the Bukkit LivingEntity class.
 *  
 *  TODO: Methods that return Bukkit classes that may later be implemented
 *  in Liza should be changed to use those interfaces and classes after
 *  they are created.
 */
public class LizaCraftLivingEntity implements LizaLivingEntity {
	private LivingEntity livingEntity;
	
	/**
	 * LizaCraftHumanEntity Constructor
	 * 
	 * @param humanEntity A Bukkit HumanEntity
	 */
	public LizaCraftLivingEntity(LivingEntity livingEntity) {
		this.livingEntity = livingEntity;
	}
	
	@Override
	public void damage(int arg0) {
		this.livingEntity.damage(arg0);
	}

	@Override
	public void damage(int arg0, Entity arg1) {
		this.livingEntity.damage(arg0, arg1);
	}

	@Override
	public double getEyeHeight() {
		return this.livingEntity.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean arg0) {
		return this.livingEntity.getEyeHeight(arg0);
	}

	@Override
	public Location getEyeLocation() {
		return this.livingEntity.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.livingEntity.getHealth();
	}

	@Override
	public Player getKiller() {
		return this.livingEntity.getKiller();
	}

	@Override
	public int getLastDamage() {
		return this.livingEntity.getLastDamage();
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> arg0, int arg1) {
		List<Block> bl = this.livingEntity.getLastTwoTargetBlocks(arg0, arg1);
		
		for(Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}
	
	/**
	 * @param arg0
	 * @param arg1
	 * @return The result of getLastTwoTargetBlocks, but as LizaBlocks.
	 * 
	 * TODO: Review this method.
	 */
	@Deprecated
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> arg0, int arg1) {
		List<Block> bl = this.livingEntity.getLastTwoTargetBlocks(arg0, arg1);
		Class<? extends List> c = bl.getClass();
		List<LizaBlock> lbl = null;
		try {
			lbl = c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Block b : bl) {
			lbl.add(new LizaCraftBlock(b));
		}
		return lbl;
	}

	// TODO: A method may be needed that will return type List<LizaBlock>.
	@Override
	public List<Block> getLineOfSight(HashSet<Byte> arg0, int arg1) {
		List<Block> bl = this.livingEntity.getLineOfSight(arg0, arg1);
		
		for(Block b : bl) {
			b = new LizaCraftBlock(b);
		}
		return bl;
	}

	@Override
	public int getMaxHealth() {
		return this.livingEntity.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.livingEntity.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.livingEntity.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.livingEntity.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.livingEntity.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> arg0, int arg1) {
		return new LizaCraftBlock(this.livingEntity.getTargetBlock(arg0, arg1));
	}

	@Override
	public Vehicle getVehicle() {
		return this.livingEntity.getVehicle();
	}

	@Override
	public boolean isInsideVehicle() {
		return this.livingEntity.isInsideVehicle();
	}

	@Override
	public boolean leaveVehicle() {
		return this.livingEntity.leaveVehicle();
	}

	@Override
	public void setHealth(int arg0) {
		this.livingEntity.setHealth(arg0);
	}

	@Override
	public void setLastDamage(int arg0) {
		this.livingEntity.setLastDamage(arg0);
	}

	@Override
	public void setMaximumAir(int arg0) {
		this.livingEntity.setMaximumAir(arg0);
	}

	@Override
	public void setMaximumNoDamageTicks(int arg0) {
		this.livingEntity.setMaximumNoDamageTicks(arg0);
	}

	@Override
	public void setNoDamageTicks(int arg0) {
		this.livingEntity.setNoDamageTicks(arg0);
	}

	@Override
	public void setRemainingAir(int arg0) {
		this.livingEntity.setRemainingAir(arg0);
	}

	@Override
	public Arrow shootArrow() {
		return this.livingEntity.shootArrow();
	}

	@Override
	public Egg throwEgg() {
		return this.livingEntity.throwEgg();
	}

	@Override
	public Snowball throwSnowball() {
		return this.livingEntity.throwSnowball();
	}

	@Override
	public boolean eject() {
		return this.livingEntity.eject();
	}

	@Override
	public int getEntityId() {
		return this.livingEntity.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.livingEntity.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.livingEntity.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.livingEntity.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.livingEntity.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.livingEntity.getFireTicks();
	}

	// TODO: A method may be needed that will return type List<LizaEntity>.
	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		List<Entity> el = this.livingEntity.getNearbyEntities(arg0, arg1, arg2);
		
		for(Entity e : el) {
			e = new LizaCraftEntity(e);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.livingEntity.getPassenger());
	}

	@Override
	public Server getServer() {
		return this.livingEntity.getServer();
	}

	@Override
	public int getTicksLived() {
		return this.livingEntity.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.livingEntity.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.livingEntity.getVelocity();
	}

	@Override
	public World getWorld() {
		return this.livingEntity.getWorld();
	}

	@Override
	public boolean isDead() {
		return this.livingEntity.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.livingEntity.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		this.livingEntity.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.livingEntity.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.livingEntity.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.livingEntity.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.livingEntity.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.livingEntity.setPassenger(arg0);
	}

	@Override
	public void setTicksLived(int arg0) {
		this.livingEntity.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.livingEntity.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.livingEntity.teleport(arg0);
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.livingEntity.teleport(arg0);
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.livingEntity.teleport(arg0, arg1);
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.livingEntity.teleport(arg0, arg1);
	}

	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		// TODO Auto-generated method stub
		return null;
	}

}
