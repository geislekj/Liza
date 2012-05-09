package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EnderDragonPart;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaEnderDragon;
import Liza.LizaEnderDragonPart;
import Liza.LizaEntity;
import Liza.LizaServer;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;

/**
 *  LizaCraftEnderDragonPart is the Liza entity representation of
 *  the Bukkit EnderDragonPart class.
 *  
 *  @author collinbc
 */
public class LizaCraftEnderDragonPart extends LizaCraftComplexEntityPart implements LizaEnderDragonPart {
	
	/**
	 * LizaCraftEnderDragonPart Constructor
	 * 
	 * @param part A Bukkit EnderDragonPart
	 */
	public LizaCraftEnderDragonPart(EnderDragonPart part) {
		super(part);
	}
	
	@Override
	public EnderDragonPart getBukkitHandle() {
		return (EnderDragonPart) this.entity;
	}

	@Override
	public LizaEnderDragon getParent() {
		return new LizaCraftEnderDragon(this.getBukkitHandle().getParent());
	}
}
