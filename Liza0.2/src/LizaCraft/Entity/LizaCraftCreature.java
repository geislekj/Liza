/**
 * 
 */
package LizaCraft.Entity;

import org.bukkit.entity.Creature;
import org.bukkit.entity.LivingEntity;
import Liza.LizaCreature;
import Liza.LizaLivingEntity;

// TODO: Auto-generated Javadoc
/**
 *  LizeCraftCreature is the Liza entity representation of
 *  the Bukkit Creature class.
 *  
 *  @author geislekj
 */
public class LizaCraftCreature extends LizaCraftLivingEntity implements LizaCreature{

	/**
	 * LizaCraftCreature Constructor.
	 *
	 * @param creature This is a Bukkit Creature
	 */
	public LizaCraftCreature(Creature creature){
		super(creature);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftLivingEntity#getBukkitHandle()
	 */
	@Override
	public Creature getBukkitHandle() {
		return (Creature)this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Creature#getTarget()
	 */
	@Override
	public LizaLivingEntity getTarget() {
		return new LizaCraftLivingEntity(this.getBukkitHandle().getTarget());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Creature#setTarget(org.bukkit.entity.LivingEntity)
	 */
	@Override
	public void setTarget(LivingEntity target) {
		this.getBukkitHandle().setTarget(target);		
	}

	
}
