package LizaCraft.Entity;

import org.bukkit.entity.Enderman;
import org.bukkit.material.MaterialData;
import Liza.LizaEnderman;

/**
 * LizaCraftEnderman is the Liza entity representation of the Bukkit Enderman
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftEnderman extends LizaCraftMonster implements LizaEnderman {
	/**
	 * LizaCraftSpider Constructor
	 * 
	 * @param spider
	 *            A Bukkit Spider
	 */
	public LizaCraftEnderman(Enderman enderman) {
		super(enderman);
	}

	@Override
	public Enderman getBukkitHandle() {
		return (Enderman) this.entity;
	}

	@Override
	public MaterialData getCarriedMaterial() {
		return this.getBukkitHandle().getCarriedMaterial();
	}

	@Override
	public void setCarriedMaterial(MaterialData material) {
		this.getBukkitHandle().setCarriedMaterial(material);
	}

}
