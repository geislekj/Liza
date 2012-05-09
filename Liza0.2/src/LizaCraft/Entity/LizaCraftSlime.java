package LizaCraft.Entity;

import org.bukkit.entity.Slime;
import Liza.LizaSlime;

/**
 *  LizaCraftSlime is the Liza entity representation of
 *  the Bukkit Slime class.
 *  
 *  @author collinbc
 */
public class LizaCraftSlime extends LizaCraftLivingEntity implements LizaSlime {
	/**
	 * LizaCraftSlime Constructor
	 * 
	 * @param slime A Bukkit Slime
	 */
	public LizaCraftSlime(Slime slime) {
		super(slime);
	}
	
	@Override
	public Slime getBukkitHandle() {
		return (Slime)this.entity;
	}

	@Override
	public int getSize() {
		return this.getBukkitHandle().getSize();
	}

	@Override
	public void setSize(int size) {
		this.getBukkitHandle().setSize(size);
	}
	
}
