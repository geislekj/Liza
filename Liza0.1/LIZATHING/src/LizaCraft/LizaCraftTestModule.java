package LizaCraft;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Server;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.event.Event;
import org.bukkit.plugin.InvalidDescriptionException;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.UnknownDependencyException;

import Liza.LizaServer;
import LizaCraft.Events.LizaPlugin;

public class LizaCraftTestModule {

	private LizaServerThread serverThread;
	private LizaServer server;
	private LizaPlugin eventListener;
	private ServerGrabber serverGrabber = new ServerGrabber();
	private EventEnabler eventEnabler = new EventEnabler();

	private Map<File, Plugin> plugins = new HashMap<File, Plugin>();

	private String name;

	private boolean waiting = false;
	private Event waitingOn;

	public LizaCraftTestModule(String name) {
		this.name = name;

		this.eventListener = new LizaPlugin();
	}

	public LizaCraftTestModule(String name, Server server) {
		this.name = name;

		this.eventListener = new LizaPlugin();
	}

	public String getName() {
		return this.name;
	}

	public void disableEvents() {
		// TODO Auto-generated method stub

	}

	public void enableEvents() {
		this.server.getPluginManager();
		eventEnabler.enableEvents(this.server, this.eventListener);
	}

	/**
	 * Retrieves the LizaCraftServer object
	 * 
	 * @return
	 */
	public LizaServer getServer() {
		// TODO i hate this method
		CraftServer cs = null;
		try { // talk about jury rigging
			while (cs == null) {
				cs = serverGrabber.searchThreads(this);
			}
		} catch (Exception e) {
			this.getServer();
		}
		
		this.server = new LizaCraftServer(cs);
		return (LizaServer) this.server;
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
		this.getServer();
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
		} catch (UnknownDependencyException | InvalidPluginException
				| InvalidDescriptionException e) {
			// TODO Auto-generated catch block
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
