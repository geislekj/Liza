package LizaCraft.Entity;

import java.util.HashSet;
import java.util.Set;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;
import Liza.LizaComplexEntityPart;
import Liza.LizaComplexLivingEntity;

/**
 *  LizaCraftComplexLivingEntity is the Liza entity representation of
 *  the Bukkit ComplexLivingEntity class.
 *  
 *  @author collinbc
 */
public class LizaCraftComplexLivingEntity extends LizaCraftLivingEntity implements LizaComplexLivingEntity {
	private ComplexLivingEntity cle;
	
	/**
	 * LizaCraftComplexLivingEntity Constructor
	 * 
	 * @param cle A Bukkit ComplexLivingEntity
	 */
	public LizaCraftComplexLivingEntity(ComplexLivingEntity cle) {
		super(cle);
	}
	
	@Override
	public ComplexLivingEntity getBukkitHandle() {
		return (ComplexLivingEntity) this.entity;
	}
	
	@Override
	public Set<LizaComplexEntityPart> getPartsLiza() {
		Set<ComplexEntityPart> parts = this.cle.getParts();
		Set<LizaComplexEntityPart> lizaParts = new HashSet<LizaComplexEntityPart>();

		for(ComplexEntityPart p : parts)
			lizaParts.add(new LizaCraftComplexEntityPart(p));
		
		return lizaParts;
	}

	@Override
	public Set<ComplexEntityPart> getParts() {
		return this.getBukkitHandle().getParts();
	}
}
