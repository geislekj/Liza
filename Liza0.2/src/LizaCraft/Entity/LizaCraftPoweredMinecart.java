package LizaCraft.Entity;

import org.bukkit.entity.Minecart;
import org.bukkit.entity.PoweredMinecart;

import Liza.LizaPoweredMinecart;

public class LizaCraftPoweredMinecart extends LizaCraftMinecart implements
		LizaPoweredMinecart {

	public LizaCraftPoweredMinecart(Minecart minecart) {
		super(minecart);
	}

	public PoweredMinecart getBukkitHandle(){
		return (PoweredMinecart)this.entity;
	}
	
}
