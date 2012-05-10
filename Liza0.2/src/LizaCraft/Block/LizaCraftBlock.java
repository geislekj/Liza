package LizaCraft.Block;

//Bukkit Imports
import java.util.Collection;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

//Liza Imports
import Liza.LizaBlock;

// TODO: Auto-generated Javadoc
/**
 * LizeCraftBlock is the Liza block representation of the Bukkit block class.
 * 
 * @author kimsj; geislekj
 */
public class LizaCraftBlock implements LizaBlock {
	
	/** The block. */
	private Block block;

	/**
	 * LizaCraftBlock Constructor.
	 *
	 * @param block This is a Bukkit Block
	 */
	public LizaCraftBlock(Block block) {
		this.block = block;
	}

	/* (non-Javadoc)
	 * @see Liza.LizaBlock#getBukkitBlock()
	 */
	@Override
	public Block getBukkitBlock() {
		return this.block;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getBiome()
	 */
	@Override
	public Biome getBiome() {
		return this.block.getBiome();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getBlockPower()
	 */
	@Override
	public int getBlockPower() {
		return this.block.getBlockPower();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getBlockPower(org.bukkit.block.BlockFace)
	 */
	@Override
	public int getBlockPower(BlockFace face) {
		return this.block.getBlockPower(face);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getChunk()
	 */
	@Override
	public Chunk getChunk() {
		return this.block.getChunk();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getData()
	 */
	@Override
	public byte getData() {
		return this.block.getData();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getFace(org.bukkit.block.Block)
	 */
	@Override
	public BlockFace getFace(Block block) {
		return this.block.getFace(block);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getHumidity()
	 */
	@Override
	public double getHumidity() {
		return this.block.getHumidity();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getLightLevel()
	 */
	@Override
	public byte getLightLevel() {
		return this.block.getLightLevel();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getLocation()
	 */
	@Override
	public Location getLocation() {
		return this.block.getLocation();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getPistonMoveReaction()
	 */
	@Override
	public PistonMoveReaction getPistonMoveReaction() {
		return this.block.getPistonMoveReaction();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getRelative(org.bukkit.block.BlockFace)
	 */
	@Override
	public Block getRelative(BlockFace face) {
		return this.block.getRelative(face);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getRelative(org.bukkit.block.BlockFace, int)
	 */
	@Override
	public Block getRelative(BlockFace face, int distance) {
		return this.block.getRelative(face, distance);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getRelative(int, int, int)
	 */
	@Override
	public Block getRelative(int modX, int modY, int modZ) {
		return this.block.getRelative(modX, modY, modZ);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getState()
	 */
	@Override
	public BlockState getState() {
		return this.block.getState();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getTemperature()
	 */
	@Override
	public double getTemperature() {
		return this.block.getTemperature();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getType()
	 */
	@Override
	public Material getType() {
		return this.block.getType();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getTypeId()
	 */
	@Override
	public int getTypeId() {
		return this.block.getTypeId();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getWorld()
	 */
	@Override
	public World getWorld() {
		return this.block.getWorld();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getX()
	 */
	@Override
	public int getX() {
		return this.block.getX();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getY()
	 */
	@Override
	public int getY() {
		return this.block.getY();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getZ()
	 */
	@Override
	public int getZ() {
		return this.block.getZ();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#isBlockFaceIndirectlyPowered(org.bukkit.block.BlockFace)
	 */
	@Override
	public boolean isBlockFaceIndirectlyPowered(BlockFace face) {
		return this.block.isBlockFaceIndirectlyPowered(face);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#isBlockFacePowered(org.bukkit.block.BlockFace)
	 */
	@Override
	public boolean isBlockFacePowered(BlockFace face) {
		return this.block.isBlockFacePowered(face);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#isBlockIndirectlyPowered()
	 */
	@Override
	public boolean isBlockIndirectlyPowered() {
		return this.block.isBlockIndirectlyPowered();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#isBlockPowered()
	 */
	@Override
	public boolean isBlockPowered() {
		return this.block.isBlockPowered();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return this.block.isEmpty();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#isLiquid()
	 */
	@Override
	public boolean isLiquid() {
		return this.block.isLiquid();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#setData(byte)
	 */
	@Override
	public void setData(byte data) {
		this.block.setData(data);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#setData(byte, boolean)
	 */
	@Override
	public void setData(byte data, boolean applyPhysics) {
		this.block.setData(data, applyPhysics);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#setType(org.bukkit.Material)
	 */
	@Override
	public void setType(Material type) {
		this.block.setType(type);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#setTypeId(int)
	 */
	@Override
	public boolean setTypeId(int type) {
		return this.block.setTypeId(type);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#setTypeId(int, boolean)
	 */
	@Override
	public boolean setTypeId(int type, boolean applyPhysics) {
		return this.block.setTypeId(type, applyPhysics);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#setTypeIdAndData(int, byte, boolean)
	 */
	@Override
	public boolean setTypeIdAndData(int type, byte data, boolean applyPhysics) {
		return this.block.setTypeIdAndData(type, data, applyPhysics);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#breakNaturally()
	 */
	@Override
	public boolean breakNaturally() {
		return this.block.breakNaturally();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#breakNaturally(org.bukkit.inventory.ItemStack)
	 */
	@Override
	public boolean breakNaturally(ItemStack tool) {
		return this.block.breakNaturally(tool);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getDrops()
	 */
	@Override
	public Collection<ItemStack> getDrops() {
		return this.block.getDrops();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getDrops(org.bukkit.inventory.ItemStack)
	 */
	@Override
	public Collection<ItemStack> getDrops(ItemStack tool) {
		return this.block.getDrops(tool);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getLightFromBlocks()
	 */
	@Override
	public byte getLightFromBlocks() {
		return this.block.getLightFromBlocks();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.block.Block#getLightFromSky()
	 */
	@Override
	public byte getLightFromSky() {
		return this.block.getLightFromSky();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#getMetadata(java.lang.String)
	 */
	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.block.getMetadata(metadataKey);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#hasMetadata(java.lang.String)
	 */
	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.block.hasMetadata(metadataKey);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#removeMetadata(java.lang.String, org.bukkit.plugin.Plugin)
	 */
	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		this.block.removeMetadata(metadataKey, owningPlugin);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#setMetadata(java.lang.String, org.bukkit.metadata.MetadataValue)
	 */
	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		this.block.setMetadata(metadataKey, newMetadataValue);
	}

}
