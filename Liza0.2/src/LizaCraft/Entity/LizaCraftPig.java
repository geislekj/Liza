package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftPig;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaPig;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftPig is the Liza entity representation of
 *  the Bukkit CraftPig class.
 *  
 * @author collinbc
 */
public class LizaCraftPig extends LizaCraftAnimals implements LizaPig {
	/**
	 * LizaCraftPig Constructor
	 * 
	 * @param pig A Bukkit Pig
	 */
	public LizaCraftPig(CraftPig pig) {
		super(pig);
	}
	
	@Override
	public Pig getBukkitHandle() {
		return (Pig)this.entity;
	}

	@Override
	public boolean hasSaddle() {
		return this.getBukkitHandle().hasSaddle();
	}

	@Override
	public void setSaddle(boolean saddled) {
		this.getBukkitHandle().setSaddle(saddled);
	}

}
