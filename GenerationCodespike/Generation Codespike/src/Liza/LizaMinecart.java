package Liza;

import java.util.List;

import org.bukkit.entity.Minecart;

/**
 *  LizaMinecart is the Liza interface representation of
 *  the Bukkit Minecart interface.
 *  
 *  How'd that pig get in there?
 *  
 * @author collinbc
 */
public interface LizaMinecart extends Minecart {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);
	
}
