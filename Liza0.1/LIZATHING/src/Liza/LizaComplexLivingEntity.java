package Liza;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.entity.ComplexLivingEntity;

/**
 *  LizaComplexLivingEntity is the Liza interface representation of
 *  the Bukkit ComplexLivingEntity interface.
 *  
 *  @author collinbc
 */
public interface LizaComplexLivingEntity extends ComplexLivingEntity {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

	Set<LizaComplexEntityPart> getPartsLiza();

}
