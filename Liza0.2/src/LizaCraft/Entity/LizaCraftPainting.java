package LizaCraft.Entity;

import org.bukkit.Art;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Painting;

import Liza.LizaPainting;

// TODO: Auto-generated Javadoc
/**
 * LizeCraftPainting is the Liza entity representation of the Bukkit Painting
 * class.
 * 
 * @author geislekj
 */
public class LizaCraftPainting extends LizaCraftEntity implements LizaPainting {
	
	/**
	 * LizaCraftPainting Constructor.
	 *
	 * @param painting This is a Bukkit Painting entity
	 */
	public LizaCraftPainting(Painting painting) {
		super(painting);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftEntity#getBukkitHandle()
	 */
	@Override
	public Painting getBukkitHandle() {
		return (Painting) this.entity;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Painting#getArt()
	 */
	@Override
	public Art getArt() {
		return this.getBukkitHandle().getArt();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Painting#setArt(org.bukkit.Art)
	 */
	@Override
	public boolean setArt(Art art) {
		return this.getBukkitHandle().setArt(art);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Painting#setArt(org.bukkit.Art, boolean)
	 */
	@Override
	public boolean setArt(Art art, boolean force) {
		return this.getBukkitHandle().setArt(art, force);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.entity.Painting#setFacingDirection(org.bukkit.block.BlockFace, boolean)
	 */
	@Override
	public boolean setFacingDirection(BlockFace face, boolean force) {
		return this.getBukkitHandle().setFacingDirection(face, force);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.material.Attachable#getAttachedFace()
	 */
	@Override
	public BlockFace getAttachedFace() {
		return this.getBukkitHandle().getAttachedFace();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.material.Directional#getFacing()
	 */
	@Override
	public BlockFace getFacing() {
		return this.getBukkitHandle().getFacing();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.material.Directional#setFacingDirection(org.bukkit.block.BlockFace)
	 */
	@Override
	public void setFacingDirection(BlockFace face) {
		this.getBukkitHandle().setFacingDirection(face);
	}

}
