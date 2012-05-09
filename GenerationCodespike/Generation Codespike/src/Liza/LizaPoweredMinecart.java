package Liza;

import java.util.List;

import org.bukkit.entity.PoweredMinecart;

/**
 *  LizaPoweredMinecart is the Liza interface representation of
 *  the Bukkit PoweredMinecart interface.
 *  
 * @author collinbc
 */
public interface LizaPoweredMinecart extends PoweredMinecart {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
