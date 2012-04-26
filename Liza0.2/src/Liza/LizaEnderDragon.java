package Liza;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.entity.EnderDragon;

/**
 *  LizaEnderDragon is the Liza interface representation of
 *  the Bukkit EnderDragon interface.
 *  
 *  A.K.A. The boss.
 *  
 *  @author collinbc
 */
public interface LizaEnderDragon extends EnderDragon {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

	Set<LizaComplexEntityPart> getPartsLiza();

}
