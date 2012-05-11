package LizaCraft;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.BlockChangeDelegate;
import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.Difficulty;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import Liza.LizaEntity;
import Liza.LizaWorld;
import LizaCraft.Entity.LizaCraftEntity;

/**
 *  LizeCraftWorld is the Liza world representation of
 *  the Bukkit World class.
 *
 * @author geislekj
 */
@SuppressWarnings("deprecation")
public class LizaCraftWorld implements LizaWorld{

	/** The world. */
	private World world;
	
	/**
	 * LizaCraftWorld Constructor.
	 *
	 * @param world Bukkit World
	 */
	public LizaCraftWorld(World world){
		this.world = world;
	}
	
	/* (non-Javadoc)
	 * @see Liza.LizaWorld#getLizaEntities()
	 */
	public List<LizaEntity> getLizaEntities() {
		List<Entity> entities = this.getEntities();
		List<LizaEntity> lizaEntities = new ArrayList<LizaEntity>();
		
		for (Entity entity : entities) {
			lizaEntities.add(new LizaCraftEntity(entity));
		}
		
		return lizaEntities;
	}
	
	/* (non-Javadoc)
	 * @see Liza.LizaWorld#getLizaEntitiesWithinBox(org.bukkit.Location, org.bukkit.Location)
	 */
	@Override
	public List<LizaEntity> getLizaEntitiesWithinBox(Location corner1,
			Location corner2) {
		List<Entity> entities = this.world.getEntities();
		List<LizaEntity> boxEntities = new ArrayList<LizaEntity>();
		
		double x1, x2, y1, y2, z1, z2;
		if (corner1.getX() < corner2.getX()) {
			x1 = corner1.getX();
			x2 = corner2.getX();
		} else {
			x2 = corner1.getX();
			x1 = corner2.getX();
		}
		if (corner1.getY() < corner2.getY()) {
			y1 = corner1.getY();
			y2 = corner2.getY();
		} else {
			y2 = corner1.getY();
			y1 = corner2.getY();
		}
		if (corner1.getZ() < corner2.getZ()) {
			z1 = corner1.getZ();
			z2 = corner2.getZ();
		} else {
			z2 = corner1.getZ();
			z1 = corner2.getZ();
		}
		
		for (Entity e : entities) {
			if (x1 < e.getLocation().getX() && e.getLocation().getX() < x2)
				if (z1 < e.getLocation().getZ() && e.getLocation().getZ() < z2)
					if (y1 < e.getLocation().getY() && e.getLocation().getY() < y2)
						boxEntities.add(new LizaCraftEntity(e));
		}
		return boxEntities;
	}

	/* (non-Javadoc)
	 * @see Liza.LizaWorld#getLizaEntitiesWithinRadius(org.bukkit.Location, double)
	 */
	@Override
	public List<LizaEntity> getLizaEntitiesWithinRadius(Location center,
			double radius) {
		List<LizaEntity> lizaEntities = new ArrayList<LizaEntity>();
		
		List<Entity> entities = this.getEntities();
		
		for (Entity entity : entities) {
			if (center.distance(entity.getLocation()) < radius) {
				lizaEntities.add(new LizaCraftEntity(entity));
			}
		}
		
		return lizaEntities;
	}
	
	///////////////////////////////////////////////////////
	
