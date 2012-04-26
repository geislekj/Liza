package Liza;

import java.util.List;

import org.bukkit.entity.EnderPearl;

/**
 *  LizaEnderPearl is the Liza interface representation of
 *  the Bukkit EnderPearl interface.
 *  
 * @author collinbc
 */
public interface LizaEnderPearl extends EnderPearl {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
