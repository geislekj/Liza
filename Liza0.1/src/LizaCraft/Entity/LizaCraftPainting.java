package LizaCraft.Entity;

import java.util.List;
import java.util.UUID;

import org.bukkit.Art;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Painting;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

import Liza.LizaPainting;


/**
 *  LizeCraftPainting is the Liza entity representation of
 *  the Bukkit Painting class.
 *  
 * @author geislekj
 */
public class LizaCraftPainting implements LizaPainting{

	private Painting painting;

	/**
	 * LizaCraftPainting Constructor
	 * 
	 * @param painting This is a Bukkit Painting entity 
	 */
	public LizaCraftPainting(Painting painting) {
		this.painting = painting;
	}

	@Override
	public Art getArt() {
		return this.painting.getArt();
	}

	@Override
	public boolean setArt(Art arg0) {
		return this.painting.setArt(arg0);
	}

	@Override
	public boolean setArt(Art arg0, boolean arg1) {
		return this.painting.setArt(arg0, arg1);
	}

	@Override
	public boolean setFacingDirection(BlockFace arg0, boolean arg1) {
		return this.painting.setFacingDirection(arg0, arg1); 
	}

	@Override
	public boolean eject() {
		return this.painting.eject();
	}

	@Override
	public int getEntityId() {
		return this.painting.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return this.painting.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return this.painting.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return this.painting.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return this.painting.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return this.painting.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return this.painting.getNearbyEntities(arg0, arg1, arg2); 
	}

	@Override
	public Entity getPassenger() {
		return this.painting.getPassenger();
	}

	@Override
	public Server getServer() {
		return this.painting.getServer();
	}

	@Override
	public int getTicksLived() {
		return this.painting.getTicksLived();
	}

	@Override
	public UUID getUniqueId() {
		return this.painting.getUniqueId();
	}

	@Override
	public Vector getVelocity() {
		return this.painting.getVelocity();
	}

	@Override
	public World getWorld() {
		return this.painting.getWorld();
	}

	@Override
	public boolean isDead() {
		return this.painting.isDead();
	}

	@Override
	public boolean isEmpty() {
		return this.painting.isEmpty();
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		this.painting.playEffect(arg0);
	}

	@Override
	public void remove() {
		this.painting.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		this.painting.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		this.painting.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		this.painting.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return this.painting.setPassenger(arg0);	
	}

	@Override
	public void setTicksLived(int arg0) {
		this.painting.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		this.painting.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return this.painting.teleport(arg0);	
	}

	@Override
	public boolean teleport(Entity arg0) {
		return this.painting.teleport(arg0);
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return this.painting.teleport(arg0, arg1); 
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return this.painting.teleport(arg0, arg1); 
	}

	@Override
	public BlockFace getAttachedFace() {
		return this.painting.getAttachedFace();
	}

	@Override
	public BlockFace getFacing() {
		return this.painting.getFacing();
	}

	@Override
	public void setFacingDirection(BlockFace arg0) {
		this.painting.setFacingDirection(arg0); 
	}

}
