package LizaCraft;

import java.io.File;
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
import org.bukkit.World.Environment;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;

import com.avaje.ebean.config.ServerConfig;

import Liza.LizaPlayer;
import Liza.LizaServer;

public class LizaCraftServer implements LizaServer {
    private Server server;

    /**
     * LizaCraftServer Constructor
     * 
     * @param server - Bukkit Server
     */
    protected LizaCraftServer(Server server){
        this.server = server;
    }
    
    @Override
    public boolean addRecipe(Recipe arg0) {
        return this.server.addRecipe(arg0);
    }

    @Override
    public void banIP(String arg0) {
        this.server.banIP(arg0);
    }

    @Override
    public int broadcast(String arg0, String arg1) {
        return this.server.broadcast(arg0, arg1); 
    }

    @Override
    public int broadcastMessage(String arg0) {
        return this.server.broadcastMessage(arg0); 
    }

    @Override
    public void configureDbConfig(ServerConfig arg0) {
        this.server.configureDbConfig(arg0);        
    }

    @Override
    public MapView createMap(World arg0) {
        return this.server.createMap(arg0); 
    }

    @Override
    public World createWorld(WorldCreator arg0) {
        return this.server.createWorld(arg0); 
    }

    @Override
    @Deprecated
    public World createWorld(String arg0, Environment arg1) {
        return this.server.createWorld(arg0, arg1); 
    }

    @Override
    @Deprecated
    public World createWorld(String arg0, Environment arg1, long arg2) {
        return this.server.createWorld(arg0, arg1, arg2); 
    }

    @Override
    public World createWorld(String arg0, Environment arg1, ChunkGenerator arg2) {
        return this.createWorld(arg0, arg1, arg2); 
    }

    @Override
    @Deprecated
    public World createWorld(String arg0, Environment arg1, long arg2,
            ChunkGenerator arg3) {
        return this.server.createWorld(arg0, arg1, arg2, arg3); 
    }

    @Override
    public boolean dispatchCommand(CommandSender arg0, String arg1)
            throws CommandException {
        return this.server.dispatchCommand(arg0, arg1); 
    }

    @Override
    public boolean getAllowEnd() {
        return this.server.getAllowEnd();
    }

    @Override
    public boolean getAllowFlight() {
        return this.server.getAllowFlight();
    }

    @Override
    public boolean getAllowNether() {
        return this.server.getAllowNether();
    }

    @Override
    public Set<OfflinePlayer> getBannedPlayers() {
        return this.server.getBannedPlayers();
    }

    @Override
    public String getBukkitVersion() {
        return this.server.getBukkitVersion();
    }

    @Override
    public Map<String, String[]> getCommandAliases() {
        return this.server.getCommandAliases(); 
    }

    @Override
    public ConsoleCommandSender getConsoleSender() {
        return this.server.getConsoleSender();
    }

    @Override
    public GameMode getDefaultGameMode() {
        return this.server.getDefaultGameMode();
    }

    @Override
    public Set<String> getIPBans() {
        return this.server.getIPBans();
    }

    @Override
    public String getIp() {
        return this.server.getIp();
    }

    @Override
    public Logger getLogger() {
        return this.server.getLogger();
    }

    @Override
    public MapView getMap(short arg0) {
        return this.server.getMap(arg0); 
    }

    @Override
    public int getMaxPlayers() {
        return this.server.getMaxPlayers();
    }

    @Override
    public String getName() {
        return this.server.getName();
    }

    @Override
    public OfflinePlayer getOfflinePlayer(String arg0) {
        return this.server.getOfflinePlayer(arg0);
    }

    @Override
    public OfflinePlayer[] getOfflinePlayers() {
        return this.server.getOfflinePlayers();
    }

    @Override
    public boolean getOnlineMode() {
        return this.server.getOnlineMode();
    }

    @Override
    public Player[] getOnlinePlayers() {
        return this.server.getOnlinePlayers();
    }

    @Override
    public Set<OfflinePlayer> getOperators() {
        return this.server.getOperators();
    }

    public LizaPlayer getPlayer(String arg0) {
        return new LizaCraftPlayer(this.server.getPlayer(arg0)); 
    }

    @Override
    public Player getPlayerExact(String arg0) {
        return this.server.getPlayerExact(arg0); 
    }

    @Override
    public PluginCommand getPluginCommand(String arg0) {
        return this.server.getPluginCommand(arg0); 
    }

    @Override
    public PluginManager getPluginManager() {
        return this.server.getPluginManager();
    }

    @Override
    public int getPort() {
        return this.server.getPort();
    }

    @Override
    public BukkitScheduler getScheduler() {
        return this.server.getScheduler();
    }

    @Override
    public String getServerId() {
        return this.server.getServerId();
    }

    @Override
    public String getServerName() {
        return this.server.getServerName();
    }

    @Override
    public ServicesManager getServicesManager() {
        return this.server.getServicesManager();
    }

    @Override
    public int getSpawnRadius() {
        return this.server.getSpawnRadius();
    }

    @Override
    public String getUpdateFolder() {
        return this.server.getUpdateFolder();
    }

    @Override
    public File getUpdateFolderFile() {
        return this.server.getUpdateFolderFile();
    }

    @Override
    public String getVersion() {
        return this.server.getVersion();
    }

    @Override
    public int getViewDistance() {
        return this.server.getViewDistance();
    }

    @Override
    public Set<OfflinePlayer> getWhitelistedPlayers() {
        return this.server.getWhitelistedPlayers();
    }

    @Override
    public World getWorld(String arg0) {
        return this.server.getWorld(arg0); 
    }

    @Override
    public World getWorld(UUID arg0) {
        return this.server.getWorld(arg0);
    }

    @Override
    public File getWorldContainer() {
        return this.server.getWorldContainer();
    }

    @Override
    public List<World> getWorlds() {
        return this.server.getWorlds();
    }

    @Override
    public boolean hasWhitelist() {
        return this.server.hasWhitelist();
    }

    @Override
    public List<Player> matchPlayer(String arg0) {
        return this.server.matchPlayer(arg0);
    }

    @Override
    public void reload() {
        this.server.reload();
    }

    @Override
    public void reloadWhitelist() {
        this.server.reloadWhitelist();
    }

    @Override
    public void savePlayers() {
        this.server.savePlayers();
    }

    @Override
    public void setDefaultGameMode(GameMode arg0) {
        this.server.setDefaultGameMode(arg0);
    }

    @Override
    public void setSpawnRadius(int arg0) {
        this.server.setSpawnRadius(arg0);
    }

    @Override
    public void setWhitelist(boolean arg0) {
        this.server.setWhitelist(arg0);
    }

    @Override
    public void shutdown() {
        this.server.shutdown();
    }

    @Override
    public void unbanIP(String arg0) {
        this.server.unbanIP(arg0);  
    }

    @Override
    public boolean unloadWorld(String arg0, boolean arg1) {
        return this.server.unloadWorld(arg0, arg1); 
    }

    @Override
    public boolean unloadWorld(World arg0, boolean arg1) {
        return this.server.unloadWorld(arg0, arg1); 
    }

    @Override
    public Messenger getMessenger() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean useExactLoginLocation() {
        // TODO Auto-generated method stub
        return false;
    }
}
