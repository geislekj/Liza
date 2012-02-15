package Liza;

import java.util.List;

import org.bukkit.entity.EnderCrystal;

/**
 *  LizaEnderCrystal is the Liza interface representation of
 *  the Bukkit EnderCrystal interface.
 *  
 * @author collinbc
 */
public interface LizaEnderCrystal extends EnderCrystal {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
