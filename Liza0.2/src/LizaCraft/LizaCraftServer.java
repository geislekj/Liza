/**
 * 
 */
package LizaCraft;

//Java Imports
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import org.bukkit.GameMode;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;

import Liza.LizaServer;
import Liza.LizaWorld;

import com.avaje.ebean.config.ServerConfig;

// TODO: Auto-generated Javadoc
/**
 *  LizeCraftServer is the Liza server representation of
 *  the Bukkit Server class.
 *
 * @author geislekj
 */
public class LizaCraftServer implements LizaServer{
	
	/** The server. */
	private Server server;
	
	/**
	 * LizaCraftServer Constructor.
	 *
	 * @param server - Bukkit Server
	 */
	public LizaCraftServer(Server server){
		this.server = server;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#addRecipe(org.bukkit.inventory.Recipe)
	 */
	@Override
	public boolean addRecipe(Recipe arg0) {
		return this.server.addRecipe(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#banIP(java.lang.String)
	 */
	@Override
	public void banIP(String arg0) {
		this.server.banIP(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#broadcast(java.lang.String, java.lang.String)
	 */
	@Override
	public int broadcast(String arg0, String arg1) {
		return this.server.broadcast(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#broadcastMessage(java.lang.String)
	 */
	@Override
	public int broadcastMessage(String arg0) {
		return this.server.broadcastMessage(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#configureDbConfig(com.avaje.ebean.config.ServerConfig)
	 */
	@Override
	public void configureDbConfig(ServerConfig arg0) {
		this.server.configureDbConfig(arg0);		
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#createMap(org.bukkit.World)
	 */
	@Override
	public MapView createMap(World arg0) {
		return this.server.createMap(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#createWorld(org.bukkit.WorldCreator)
	 */
	@Override
	public World createWorld(WorldCreator arg0) {
		return this.server.createWorld(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#dispatchCommand(org.bukkit.command.CommandSender, java.lang.String)
	 */
	@Override
	public boolean dispatchCommand(CommandSender arg0, String arg1)
			throws CommandException {
		return this.server.dispatchCommand(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getAllowEnd()
	 */
	@Override
	public boolean getAllowEnd() {
		return this.server.getAllowEnd();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getAllowFlight()
	 */
	@Override
	public boolean getAllowFlight() {
		return this.server.getAllowFlight();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getAllowNether()
	 */
	@Override
	public boolean getAllowNether() {
		return this.server.getAllowNether();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getBannedPlayers()
	 */
	@Override
	public Set<OfflinePlayer> getBannedPlayers() {
		return this.server.getBannedPlayers();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getBukkitVersion()
	 */
	@Override
	public String getBukkitVersion() {
		return this.server.getBukkitVersion();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getCommandAliases()
	 */
	@Override
	public Map<String, String[]> getCommandAliases() {
		return this.server.getCommandAliases(); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getConsoleSender()
	 */
	@Override
	public ConsoleCommandSender getConsoleSender() {
		return this.server.getConsoleSender();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getDefaultGameMode()
	 */
	@Override
	public GameMode getDefaultGameMode() {
		return this.server.getDefaultGameMode();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getIPBans()
	 */
	@Override
	public Set<String> getIPBans() {
		return this.server.getIPBans();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getIp()
	 */
	@Override
	public String getIp() {
		return this.server.getIp();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getLogger()
	 */
	@Override
	public Logger getLogger() {
		return this.server.getLogger();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getMap(short)
	 */
	@Override
	public MapView getMap(short arg0) {
		return this.server.getMap(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getMaxPlayers()
	 */
	@Override
	public int getMaxPlayers() {
		return this.server.getMaxPlayers();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getName()
	 */
	@Override
	public String getName() {
		return this.server.getName();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getOfflinePlayer(java.lang.String)
	 */
	@Override
	public OfflinePlayer getOfflinePlayer(String arg0) {
		return this.server.getOfflinePlayer(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getOfflinePlayers()
	 */
	@Override
	public OfflinePlayer[] getOfflinePlayers() {
		return this.server.getOfflinePlayers();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getOnlineMode()
	 */
	@Override
	public boolean getOnlineMode() {
		return this.server.getOnlineMode();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getOnlinePlayers()
	 */
	@Override
	public Player[] getOnlinePlayers() {
		return this.server.getOnlinePlayers();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getOperators()
	 */
	@Override
	public Set<OfflinePlayer> getOperators() {
		return this.server.getOperators();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getPlayer(java.lang.String)
	 */
	@Override
	public Player getPlayer(String arg0) {
		return this.server.getPlayer(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getPlayerExact(java.lang.String)
	 */
	@Override
	public Player getPlayerExact(String arg0) {
		return this.server.getPlayerExact(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getPluginCommand(java.lang.String)
	 */
	@Override
	public PluginCommand getPluginCommand(String arg0) {
		return this.server.getPluginCommand(arg0); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getPluginManager()
	 */
	@Override
	public PluginManager getPluginManager() {
		return this.server.getPluginManager();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getPort()
	 */
	@Override
	public int getPort() {
		return this.server.getPort();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getScheduler()
	 */
	@Override
	public BukkitScheduler getScheduler() {
		return this.server.getScheduler();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getServerId()
	 */
	@Override
	public String getServerId() {
		return this.server.getServerId();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getServerName()
	 */
	@Override
	public String getServerName() {
		return this.server.getServerName();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getServicesManager()
	 */
	@Override
	public ServicesManager getServicesManager() {
		return this.server.getServicesManager();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getSpawnRadius()
	 */
	@Override
	public int getSpawnRadius() {
		return this.server.getSpawnRadius();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getUpdateFolder()
	 */
	@Override
	public String getUpdateFolder() {
		return this.server.getUpdateFolder();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getUpdateFolderFile()
	 */
	@Override
	public File getUpdateFolderFile() {
		return this.server.getUpdateFolderFile();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getVersion()
	 */
	@Override
	public String getVersion() {
		return this.server.getVersion();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getViewDistance()
	 */
	@Override
	public int getViewDistance() {
		return this.server.getViewDistance();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getWhitelistedPlayers()
	 */
	@Override
	public Set<OfflinePlayer> getWhitelistedPlayers() {
		return this.server.getWhitelistedPlayers();
	}

	/* (non-Javadoc)
	 * @see Liza.LizaServer#getWorld(java.lang.String)
	 */
	@Override
	public LizaWorld getWorld(String arg0) {
		return new LizaCraftWorld(this.server.getWorld(arg0)); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getWorld(java.util.UUID)
	 */
	@Override
	public World getWorld(UUID arg0) {
		return this.server.getWorld(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getWorldContainer()
	 */
	@Override
	public File getWorldContainer() {
		return this.server.getWorldContainer();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#getWorlds()
	 */
	@Override
	public List<World> getWorlds() {
		return this.server.getWorlds();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#hasWhitelist()
	 */
	@Override
	public boolean hasWhitelist() {
		return this.server.hasWhitelist();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#matchPlayer(java.lang.String)
	 */
	@Override
	public List<Player> matchPlayer(String arg0) {
		return this.server.matchPlayer(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#reload()
	 */
	@Override
	public void reload() {
		this.server.reload();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#reloadWhitelist()
	 */
	@Override
	public void reloadWhitelist() {
		this.server.reloadWhitelist();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#savePlayers()
	 */
	@Override
	public void savePlayers() {
		this.server.savePlayers();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#setDefaultGameMode(org.bukkit.GameMode)
	 */
	@Override
	public void setDefaultGameMode(GameMode arg0) {
		this.server.setDefaultGameMode(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#setSpawnRadius(int)
	 */
	@Override
	public void setSpawnRadius(int arg0) {
		this.server.setSpawnRadius(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#setWhitelist(boolean)
	 */
	@Override
	public void setWhitelist(boolean arg0) {
		this.server.setWhitelist(arg0);
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#shutdown()
	 */
	@Override
	public void shutdown() {
		this.server.shutdown();
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#unbanIP(java.lang.String)
	 */
	@Override
	public void unbanIP(String arg0) {
		this.server.unbanIP(arg0);	
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#unloadWorld(java.lang.String, boolean)
	 */
	@Override
	public boolean unloadWorld(String arg0, boolean arg1) {
		return this.server.unloadWorld(arg0, arg1); 
	}

	/* (non-Javadoc)
	 * @see org.bukkit.Server#unloadWorld(org.bukkit.World, boolean)
	 */
	@Override
	public boolean unloadWorld(World arg0, boolean arg1) {
		return this.server.unloadWorld(arg0, arg1); 
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#getMessenger()
	 */
	@Override
	public Messenger getMessenger() {
		return this.server.getMessenger();
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.plugin.messaging.PluginMessageRecipient#getListeningPluginChannels()
	 */
	@Override
	public Set<String> getListeningPluginChannels() {
		return this.server.getListeningPluginChannels();
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.plugin.messaging.PluginMessageRecipient#sendPluginMessage(org.bukkit.plugin.Plugin, java.lang.String, byte[])
	 */
	@Override
	public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
		this.server.sendPluginMessage(arg0, arg1, arg2);
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#clearRecipes()
	 */
	@Override
	public void clearRecipes() {
		// TODO Auto-generated method stub
		
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#createInventory(org.bukkit.inventory.InventoryHolder, org.bukkit.event.inventory.InventoryType)
	 */
	@Override
	public Inventory createInventory(InventoryHolder arg0, InventoryType arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#createInventory(org.bukkit.inventory.InventoryHolder, int)
	 */
	@Override
	public Inventory createInventory(InventoryHolder arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#createInventory(org.bukkit.inventory.InventoryHolder, int, java.lang.String)
	 */
	@Override
	public Inventory createInventory(InventoryHolder arg0, int arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#getHelpMap()
	 */
	@Override
	public HelpMap getHelpMap() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#getRecipesFor(org.bukkit.inventory.ItemStack)
	 */
	@Override
	public List<Recipe> getRecipesFor(ItemStack arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#getTicksPerAnimalSpawns()
	 */
	@Override
	public int getTicksPerAnimalSpawns() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#getTicksPerMonsterSpawns()
	 */
	@Override
	public int getTicksPerMonsterSpawns() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#recipeIterator()
	 */
	@Override
	public Iterator<Recipe> recipeIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#resetRecipes()
	 */
	@Override
	public void resetRecipes() {
		// TODO Auto-generated method stub
		
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.Server#useExactLoginLocation()
	 */
	@Override
	public boolean useExactLoginLocation() {
		// TODO Auto-generated method stub
		return false;
	}

}
