package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.MagmaCube;

/**
 *  LizaMagmaCube is the Liza interface representation of
 *  the Bukkit MagmaCube interface.
 *  
 *  @author collinbc
 */
public interface LizaMagmaCube extends MagmaCube {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
