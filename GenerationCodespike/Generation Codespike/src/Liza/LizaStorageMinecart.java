package Liza;

import java.util.List;

import org.bukkit.entity.StorageMinecart;

/**
 *  LizaStorageMinecart is the Liza interface representation of
 *  the Bukkit StorageMinecart interface.
 *  
 *  A.K.A. Luggage
 *  
 * @author collinbc
 */
public interface LizaStorageMinecart extends StorageMinecart {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
