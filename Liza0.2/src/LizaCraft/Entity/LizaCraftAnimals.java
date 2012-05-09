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
public class LizaCraftAnimals extends LizaCraftCreature implements LizaAnimals {

	/**
	 * LizaCraftAnimals Constructor
	 * 
	 * @param animal A Bukkit Animals
	 */
	public LizaCraftAnimals(CraftAnimals animal) {
		super(animal);
	}
	
	@Override
	public Animals getBukkitHandle() {
		return (Animals)this.entity;
	}

	@Override
	public boolean canBreed() {
		return this.getBukkitHandle().canBreed();
	}

	@Override
	public int getAge() {
		return this.getBukkitHandle().getAge();
	}

	@Override
	public boolean getAgeLock() {
		return this.getBukkitHandle().getAgeLock();
	}

	@Override
	public boolean isAdult() {
		return this.getBukkitHandle().isAdult();
	}

	@Override
	public void setAdult() {
		this.getBukkitHandle().setAdult();
	}

	@Override
	public void setAge(int age) {
		this.getBukkitHandle().setAge(age);
	}

	@Override
	public void setAgeLock(boolean ageLock) {
		this.getBukkitHandle().setAgeLock(ageLock);
	}

	@Override
	public void setBaby() {
		this.getBukkitHandle().setBaby();
	}

	@Override
	public void setBreed(boolean breed) {
		this.getBukkitHandle().setBreed(breed);
	}
}