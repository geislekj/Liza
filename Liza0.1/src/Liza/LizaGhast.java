package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Ghast;

/**
 *  LizaGhast is the Liza interface representation of
 *  the Bukkit Ghast interface.
 *  
 *  A.K.A. The thing making those creepy baby-like noises.
 *  
 *  @author collinbc
 */
public interface LizaGhast extends Ghast {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
