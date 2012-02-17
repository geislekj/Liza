package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Creature;

/**
 *  LizaCreature is the Liza interface representation of
 *  the Bukkit Creature interface
 *  
 *  @author geislekj
 */
public interface LizaCreature extends Creature{

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
