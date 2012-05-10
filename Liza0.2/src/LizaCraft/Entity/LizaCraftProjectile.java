/**
 * 
 */
package LizaCraft.Entity;


import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import Liza.LizaLivingEntity;
import Liza.LizaProjectile;

// TODO: Auto-generated Javadoc
/**
 *  LizeCraftProjectile is the Liza entity representation of
 *  the Bukkit Projectile class.
 *  
 * @author geislekj
 */
public class LizaCraftProjectile extends LizaCraftEntity implements LizaProjectile{
	
	/**
	 * LizaCraftProjectile Constructor.
	 *
	 * @param projectile This is a Bukkit Projectile
	 */
	public LizaCraftProjectile(Projectile projectile){
		super(projectile);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getBukkitHandle()
	 */
	@Override
	public Projectile getBukkitHandle() {
		return (Projectile)this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Projectile#doesBounce()
	 */
	@Override
	public boolean doesBounce() {
		return this.getBukkitHandle().doesBounce();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Projectile#getShooter()
	 */
	@Override
	public LizaLivingEntity getShooter() {
		return new LizaCraftLivingEntity(this.getBukkitHandle().getShooter());
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Projectile#setBounce(boolean)
	 */
	@Override
	public void setBounce(boolean doesBounce) {
		this.getBukkitHandle().setBounce(doesBounce);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Projectile#setShooter(org.bukkit.entity.LivingEntity)
	 */
	@Override
	public void setShooter(LivingEntity shooter) {
		this.getBukkitHandle().setShooter(shooter);
	}

}