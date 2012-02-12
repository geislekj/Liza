package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.PigZombie;

/**
 *  LizaPigZombie is the Liza interface representation of
 *  the Bukkit PigZombie interface.
 *  
 *  A.K.A. Zombie Pigman or Man Bear Pig
 *  
 *  @author collinbc
 */
public interface LizaPigZombie extends PigZombie {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
