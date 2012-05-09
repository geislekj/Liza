package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftChicken;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaChicken;
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
 *  LizaCraftChicken is the Liza entity representation of
 *  the Bukkit CraftChicken class.
 *  
 * @author collinbc
 */
public class LizaCraftChicken extends LizaCraftAnimals implements LizaChicken {

	/**
	 * LizaCraftChicken Constructor
	 * 
	 * @param chicken A Bukkit Chicken
	 */
	public LizaCraftChicken(CraftChicken chicken) {
		super(chicken);
	}
	
	@Override
	public Chicken getBukkitHandle() {
		return (Chicken)this.entity;
	}
	
}
