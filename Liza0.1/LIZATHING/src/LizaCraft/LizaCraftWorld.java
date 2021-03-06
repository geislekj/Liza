package LizaCraft;

import java.io.File;
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

import Liza.LizaWorld;

/**
 *  LizeCraftWorld is the Liza world representation of
 *  the Bukkit World class.
 *
 * @author geislekj
 */
public class LizaCraftWorld implements LizaWorld{

	private World world;
	
	/**
	 *  LizaCraftWorld Constructor
	 * 
	 * @param world Bukkit World
	 */
	public LizaCraftWorld(World world){
		this.world = world;
	}
	
	@Override
	public boolean createExplosion(Location arg0, float arg1) {
		return this.world.createExplosion(arg0, arg1); 
	}

	@Override
	public boolean createExplosion(Location arg0, float arg1, boolean arg2) {
		return this.world.createExplosion(arg0, arg1, arg2); 
	}

	@Override
	public boolean createExplosion(double arg0, double arg1, double arg2,
			float arg3) {
		return this.world.createExplosion(arg0, arg1, arg2, arg3); 
	}

	@Override
	public boolean createExplosion(double arg0, double arg1, double arg2,
			float arg3, boolean arg4) {
		return this.world.createExplosion(arg0, arg1, arg2, arg3, arg4); 
	}

	@Override
	public Item dropItem(Location arg0, ItemStack arg1) {
		return this.world.dropItem(arg0, arg1); 
	}

	@Override
	public Item dropItemNaturally(Location arg0, ItemStack arg1) {
		return this.world.dropItemNaturally(arg0, arg1); 
	}

	@Override
	public boolean generateTree(Location arg0, TreeType arg1) {
		return this.world.generateTree(arg0, arg1); 
	}

	@Override
	public boolean generateTree(Location arg0, TreeType arg1,
			BlockChangeDelegate arg2) {
		return this.world.generateTree(arg0, arg1, arg2); 
	}

	@Override
	public boolean getAllowAnimals() {
		return this.world.getAllowAnimals();
	}

	@Override
	public boolean getAllowMonsters() {
		return this.world.getAllowMonsters();
	}

	@Override
	public Biome getBiome(int arg0, int arg1) {
		return this.world.getBiome(arg0, arg1); 
	}

	@Override
	public Block getBlockAt(Location arg0) {
		return this.world.getBlockAt(arg0); 
	}

	@Override
	public Block getBlockAt(int arg0, int arg1, int arg2) {
		return this.world.getBlockAt(arg0, arg1, arg2); 
	}

	@Override
	public int getBlockTypeIdAt(Location arg0) {
		return this.world.getBlockTypeIdAt(arg0); 
	}

	@Override
	public int getBlockTypeIdAt(int arg0, int arg1, int arg2) {
		return this.world.getBlockTypeIdAt(arg0, arg1, arg2); 
	}

	@Override
	public Chunk getChunkAt(Location arg0) {
		return this.world.getChunkAt(arg0); 
	}

	@Override
	public Chunk getChunkAt(Block arg0) {
		return this.world.getChunkAt(arg0); 
	}

	@Override
	public Chunk getChunkAt(int arg0, int arg1) {
		return this.world.getChunkAt(arg0, arg1); 
	}

	@Override
	public Difficulty getDifficulty() {
		return this.world.getDifficulty();
	}

	@Override
	public ChunkSnapshot getEmptyChunkSnapshot(int arg0, int arg1,
			boolean arg2, boolean arg3) {
		return this.world.getEmptyChunkSnapshot(arg0, arg1, arg2, arg3); 
	}

	@Override
	public List<Entity> getEntities() {
		return this.world.getEntities();
	}

	@Override
	public Environment getEnvironment() {
		return this.world.getEnvironment();
	}

	@Override
	public long getFullTime() {
		return this.world.getFullTime();
	}

	@Override
	public ChunkGenerator getGenerator() {
		return this.world.getGenerator();
	}

	@Override
	public Block getHighestBlockAt(Location arg0) {
		return this.world.getHighestBlockAt(arg0); 
	}

