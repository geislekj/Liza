package LizaCraft;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.minecraft.server.EntityPlayer;
import net.minecraft.server.ItemInWorldManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.NetLoginHandler;
import net.minecraft.server.NetServerHandler;
import net.minecraft.server.NetworkListenThread;
import net.minecraft.server.NetworkManager;
import net.minecraft.server.Packet1Login;
import net.minecraft.server.ServerConfigurationManager;
import net.minecraft.server.ThreadServerApplication;
import net.minecraft.server.WorldServer;

import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.event.Event;
import org.bukkit.plugin.InvalidDescriptionException;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.UnknownDependencyException;
import org.bukkit.plugin.java.JavaPlugin;

import Liza.LizaServer;
import LizaCraft.Events.EventEnabler;
import LizaCraft.Events.LizaPlugin;

public class LizaCraftTestModule {	
	private ServerGrabber serverGrabber = new ServerGrabber();
	private EventEnabler eventEnabler = new EventEnabler();

	private LizaServerThread serverThread;
	private LizaServer server;
	private LizaPlugin eventListener;

	private String name;

	private boolean waiting = false;
	private Event waitingOn;

	private Map<File, Plugin> plugins = new HashMap<File, Plugin>();

	public LizaCraftTestModule(String name) {
		this.name = name;

		this.eventListener = new LizaPlugin();
	}

	public LizaCraftTestModule(String name, Server server) {
		this(name);
		this.server = new LizaCraftServer(server);
	}

	public String getName() {
		return this.name;
	}

	public void disableEvents() {
		this.server.getPluginManager().disablePlugin(this.eventListener);
	}

	@SuppressWarnings("unchecked")
	public void enableEvents() {
		eventEnabler.enableEvents(this.server, this.eventListener);
	}

	/**
	 * Retrieves the LizaCraftServer object
	 * 
	 * @return
	 */
	public LizaServer getServer() {
		return this.server;
	}
	
	public Event waitForEvent(Class<? extends Event> event) {
		this.waiting = true;
		this.eventListener.waitForEvent(event, this);
		while (this.waiting) {
		}
		return this.waitingOn;
	}

	public void release(Event event) {
		this.waitingOn = event;
		this.waiting = false;
	}

	public LizaPlugin getEventListener() {
		return this.eventListener;
	}

	/**
	 * Starts the thread that runs the server
	 */
	public void startModule() {
		this.serverThread = new LizaServerThread(this.name);
		this.serverThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		this.server = new LizaCraftServer(this.serverGrabber.searchThreads());
	}

	public void endModule() {
		this.server.shutdown();
		this.serverThread.interrupt();
	}

	public void spoofEvent(Event e) {
		this.server.getPluginManager().callEvent(e);
	}

	public Plugin loadPlugin(File file) {
		Plugin ret = null;

		try {
			ret = this.server.getPluginManager().loadPlugin(file);
			this.server.getPluginManager().enablePlugin(ret);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (ret != null) {
			this.plugins.put(file, ret);
		}

		return ret;
	}

	public void disablePlugin(final File file) {
		Plugin plugin = this.plugins.get(file);

		if (plugin != null) {
			this.server.getPluginManager().disablePlugin(plugin);
		}
	}
}
