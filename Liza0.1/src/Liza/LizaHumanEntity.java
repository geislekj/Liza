package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.HumanEntity;

/**
 *  LizaHumanEntity is the Liza interface representation of
 *  the Bukkit HumanEntity interface.
 *  
 * @author collinbc
 */
public interface LizaHumanEntity extends HumanEntity {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
