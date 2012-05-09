package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftCow;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaCow;
import Liza.LizaEgg;
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
 *  LizaCraftCow is the Liza entity representation of
 *  the Bukkit CraftCow class.
 *  
 * @author collinbc
 */
public class LizaCraftCow extends LizaCraftAnimals implements LizaCow {
	/**
	 * LizaCraftMushroomCow Constructor
	 * 
	 * @param mooshroom A Bukkit MushroomCow
	 */
	public LizaCraftCow(Cow cow) {
		super(cow);
	}
	
	@Override
	public Cow getBukkitHandle() {
		return (Cow)this.entity;
	}

}
