package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftWolf;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Wolf;
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
import Liza.LizaVehicle;
import Liza.LizaWolf;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftWolf is the Liza entity representation of
 *  the Bukkit CraftWolf class.
 *  
 * @author collinbc
 */
public class LizaCraftWolf extends LizaCraftAnimals implements LizaWolf {
	/**
	 * LizaCraftWolf Constructor
	 * 
	 * @param wolf A Bukkit Wolf
	 */
	public LizaCraftWolf(Wolf wolf) {
		super(wolf);
	}
	
	@Override
	public Wolf getBukkitHandle() {
		return (Wolf)this.entity;
	}

	@Override
	public boolean isAngry() {
		return this.getBukkitHandle().isAngry();
	}

	@Override
	public boolean isSitting() {
		return this.getBukkitHandle().isSitting();
	}

	@Override
	public void setAngry(boolean angry) {
		this.getBukkitHandle().setAngry(angry);
	}

	@Override
	public void setSitting(boolean sitting) {
		this.getBukkitHandle().setSitting(sitting);
	}

	@Override
	public AnimalTamer getOwner() {
		return this.getBukkitHandle().getOwner();
	}

	@Override
	public boolean isTamed() {
		return this.getBukkitHandle().isTamed();
	}

	@Override
	public void setOwner(AnimalTamer owner) {
		this.getBukkitHandle().setOwner(owner);
	}

	@Override
	public void setTamed(boolean tamed) {
		this.getBukkitHandle().setTamed(tamed);
	}

	
}
