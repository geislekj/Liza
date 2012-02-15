package Liza;

import java.util.List;

import org.bukkit.entity.EnderSignal;

/**
 *  LizaEnderSignal is the Liza interface representation of
 *  the Bukkit EnderSignal interface.
 *  
 * @author collinbc
 */
public interface LizaEnderSignal extends EnderSignal {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
