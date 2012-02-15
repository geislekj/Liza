package Liza;

import java.util.List;

import org.bukkit.entity.ExperienceOrb;

/**
 *  LizaExperienceOrb is the Liza interface representation of
 *  the Bukkit ExperienceOrb interface.
 * 
 * @author collinbc
 */
public interface LizaExperienceOrb extends ExperienceOrb {

	List<LizaEntity> getNearbyLizaEntities(double x, double y, double z);

}
