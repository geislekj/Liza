package LizaCraft.Entity;

import org.bukkit.entity.Enderman;
import org.bukkit.material.MaterialData;
import Liza.LizaEnderman;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftEnderman is the Liza entity representation of the Bukkit Enderman
 * class.
 * 
 * @author collinbc
 */
public class LizaCraftEnderman extends LizaCraftMonster implements LizaEnderman {
	
	/**
	 * LizaCraftSpider Constructor.
	 *
	 * @param enderman the enderman
	 */
	public LizaCraftEnderman(Enderman enderman) {
		super(enderman);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftMonster#getBukkitHandle()
	 */
	@Override
	public Enderman getBukkitHandle() {
		return (Enderman) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Enderman#getCarriedMaterial()
	 */
	@Override
	public MaterialData getCarriedMaterial() {
		return this.getBukkitHandle().getCarriedMaterial();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Enderman#setCarriedMaterial(org.bukkit.material.MaterialData)
	 */
	@Override
	public void setCarriedMaterial(MaterialData material) {
		this.getBukkitHandle().setCarriedMaterial(material);
	}

}
