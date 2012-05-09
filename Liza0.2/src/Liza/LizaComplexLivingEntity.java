package Liza;

import java.util.Set;

import org.bukkit.entity.ComplexLivingEntity;

/**
 *  LizaComplexLivingEntity is the Liza interface representation of
 *  the Bukkit ComplexLivingEntity interface.
 *  
 *  @author collinbc
 */
public interface LizaComplexLivingEntity extends ComplexLivingEntity {

	/**
	 * 
	 * @return the parts of this entity as liza objects
	 */
	Set<LizaComplexEntityPart> getPartsLiza();

}
