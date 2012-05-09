package LizaCraft.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlaze;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 * LizaCraftBlaze is the Liza entity representation of
 *  the Bukkit Blaze class.
 *  
 *  @author collinbc
 */
public class LizaCraftBlaze implements LizaBlaze {
	private Blaze blaze;
	
	/**
	 * LizaCraftBlaze Constructor
	 * 
	 * @param blaze A Bukkit Blaze
	 */
	public LizaCraftBlaze(Blaze blaze) {
		this.blaze = blaze;
	}
	
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.blaze.getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl = new ArrayList<LizaBlock>();

		for(Block b : bl) {
			lbl.add(new LizaCraftBlock(b));
		}
		
		return lbl;
	}
	
	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.blaze.getLastTwoTargetBlocks(transparent,
				maxDistance);
		List<LizaBlock> lbl = new ArrayList<LizaBlock>();

		for(Block b : bl) {
			lbl.add(new LizaCraftBlock(b));
		}
		
		return lbl;
	}
	
	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.blaze.getNearbyEntities(x, y, z);
		List<LizaEntity> lel = new ArrayList<LizaEntity>();

		for(Entity e : el) {
			lel.add(new LizaCraftEntity(e));
		}
		
		return lel;
	}

	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.blaze.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.blaze.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.blaze.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.blaze.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.blaze.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.blaze.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.blaze.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.blaze.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.blaze.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.blaze.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.blaze.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.blaze.getLastTwoTargetBlocks(transparent,
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
		return this.blaze.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.blaze.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.blaze.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.blaze.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.blaze.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.blaze.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public boolean isInsideVehicle() {
		return this.blaze.isInsideVehicle();
	}

	@Override
	public boolean leaveVehicle() {
		return this.blaze.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.blaze.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.blaze.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.blaze.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.blaze.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.blaze.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.blaze.setRemainingAir(ticks);
	}

	@Override
	@Deprecated
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.blaze.shootArrow());
	}

	@Override
	@Deprecated
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.blaze.throwEgg());
	}

	@Override
	@Deprecated
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.blaze.throwSnowball());
	}

	@Override
	public boolean eject() {
		return this.blaze.eject();
	}

	@Override
	public int getEntityId() {
		return this.blaze.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.blaze.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.blaze.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.blaze.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.blaze.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.blaze.getMaxFireTicks();
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
		List<Entity> el = this.blaze.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.blaze.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.blaze.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.blaze.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.blaze.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.blaze.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.blaze.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.blaze.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.blaze.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.blaze.playEffect(type);
	}

	@Override
	public void remove() {
		this.blaze.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.blaze.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.blaze.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.blaze.setLastDamageCause(event);
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		return this.blaze.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.blaze.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.blaze.setVelocity(vel);
	}

	@Override
	public boolean teleport(Location location) {
		return this.blaze.teleport(location);
	}

	@Override
	public boolean teleport(Entity destination) {
		return this.blaze.teleport(destination);
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.blaze.teleport(location, cause);
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.blaze.teleport(destination, cause);
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect) {
		return this.blaze.addPotionEffect(effect);
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect, boolean force) {
		return this.blaze.addPotionEffect(effect, force);
	}

	@Override
	public boolean addPotionEffects(Collection<PotionEffect> effects) {
		return this.blaze.addPotionEffects(effects);
	}

	@Override
	public Collection<PotionEffect> getActivePotionEffects() {
		return this.blaze.getActivePotionEffects();
	}

	@Override
	public boolean hasPotionEffect(PotionEffectType type) {
		return this.blaze.hasPotionEffect(type);
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
		return this.blaze.launchProjectile(projectile);
	}

	@Override
	public void removePotionEffect(PotionEffectType type) {
		this.blaze.removePotionEffect(type);
	}

	@Override
	public EntityType getType() {
		return this.blaze.getType();
	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.blaze.getMetadata(metadataKey);
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.blaze.hasMetadata(metadataKey);
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin plugin) {
		this.blaze.removeMetadata(metadataKey, plugin);
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		this.blaze.setMetadata(metadataKey, newMetadataValue);
	}

	@Override
	public LizaEntity getVehicle() {
		return new LizaCraftEntity(this.blaze.getVehicle());
	}
}
