package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Giant;

/**
 *  LizaGiant is the Liza interface representation of
 *  the Bukkit Giant interface.
 *  
 *  I AM GIANT! 
 *  
 * @author collinbc
 */
public interface LizaGiant extends Giant {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
