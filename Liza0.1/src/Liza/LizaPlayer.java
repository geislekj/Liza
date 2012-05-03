package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Player;

/**
 *  LizaPlayer is the Liza interface representation of
 *  the Bukkit Player class.
 *  
 *  @author collinbc
 */
public interface LizaPlayer extends Player {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
