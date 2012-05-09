package LizaCraft.Entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftAnimals;
import org.bukkit.entity.Animals;
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

import Liza.LizaAnimals;
import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
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
 *  LizaCraftAnimals is the Liza entity representation of
 *  the Bukkit CraftAnimals class.
 *  
 * @author collinbc
 */
public class LizaCraftAnimals extends LizaCraftEntity implements LizaAnimals {

	/**
	 * LizaCraftAnimals Constructor
	 * 
	 * @param animal A Bukkit Animals
	 */
	public LizaCraftAnimals(CraftAnimals animal) {
		super(animal);
	}
	
	@Override
	public Animals getBukkitEntity() {
		return (Animals)this.entity;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.animal.getLastTwoTargetBlocks(transparent, maxDistance);
		List<LizaBlock> lbl;

		for(Block b : bl) {
			bl.remove(b);
			LizaBlock lb = new LizaCraftBlock(b);
			bl.add(lb);
		}
		lbl = (List) bl;
		
		return lbl;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent, int maxDistance) {
		List<Block> bl = this.animal.getLastTwoTargetBlocks(transparent,
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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LizaEntity> getNearbyLizaEntities(double x, double y, double z) {
		List<Entity> el = this.animal.getNearbyEntities(x, y, z);
		List<LizaEntity> lel;

		for(Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		lel = (List) el;
		
		return lel;
	}

	
	@Override
	public boolean canBreed() {
		return this.animal.canBreed();
	}

	@Override
	public int getAge() {
		return this.animal.getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.animal.getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.animal.isAdult();
	}

	@Override
	public void setAdult() {
		this.animal.setAdult();
	}

	@Override
	public void setAge(int age) {
		this.animal.setAge(age);
	}

	@Override
	public void setAgeLock(boolean lock) {
		this.animal.setAgeLock(lock);
	}

	@Override
	public void setBaby() {
		this.animal.setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.animal.setBreed(breed);
	}

	@Override
	public LivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.animal.getTarget());
	}

	@Override
	public void setTarget(LivingEntity target) {
		this.animal.setTarget(target);
	}

	@Override
	public void damage(int amount) {
		this.animal.damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		this.animal.damage(amount, source);
	}

	@Override
	public double getEyeHeight() {
		return this.animal.getEyeHeight();
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return this.animal.getEyeHeight(ignoreSneaking);
	}

	@Override
	public Location getEyeLocation() {
		return this.animal.getEyeLocation();
	}

	@Override
	public int getHealth() {
		return this.animal.getHealth();
	}


	@Override
	public LizaPlayer getKiller() {
		return new LizaCraftPlayer(this.animal.getKiller());
	}

	@Override
	public int getLastDamage() {
		return this.animal.getLastDamage();
	}

	@Override
	@Deprecated
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		List<Block> bl = this.animal.getLastTwoTargetBlocks(transparent,
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
		List<Block> bl = this.animal.getLastTwoTargetBlocks(transparent,
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
		return this.animal.getMaxHealth();
	}

	@Override
	public int getMaximumAir() {
		return this.animal.getMaximumAir();
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return this.animal.getMaximumNoDamageTicks();
	}

	@Override
	public int getNoDamageTicks() {
		return this.animal.getNoDamageTicks();
	}

	@Override
	public int getRemainingAir() {
		return this.animal.getRemainingAir();
	}

	@Override
	public LizaBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return new LizaCraftBlock(this.animal.getTargetBlock(transparent,
				maxDistance));
	}

	@Override
	public boolean isInsideVehicle() {
		return this.animal.isInsideVehicle();
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean leaveVehicle() {
		return this.animal.leaveVehicle();
	}

	@Override
	public void setHealth(int health) {
		this.animal.setHealth(health);
	}

	@Override
	public void setLastDamage(int damage) {
		this.animal.setLastDamage(damage);
	}

	@Override
	public void setMaximumAir(int ticks) {
		this.animal.setMaximumAir(ticks);
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		this.animal.setMaximumNoDamageTicks(ticks);
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		this.animal.setNoDamageTicks(ticks);
	}

	@Override
	public void setRemainingAir(int ticks) {
		this.animal.setRemainingAir(ticks);
	}

	@Override
	@Deprecated
	public LizaArrow shootArrow() {
		return new LizaCraftArrow(this.animal.shootArrow());
	}

	@Override
	@Deprecated
	public LizaEgg throwEgg() {
		return new LizaCraftEgg(this.animal.throwEgg());
	}

	@Override
	@Deprecated
	public LizaSnowball throwSnowball() {
		return new LizaCraftSnowball(this.animal.throwSnowball());
	}

	@Override
	public boolean eject() {
		return this.animal.eject();
	}

	@Override
	public int getEntityId() {
		return this.animal.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.animal.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.animal.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.animal.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.animal.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.animal.getMaxFireTicks();
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
		List<Entity> el = this.animal.getNearbyEntities(x, y, z);

		for (Entity e : el) {
			el.remove(e);
			LizaEntity le = new LizaCraftEntity(e);
			el.add(le);
		}
		return el;
	}

	@Override
	public LizaEntity getPassenger() {
		return new LizaCraftEntity(this.animal.getPassenger());
	}

	@Override
	public LizaServer getServer() {
		return new LizaCraftServer(this.animal.getServer());
	}

	@Override
	public int getTicksLived() {
		return this.animal.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.animal.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.animal.getVelocity();
	}

	@Override
	public LizaWorld getWorld() {
		return new LizaCraftWorld(this.animal.getWorld());
	}

	@Override
	public boolean isDead() {
		return this.animal.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.animal.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect type) {
		this.animal.playEffect(type);
	}

	@Override
	public void remove() {
		this.animal.remove();
	}

	@Override
	public void setFallDistance(float distance) {
		this.animal.setFallDistance(distance);
	}

	@Override
	public void setFireTicks(int ticks) {
		this.animal.setFireTicks(ticks);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		this.animal.setLastDamageCause(event);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean setPassenger(Entity passenger) {
		return this.animal.setPassenger(passenger);
	}

	@Override
	public void setTicksLived(int ticks) {
		this.animal.setTicksLived(ticks);
	}

	@Override
	public void setVelocity(Vector vel) {
		this.animal.setVelocity(vel);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location) {
		return this.animal.teleport(location);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination) {
		return this.animal.teleport(destination);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		return this.animal.teleport(location, cause);
	}

	/**
	 * This method performs an action and returns a value.
	 */
	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		return this.animal.teleport(destination, cause);
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect) {
		return this.animal.addPotionEffect(effect);
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect, boolean force) {
		return this.animal.addPotionEffect(effect, force);
	}

	@Override
	public boolean addPotionEffects(Collection<PotionEffect> effects) {
		return this.animal.addPotionEffects(effects);
	}

	@Override
	public Collection<PotionEffect> getActivePotionEffects() {
		return this.animal.getActivePotionEffects();
	}

	@Override
	public boolean hasPotionEffect(PotionEffectType type) {
		return this.animal.hasPotionEffect(type);
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
		return this.animal.launchProjectile(projectile);
	}

	@Override
	public void removePotionEffect(PotionEffectType type) {
		this.removePotionEffect(type);
	}

	@Override
	public EntityType getType() {
		return this.animal.getType();
	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.animal.getMetadata(metadataKey);
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.animal.hasMetadata(metadataKey);
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		this.animal.removeMetadata(metadataKey, owningPlugin);
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		this.animal.setMetadata(metadataKey, newMetadataValue);
	}

	@Override
	public Entity getVehicle() {
		return this.animal.getVehicle();
	}
}