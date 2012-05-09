package LizaCraft.Entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import Liza.LizaArrow;
import Liza.LizaBlock;
import Liza.LizaCaveSpider;
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
 *  LizaCraftCaveSpider is the Liza entity representation of
 *  the Bukkit CaveSpider class.
 *  
 *  @author collinbc
 */
public class LizaCraftCaveSpider extends LizaCraftSpider implements LizaCaveSpider {
	/**
	 * LizaCraftCaveSpider Constructor
	 * 
	 * @param caveSpider A Bukkit CaveSpider
	 */
	public LizaCraftCaveSpider(CaveSpider caveSpider) {
		super(caveSpider);
	}
	
	@Override
	public CaveSpider getBukkitHandle() {
		return (CaveSpider)this.entity;
	}

}