	@Override
	public Block getHighestBlockAt(int arg0, int arg1) {
		return this.world.getHighestBlockAt(arg0, arg1);
	}

	@Override
	public int getHighestBlockYAt(Location arg0) {
		return this.world.getHighestBlockYAt(arg0);
	}

	@Override
	public int getHighestBlockYAt(int arg0, int arg1) {
		return this.world.getHighestBlockYAt(arg0, arg1); 
	}

	@Override
	public double getHumidity(int arg0, int arg1) {
		return this.world.getHumidity(arg0, arg1); 
	}

	@Override
	public boolean getKeepSpawnInMemory() {
		return this.world.getKeepSpawnInMemory();
	}

	@Override
	public List<LivingEntity> getLivingEntities() {
		return this.world.getLivingEntities();
	}

	@Override
	public Chunk[] getLoadedChunks() {
		return this.world.getLoadedChunks();
	}

	@Override
	public int getMaxHeight() {
		return this.world.getMaxHeight();
	}

	@Override
	public String getName() {
		return this.world.getName();
	}

	@Override
	public boolean getPVP() {
		return this.world.getPVP();
	}

	@Override
	public List<Player> getPlayers() {
		return this.world.getPlayers();
	}

	@Override
	public List<BlockPopulator> getPopulators() {
		return this.world.getPopulators();
	}

	@Override
	public int getSeaLevel() {
		return this.world.getSeaLevel();
	}

	@Override
	public long getSeed() {
		return this.world.getSeed();
	}

	@Override
	public Location getSpawnLocation() {
		return this.world.getSpawnLocation();
	}

	@Override
	public double getTemperature(int arg0, int arg1) {
		return this.world.getTemperature(arg0, arg1); 
	}

	@Override
	public int getThunderDuration() {
		return this.world.getThunderDuration();
	}

	@Override
	public long getTime() {
		return this.world.getTime();
	}

	@Override
	public UUID getUID() {
		return this.world.getUID();
	}

	@Override
	public int getWeatherDuration() {
		return this.world.getWeatherDuration();
	}

	@Override
	public File getWorldFolder() {
		return this.world.getWorldFolder();
	}

	@Override
	public boolean hasStorm() {
		return this.world.hasStorm();
	}

	@Override
	public boolean isAutoSave() {
		return this.world.isAutoSave();
	}

	@Override
	public boolean isChunkLoaded(Chunk arg0) {
		return this.world.isChunkLoaded(arg0);
	}

	@Override
	public boolean isChunkLoaded(int arg0, int arg1) {
		return this.world.isChunkLoaded(arg0, arg1); 
	}

	@Override
	public boolean isThundering() {
		return this.world.isThundering();
	}

	@Override
	public void loadChunk(Chunk arg0) {
		this.world.loadChunk(arg0);
	}

	@Override
	public void loadChunk(int arg0, int arg1) {
		this.world.loadChunk(arg0, arg1);
	}

	@Override
	public boolean loadChunk(int arg0, int arg1, boolean arg2) {
		return this.world.loadChunk(arg0, arg1, arg2); 
	}

	@Override
	public void playEffect(Location arg0, Effect arg1, int arg2) {
		this.world.playEffect(arg0, arg1, arg2);
	}

	@Override
	public void playEffect(Location arg0, Effect arg1, int arg2, int arg3) {
		this.world.playEffect(arg0, arg1, arg2, arg3);
	}

	@Override
	public boolean refreshChunk(int arg0, int arg1) {
		return this.world.refreshChunk(arg0, arg1); 
	}

	@Override
	public boolean regenerateChunk(int arg0, int arg1) {
		return this.regenerateChunk(arg0, arg1); 
	}

	@Override
	public void save() {
		this.world.save();
	}

	@Override
	public void setAutoSave(boolean arg0) {
		this.world.setAutoSave(arg0);
	}

	@Override
	public void setDifficulty(Difficulty arg0) {
		this.world.setDifficulty(arg0);
	}

	@Override
	public void setFullTime(long arg0) {
		this.world.setFullTime(arg0);
	}

