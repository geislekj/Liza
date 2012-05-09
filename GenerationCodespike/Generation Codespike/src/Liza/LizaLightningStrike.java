package Liza;

import java.util.List;

import org.bukkit.entity.LightningStrike;

/**
 *  LizaLightningStrike is the Liza interface representation of
 *  the Bukkit LightningStrike interface.
 *  
 * @author collinbc
 */
public interface LizaLightningStrike extends LightningStrike {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
