package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Slime;

/**
 *  LizaSlime is the Liza interface representation of
 *  the Bukkit Slime interface
 *  
 * @author collinbc
 */
public interface LizaSlime extends Slime {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