	@Override
	public void setKeepSpawnInMemory(boolean arg0) {
		this.world.setKeepSpawnInMemory(arg0);
	}

	@Override
	public void setPVP(boolean arg0) {
		this.world.setPVP(arg0);
	}

	@Override
	public void setSpawnFlags(boolean arg0, boolean arg1) {
		this.world.setSpawnFlags(arg0, arg1);
	}

	@Override
	public boolean setSpawnLocation(int arg0, int arg1, int arg2) {
		return this.world.setSpawnLocation(arg0, arg1, arg2); 
	}

	@Override
	public void setStorm(boolean arg0) {
		this.world.setStorm(arg0);
	}

	@Override
	public void setThunderDuration(int arg0) {
		this.world.setThunderDuration(arg0);
	}

	@Override
	public void setThundering(boolean arg0) {
		this.world.setThundering(arg0);
	}

	@Override
	public void setTime(long arg0) {
		this.world.setTime(arg0);
	}

	@Override
	public void setWeatherDuration(int arg0) {
		this.world.setWeatherDuration(arg0);
	}

	@Override
	public <T extends Entity> T spawn(Location arg0, Class<T> arg1)
			throws IllegalArgumentException {
		return this.world.spawn(arg0, arg1); 
	}

	@Override
	public Arrow spawnArrow(Location arg0, Vector arg1, float arg2, float arg3) {
		return this.world.spawnArrow(arg0, arg1, arg2, arg3); 
	}

	@Override
	public LivingEntity spawnCreature(Location arg0, CreatureType arg1) {
		return this.world.spawnCreature(arg0, arg1); 
	}

	@Override
	public LightningStrike strikeLightning(Location arg0) {
		return this.world.strikeLightning(arg0);
	}

	@Override
	public LightningStrike strikeLightningEffect(Location arg0) {
		return this.world.strikeLightningEffect(arg0); 
	}

	@Override
	public boolean unloadChunk(Chunk arg0) {
		return this.world.unloadChunk(arg0); 
	}

	@Override
	public boolean unloadChunk(int arg0, int arg1) {
		return this.world.unloadChunk(arg0, arg1);
	}

	@Override
	public boolean unloadChunk(int arg0, int arg1, boolean arg2) {
		return this.world.unloadChunk(arg0, arg1, arg2); 
	}

	@Override
	public boolean unloadChunk(int arg0, int arg1, boolean arg2, boolean arg3) {
		return this.world.unloadChunk(arg0, arg1, arg2, arg3); 
	}

	@Override
	public boolean unloadChunkRequest(int arg0, int arg1) {
		return this.world.unloadChunkRequest(arg0, arg1); 
	}

	@Override
	public boolean unloadChunkRequest(int arg0, int arg1, boolean arg2) {
		return this.world.unloadChunkRequest(arg0, arg1, arg2); 
	}

	@Override
	public <T extends Entity> Collection<T> getEntitiesByClass(Class<T>... arg0) {
		return this.world.getEntitiesByClass(arg0);	
	}

	@Override
	public WorldType getWorldType() {
		return this.world.getWorldType();
	}

	@Override
	public Set<String> getListeningPluginChannels() {
		return this.world.getListeningPluginChannels();	
	}

	@Override
	public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
		this.world.sendPluginMessage(arg0, arg1, arg2);
	}

	@Override
	public boolean canGenerateStructures() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T extends Entity> Collection<T> getEntitiesByClass(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Entity> getEntitiesByClasses(Class<?>... arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getTicksPerAnimalSpawns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getTicksPerMonsterSpawns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> void playEffect(Location arg0, Effect arg1, T arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void playEffect(Location arg0, Effect arg1, T arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTicksPerAnimalSpawns(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTicksPerMonsterSpawns(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LivingEntity spawnCreature(Location arg0, EntityType arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MetadataValue> getMetadata(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasMetadata(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeMetadata(String arg0, Plugin arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMetadata(String arg0, MetadataValue arg1) {
		// TODO Auto-generated method stub
		
	}

}
