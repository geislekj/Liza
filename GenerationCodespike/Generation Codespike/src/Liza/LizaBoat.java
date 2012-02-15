package Liza;

import java.util.List;

import org.bukkit.entity.Boat;

/**
 *  LizaBoat is the Liza interface representation of
 *  the Bukkit Boat interface.
 *  
 *  I'm on a boat!
 *  
 * @author collinbc
 */
public interface LizaBoat extends Boat {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
