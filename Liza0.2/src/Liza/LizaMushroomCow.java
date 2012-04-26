package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.MushroomCow;

/**
 *  LizaMushroomCow is the Liza interface representation of
 *  the Bukkit MushroomCow interface.
 *  
 *  A.K.A. Mooshroom
 *  
 *  @author collinbc
 */
public interface LizaMushroomCow extends MushroomCow {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
