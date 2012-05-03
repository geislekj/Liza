package Liza;

import java.util.List;

import org.bukkit.entity.TNTPrimed;

/**
 *  LizaTNTPrimed is the Liza interface representation of
 *  the Bukkit TNTPrimed interface.
 *  
 * @author collinbc
 */
public interface LizaTNTPrimed extends TNTPrimed {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
