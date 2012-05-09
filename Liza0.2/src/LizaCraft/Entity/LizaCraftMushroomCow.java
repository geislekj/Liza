package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MushroomCow;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaEgg;
import Liza.LizaEntity;
import Liza.LizaLivingEntity;
import Liza.LizaMushroomCow;
import Liza.LizaPlayer;
import Liza.LizaServer;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 *  LizaCraftMushroomCow is the Liza entity representation of
 *  the Bukkit MushroomCow class.
 *  
 *  @author collinbc
 */
public class LizaCraftMushroomCow extends LizaCraftCow implements LizaMushroomCow {
	/**
	 * LizaCraftMushroomCow Constructor
	 * 
	 * @param mooshroom A Bukkit MushroomCow
	 */
	public LizaCraftMushroomCow(MushroomCow mooshroom) {
		super(mooshroom);
	}

	@Override
	public MushroomCow getBukkitHandle() {
		return (MushroomCow)this.entity;
	}
	
}
