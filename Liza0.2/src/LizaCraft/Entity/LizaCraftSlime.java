package LizaCraft.Entity;

import org.bukkit.entity.Slime;
import Liza.LizaSlime;

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftSlime is the Liza entity representation of
 *  the Bukkit Slime class.
 *  
 *  @author collinbc
 */
public class LizaCraftSlime extends LizaCraftLivingEntity implements LizaSlime {
	
	/**
	 * LizaCraftSlime Constructor.
	 *
	 * @param slime A Bukkit Slime
	 */
	public LizaCraftSlime(Slime slime) {
		super(slime);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftLivingEntity#getBukkitHandle()
	 */
	@Override
	public Slime getBukkitHandle() {
		return (Slime)this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Slime#getSize()
	 */
	@Override
	public int getSize() {
		return this.getBukkitHandle().getSize();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Slime#setSize(int)
	 */
	@Override
	public void setSize(int size) {
		this.getBukkitHandle().setSize(size);
	}
	
}
