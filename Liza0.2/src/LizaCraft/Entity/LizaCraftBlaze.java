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
public class LizaCraftBlaze extends LizaCraftMonster implements LizaBlaze {
	private Blaze blaze;
	
	/**
	 * LizaCraftBlaze Constructor
	 * 
	 * @param blaze A Bukkit Blaze
	 */
	public LizaCraftBlaze(Blaze blaze) {
		super(blaze);
	}
	
	@override
	public Blaze getBukkitHandle(){
		return (Blaze)this.entity;
	}
	
}
