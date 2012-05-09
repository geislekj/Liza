/**
 * 
 */
package LizaCraft.Entity;


import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import Liza.LizaLivingEntity;
import Liza.LizaProjectile;

/**
 *  LizeCraftProjectile is the Liza entity representation of
 *  the Bukkit Projectile class.
 *  
 * @author geislekj
 */
public class LizaCraftProjectile extends LizaCraftEntity implements LizaProjectile{
	
	/**
	 * LizaCraftProjectile Constructor
	 * 
	 * @param projectile This is a Bukkit Projectile
	 */
	public LizaCraftProjectile(Projectile projectile){
		super(projectile);
	}
	
	@Override
	public Projectile getBukkitHandle() {
		return (Projectile)this.entity;
	}

	@Override
	public boolean doesBounce() {
		return this.getBukkitHandle().doesBounce();
	}

	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.getBukkitHandle().getShooter());
	}

	@Override
	public void setBounce(boolean doesBounce) {
		this.getBukkitHandle().setBounce(doesBounce);
	}

	@Override
	public void setShooter(LivingEntity shooter) {
		this.getBukkitHandle().setShooter(shooter);
	}

}