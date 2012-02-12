package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Silverfish;

/**
 *  LizaSilverfish is the Liza interface representation of
 *  the Bukkit Silverfish interface.
 *  
 *  A.K.A. "97" or rock lobsters.
 * 
 *  @author collinbc
 */
public interface LizaSilverfish extends Silverfish {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