	/* (non-Javadoc)
	 * @see org.bukkit.World#createExplosion(org.bukkit.Location, float)
	 */
	@Override
	public boolean createExplosion(Location arg0, float arg1) {
		return this.world.createExplosion(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#createExplosion(org.bukkit.Location, float, boolean)
	 */
	@Override
	public boolean createExplosion(Location arg0, float arg1, boolean arg2) {
		return this.world.createExplosion(arg0, arg1, arg2); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#createExplosion(double, double, double, float)
	 */
	@Override
	public boolean createExplosion(double arg0, double arg1, double arg2,
			float arg3) {
		return this.world.createExplosion(arg0, arg1, arg2, arg3); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#createExplosion(double, double, double, float, boolean)
	 */
	@Override
	public boolean createExplosion(double arg0, double arg1, double arg2,
			float arg3, boolean arg4) {
		return this.world.createExplosion(arg0, arg1, arg2, arg3, arg4); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#dropItem(org.bukkit.Location, org.bukkit.inventory.ItemStack)
	 */
	@Override
	public Item dropItem(Location arg0, ItemStack arg1) {
		return this.world.dropItem(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#dropItemNaturally(org.bukkit.Location, org.bukkit.inventory.ItemStack)
	 */
	@Override
	public Item dropItemNaturally(Location arg0, ItemStack arg1) {
		return this.world.dropItemNaturally(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#generateTree(org.bukkit.Location, org.bukkit.TreeType)
	 */
	@Override
	public boolean generateTree(Location arg0, TreeType arg1) {
		return this.world.generateTree(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#generateTree(org.bukkit.Location, org.bukkit.TreeType, org.bukkit.BlockChangeDelegate)
	 */
	@Override
	public boolean generateTree(Location arg0, TreeType arg1,
			BlockChangeDelegate arg2) {
		return this.world.generateTree(arg0, arg1, arg2); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getAllowAnimals()
	 */
	@Override
	public boolean getAllowAnimals() {
		return this.world.getAllowAnimals();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getAllowMonsters()
	 */
	@Override
	public boolean getAllowMonsters() {
		return this.world.getAllowMonsters();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getBiome(int, int)
	 */
	@Override
	public Biome getBiome(int arg0, int arg1) {
		return this.world.getBiome(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getBlockAt(org.bukkit.Location)
	 */
	@Override
	public Block getBlockAt(Location arg0) {
		return this.world.getBlockAt(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getBlockAt(int, int, int)
	 */
	@Override
	public Block getBlockAt(int arg0, int arg1, int arg2) {
		return this.world.getBlockAt(arg0, arg1, arg2); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getBlockTypeIdAt(org.bukkit.Location)
	 */
	@Override
	public int getBlockTypeIdAt(Location arg0) {
		return this.world.getBlockTypeIdAt(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getBlockTypeIdAt(int, int, int)
	 */
	@Override
	public int getBlockTypeIdAt(int arg0, int arg1, int arg2) {
		return this.world.getBlockTypeIdAt(arg0, arg1, arg2); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getChunkAt(org.bukkit.Location)
	 */
	@Override
	public Chunk getChunkAt(Location arg0) {
		return this.world.getChunkAt(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getChunkAt(org.bukkit.block.Block)
	 */
	@Override
	public Chunk getChunkAt(Block arg0) {
		return this.world.getChunkAt(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getChunkAt(int, int)
	 */
	@Override
	public Chunk getChunkAt(int arg0, int arg1) {
		return this.world.getChunkAt(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getDifficulty()
	 */
	@Override
	public Difficulty getDifficulty() {
		return this.world.getDifficulty();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getEmptyChunkSnapshot(int, int, boolean, boolean)
	 */
	@Override
	public ChunkSnapshot getEmptyChunkSnapshot(int arg0, int arg1,
			boolean arg2, boolean arg3) {
		return this.world.getEmptyChunkSnapshot(arg0, arg1, arg2, arg3); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getEntities()
	 */
	@Override
	public List<Entity> getEntities() {
		return this.world.getEntities();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getEnvironment()
	 */
	@Override
	public Environment getEnvironment() {
		return this.world.getEnvironment();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getFullTime()
	 */
	@Override
	public long getFullTime() {
		return this.world.getFullTime();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getGenerator()
	 */
	@Override
	public ChunkGenerator getGenerator() {
		return this.world.getGenerator();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getHighestBlockAt(org.bukkit.Location)
	 */
	@Override
	public Block getHighestBlockAt(Location arg0) {
		return this.world.getHighestBlockAt(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getHighestBlockAt(int, int)
	 */
	@Override
	public Block getHighestBlockAt(int arg0, int arg1) {
		return this.world.getHighestBlockAt(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getHighestBlockYAt(org.bukkit.Location)
	 */
	@Override
	public int getHighestBlockYAt(Location arg0) {
		return this.world.getHighestBlockYAt(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getHighestBlockYAt(int, int)
	 */
	@Override
	public int getHighestBlockYAt(int arg0, int arg1) {
		return this.world.getHighestBlockYAt(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getHumidity(int, int)
	 */
	@Override
	public double getHumidity(int arg0, int arg1) {
		return this.world.getHumidity(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getKeepSpawnInMemory()
	 */
	@Override
	public boolean getKeepSpawnInMemory() {
		return this.world.getKeepSpawnInMemory();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getLivingEntities()
	 */
	@Override
	public List<LivingEntity> getLivingEntities() {
		return this.world.getLivingEntities();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getLoadedChunks()
	 */
	@Override
	public Chunk[] getLoadedChunks() {
		return this.world.getLoadedChunks();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getMaxHeight()
	 */
	@Override
	public int getMaxHeight() {
		return this.world.getMaxHeight();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getName()
	 */
	@Override
	public String getName() {
		return this.world.getName();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getPVP()
	 */
	@Override
	public boolean getPVP() {
		return this.world.getPVP();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getPlayers()
	 */
	@Override
	public List<Player> getPlayers() {
		return this.world.getPlayers();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getPopulators()
	 */
	@Override
	public List<BlockPopulator> getPopulators() {
		return this.world.getPopulators();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getSeaLevel()
	 */
	@Override
	public int getSeaLevel() {
		return this.world.getSeaLevel();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getSeed()
	 */
	@Override
	public long getSeed() {
		return this.world.getSeed();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getSpawnLocation()
	 */
	@Override
	public Location getSpawnLocation() {
		return this.world.getSpawnLocation();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getTemperature(int, int)
	 */
	@Override
	public double getTemperature(int arg0, int arg1) {
		return this.world.getTemperature(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getThunderDuration()
	 */
	@Override
	public int getThunderDuration() {
		return this.world.getThunderDuration();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getTime()
	 */
	@Override
	public long getTime() {
		return this.world.getTime();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getUID()
	 */
	@Override
	public UUID getUID() {
		return this.world.getUID();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getWeatherDuration()
	 */
	@Override
	public int getWeatherDuration() {
		return this.world.getWeatherDuration();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getWorldFolder()
	 */
	@Override
	public File getWorldFolder() {
		return this.world.getWorldFolder();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#hasStorm()
	 */
	@Override
	public boolean hasStorm() {
		return this.world.hasStorm();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#isAutoSave()
	 */
	@Override
	public boolean isAutoSave() {
		return this.world.isAutoSave();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#isChunkLoaded(org.bukkit.Chunk)
	 */
	@Override
	public boolean isChunkLoaded(Chunk arg0) {
		return this.world.isChunkLoaded(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#isChunkLoaded(int, int)
	 */
	@Override
	public boolean isChunkLoaded(int arg0, int arg1) {
		return this.world.isChunkLoaded(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#isThundering()
	 */
	@Override
	public boolean isThundering() {
		return this.world.isThundering();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#loadChunk(org.bukkit.Chunk)
	 */
	@Override
	public void loadChunk(Chunk arg0) {
		this.world.loadChunk(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#loadChunk(int, int)
	 */
	@Override
	public void loadChunk(int arg0, int arg1) {
		this.world.loadChunk(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#loadChunk(int, int, boolean)
	 */
	@Override
	public boolean loadChunk(int arg0, int arg1, boolean arg2) {
		return this.world.loadChunk(arg0, arg1, arg2); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#playEffect(org.bukkit.Location, org.bukkit.Effect, int)
	 */
	@Override
	public void playEffect(Location arg0, Effect arg1, int arg2) {
		this.world.playEffect(arg0, arg1, arg2);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#playEffect(org.bukkit.Location, org.bukkit.Effect, int, int)
	 */
	@Override
	public void playEffect(Location arg0, Effect arg1, int arg2, int arg3) {
		this.world.playEffect(arg0, arg1, arg2, arg3);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#refreshChunk(int, int)
	 */
	@Override
	public boolean refreshChunk(int arg0, int arg1) {
		return this.world.refreshChunk(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#regenerateChunk(int, int)
	 */
	@Override
	public boolean regenerateChunk(int arg0, int arg1) {
		return this.regenerateChunk(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#save()
	 */
	@Override
	public void save() {
		this.world.save();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setAutoSave(boolean)
	 */
	@Override
	public void setAutoSave(boolean arg0) {
		this.world.setAutoSave(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setDifficulty(org.bukkit.Difficulty)
	 */
	@Override
	public void setDifficulty(Difficulty arg0) {
		this.world.setDifficulty(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setFullTime(long)
	 */
	@Override
	public void setFullTime(long arg0) {
		this.world.setFullTime(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setKeepSpawnInMemory(boolean)
	 */
	@Override
	public void setKeepSpawnInMemory(boolean arg0) {
		this.world.setKeepSpawnInMemory(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setPVP(boolean)
	 */
	@Override
	public void setPVP(boolean arg0) {
		this.world.setPVP(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setSpawnFlags(boolean, boolean)
	 */
	@Override
	public void setSpawnFlags(boolean arg0, boolean arg1) {
		this.world.setSpawnFlags(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setSpawnLocation(int, int, int)
	 */
	@Override
	public boolean setSpawnLocation(int arg0, int arg1, int arg2) {
		return this.world.setSpawnLocation(arg0, arg1, arg2); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setStorm(boolean)
	 */
	@Override
	public void setStorm(boolean arg0) {
		this.world.setStorm(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setThunderDuration(int)
	 */
	@Override
	public void setThunderDuration(int arg0) {
		this.world.setThunderDuration(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setThundering(boolean)
	 */
	@Override
	public void setThundering(boolean arg0) {
		this.world.setThundering(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setTime(long)
	 */
	@Override
	public void setTime(long arg0) {
		this.world.setTime(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setWeatherDuration(int)
	 */
	@Override
	public void setWeatherDuration(int arg0) {
		this.world.setWeatherDuration(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#spawn(org.bukkit.Location, java.lang.Class)
	 */
	@Override
	public <T extends Entity> T spawn(Location arg0, Class<T> arg1)
			throws IllegalArgumentException {
		return this.world.spawn(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#spawnArrow(org.bukkit.Location, org.bukkit.util.Vector, float, float)
	 */
	@Override
	public Arrow spawnArrow(Location arg0, Vector arg1, float arg2, float arg3) {
		return this.world.spawnArrow(arg0, arg1, arg2, arg3); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#strikeLightning(org.bukkit.Location)
	 */
	@Override
	public LightningStrike strikeLightning(Location arg0) {
		return this.world.strikeLightning(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#strikeLightningEffect(org.bukkit.Location)
	 */
	@Override
	public LightningStrike strikeLightningEffect(Location arg0) {
		return this.world.strikeLightningEffect(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#unloadChunk(org.bukkit.Chunk)
	 */
	@Override
	public boolean unloadChunk(Chunk arg0) {
		return this.world.unloadChunk(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#unloadChunk(int, int)
	 */
	@Override
	public boolean unloadChunk(int arg0, int arg1) {
		return this.world.unloadChunk(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#unloadChunk(int, int, boolean)
	 */
	@Override
	public boolean unloadChunk(int arg0, int arg1, boolean arg2) {
		return this.world.unloadChunk(arg0, arg1, arg2); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#unloadChunk(int, int, boolean, boolean)
	 */
	@Override
	public boolean unloadChunk(int arg0, int arg1, boolean arg2, boolean arg3) {
		return this.world.unloadChunk(arg0, arg1, arg2, arg3); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#unloadChunkRequest(int, int)
	 */
	@Override
	public boolean unloadChunkRequest(int arg0, int arg1) {
		return this.world.unloadChunkRequest(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#unloadChunkRequest(int, int, boolean)
	 */
	@Override
	public boolean unloadChunkRequest(int arg0, int arg1, boolean arg2) {
		return this.world.unloadChunkRequest(arg0, arg1, arg2); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getEntitiesByClass(java.lang.Class[])
	 */
	@Override
	@Deprecated
	public <T extends Entity> Collection<T> getEntitiesByClass(@SuppressWarnings("unchecked") Class<T>... classes) {
		return this.world.getEntitiesByClass(classes);	
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getWorldType()
	 */
	@Override
	public WorldType getWorldType() {
		return this.world.getWorldType();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.plugin.messaging.PluginMessageRecipient#getListeningPluginChannels()
	 */
	@Override
	public Set<String> getListeningPluginChannels() {
		return this.world.getListeningPluginChannels();	
	}

	/* (non-Javadoc)
	 * @see org.bukkit.plugin.messaging.PluginMessageRecipient#sendPluginMessage(org.bukkit.plugin.Plugin, java.lang.String, byte[])
	 */
	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		this.world.sendPluginMessage(source, channel, message);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#canGenerateStructures()
	 */
	@Override
	public boolean canGenerateStructures() {
		return this.world.canGenerateStructures();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getEntitiesByClass(java.lang.Class)
	 */
	@Override
	public <T extends Entity> Collection<T> getEntitiesByClass(Class<T> cls) {
		return this.world.getEntitiesByClass(cls);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getEntitiesByClasses(java.lang.Class<?>[])
	 */
	@Override
	public Collection<Entity> getEntitiesByClasses(Class<?>... classes) {
		return this.world.getEntitiesByClasses(classes);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getTicksPerAnimalSpawns()
	 */
	@Override
	public long getTicksPerAnimalSpawns() {
		return this.world.getTicksPerAnimalSpawns();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#getTicksPerMonsterSpawns()
	 */
	@Override
	public long getTicksPerMonsterSpawns() {
		return this.world.getTicksPerMonsterSpawns();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#playEffect(org.bukkit.Location, org.bukkit.Effect, java.lang.Object)
	 */
	@Override
	public <T> void playEffect(Location location, Effect effect, T data) {
		this.world.playEffect(location, effect, data);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#playEffect(org.bukkit.Location, org.bukkit.Effect, java.lang.Object, int)
	 */
	@Override
	public <T> void playEffect(Location location, Effect effect, T data, int radius) {
		this.world.playEffect(location, effect, data, radius);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setTicksPerAnimalSpawns(int)
	 */
	@Override
	public void setTicksPerAnimalSpawns(int ticksPerAnimalSpawns) {
		this.world.setTicksPerAnimalSpawns(ticksPerAnimalSpawns);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#setTicksPerMonsterSpawns(int)
	 */
	@Override
	public void setTicksPerMonsterSpawns(int ticksPerMonsterSpawns) {
		this.world.setTicksPerAnimalSpawns(ticksPerMonsterSpawns);		
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#spawnCreature(org.bukkit.Location, org.bukkit.entity.EntityType)
	 */
	@Override
	public LivingEntity spawnCreature(Location loc, EntityType type) {
		return this.world.spawnCreature(loc, type);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#getMetadata(java.lang.String)
	 */
	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		return this.world.getMetadata(metadataKey);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#hasMetadata(java.lang.String)
	 */
	@Override
	public boolean hasMetadata(String metadataKey) {
		return this.world.hasMetadata(metadataKey);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#removeMetadata(java.lang.String, org.bukkit.plugin.Plugin)
	 */
	@Override
	public void removeMetadata(String metadataKey, Plugin plugin) {
		this.world.removeMetadata(metadataKey, plugin);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.metadata.Metadatable#setMetadata(java.lang.String, org.bukkit.metadata.MetadataValue)
	 */
	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		this.world.setMetadata(metadataKey, newMetadataValue);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.World#spawnCreature(org.bukkit.Location, org.bukkit.entity.CreatureType)
	 */
	@Override
	@Deprecated
	public LivingEntity spawnCreature(Location loc, CreatureType type) {
		return this.world.spawnCreature(loc, type);
	}

}
