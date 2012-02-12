package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Zombie;

/**
 *  LizaZombie is the Liza interface representation of
 *  the Bukkit Zombie interface.
 *  
 * @author collinbc
 */
public interface LizaZombie extends Zombie {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
