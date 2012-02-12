package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Monster;

/**
 *  LizaMonster is the Liza interface representation of
 *  the Bukkit Monster interface.
 *  
 *  @author collinbc
 */
public interface LizaMonster extends Monster {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
