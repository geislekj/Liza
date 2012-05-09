package LizaCraft.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.DyeColor;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftSheep;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Sheep;
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
import Liza.LizaSheep;
import Liza.LizaSnowball;
import Liza.LizaVehicle;
import Liza.LizaWorld;
import LizaCraft.LizaCraftServer;
import LizaCraft.LizaCraftWorld;
import LizaCraft.Block.LizaCraftBlock;

/**
 * LizaCraftSheep is the Liza entity representation of the Bukkit CraftSheep
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftSheep extends LizaCraftAnimals implements LizaSheep {
	/**
	 * LizaCraftSheep Constructor
	 * 
	 * @param sheep
	 *            A Bukkit Sheep
	 */
	public LizaCraftSheep(CraftSheep sheep) {
		super(sheep);
	}

	@Override
	public Sheep getBukkitHandle() {
		return (Sheep) this.entity;
	}

	@Override
	public boolean isSheared() {
		return this.getBukkitHandle().isSheared();
	}

	@Override
	public void setSheared(boolean sheared) {
		this.getBukkitHandle().setSheared(sheared);
	}

	@Override
	public DyeColor getColor() {
		return this.getBukkitHandle().getColor();
	}

	@Override
	public void setColor(DyeColor color) {
		this.getBukkitHandle().setColor(color);
	}
}
