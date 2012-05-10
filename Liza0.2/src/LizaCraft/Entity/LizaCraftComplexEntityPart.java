package LizaCraft.Entity;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;

import Liza.LizaComplexEntityPart;

// TODO: Auto-generated Javadoc
/**
 * LizaCraftComplexEntityPart is the Liza entity representation of the Bukkit
 * ComplexEntityPart class.
 * 
 * @author collinbc
 */
public class LizaCraftComplexEntityPart extends LizaCraftEntity implements
		LizaComplexEntityPart {
	
	/**
	 * LizaCraftComplexEntityPart Constructor.
	 *
	 * @param part A Bukkit ComplexEntityPart
	 */
	public LizaCraftComplexEntityPart(ComplexEntityPart part) {
		super(part);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getBukkitHandle()
	 */
	@Override
	public ComplexEntityPart getBukkitHandle() {
		return (ComplexEntityPart) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.ComplexEntityPart#getParent()
	 */
	@Override
	public ComplexLivingEntity getParent() {
		return this.getBukkitHandle().getParent();
	}

}
