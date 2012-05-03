package Liza;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.NPC;

/**
 *  LizaNPC is the Liza interface representation of
 *  the Bukkit NPC interface.
 *  
 *  @author collinbc
 */
public interface LizaNPC extends NPC {

	List<LizaBlock> getLastTwoTargetLizaBlocks(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaBlock> getLineOfSightLiza(HashSet<Byte> transparent,
			int maxDistance);

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
