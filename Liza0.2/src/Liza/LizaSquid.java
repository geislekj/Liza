package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Squid;

/**
 *  LizaSquid is the Liza interface representation of
 *  the Bukkit Squid interface.
 *  
 *  A.K.A. Octopus
 *  
 *  @author collinbc
 */
public interface LizaSquid extends Squid {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
