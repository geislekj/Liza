package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Cow;

/**
 *  LizaCow is the Liza interface representation of
 *  the Bukkit Cow interface.
 *  
 * @author collinbc
 */
public interface LizaCow extends Cow {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
