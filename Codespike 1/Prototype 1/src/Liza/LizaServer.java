package Liza;

import java.lang.reflect.Field;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.ThreadServerApplication;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Player;

public class LizaServer {
	public static final String MINECRAFT_SERVER_THREAD_NAME = "Server thread";
	public static final String MINECRAFT_SERVER_FIELD_NAME = "a";
	
	private final CraftServer cs;
	private final LizaServerThread lst;
	
	public LizaServer() {
		this.lst = new LizaServerThread("Liza Server Thread");
		this.lst.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
		}
		
		this.cs = getCraftServer();
	}
	
	private CraftServer getCraftServer() {
		ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
		
		while (rootGroup.getParent() != null) {
			rootGroup = rootGroup.getParent();
		}
		
		Thread threads[] = new Thread[rootGroup.activeCount()];
		
		// activeCount() only provides an estimate for the number of
		// running threads, so this loop ensures that all threads are
		// captured.
		while ( rootGroup.enumerate(threads, true) >= threads.length) {
			threads = new Thread[threads.length * 2];
		}
		
		// This is the Minecraft thread that is running the server
		ThreadServerApplication tsa = null;
		
		for (Thread t : threads) {
			if (t != null && t.getName() != null && t.getName().equals(MINECRAFT_SERVER_THREAD_NAME)) {
				tsa = (ThreadServerApplication)t;
				break;
			}
		}
		
		Class<? extends ThreadServerApplication> c = tsa.getClass();
		Field f;
		MinecraftServer ms = null;
		try {
			f = c.getDeclaredField(MINECRAFT_SERVER_FIELD_NAME);
			f.setAccessible(true);
			ms = (MinecraftServer)f.get(tsa);
		} catch (Exception e) { //lol
			
		}
		
		return ms.server;
	}
	
	public void stop() {
		cs.shutdown();
		lst.interrupt();
	}
	
	public int broadcastMessage(String message) {
		return cs.broadcastMessage(message);
	}
	
	public Player[] getOnlinePlayers() {
		return (cs.getOnlinePlayers());
	}
	
}