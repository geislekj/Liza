package LizaCraft;

import java.lang.reflect.Field;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.ThreadServerApplication;

import org.bukkit.craftbukkit.CraftServer;

public class ServerGrabber {

	private static final String MINECRAFT_SERVER_THREAD_NAME = "Server thread";
	private static final String MINECRAFT_SERVER_FIELD_NAME = "a";

	protected CraftServer searchThreads() {

		Thread[] threads;
		ThreadServerApplication tsa = null;
		
		while (tsa == null) {
			threads = this.getThreads();
			
			tsa = getThreadServerApplication(threads);
		}
		
		MinecraftServer minecraftServer = getMinecraftServer(tsa);

		return minecraftServer.server;
	}

	private MinecraftServer getMinecraftServer(ThreadServerApplication serverThread) {
		Class<? extends ThreadServerApplication> serverThreadClass = serverThread.getClass();
		Field minecraftServerField;
		MinecraftServer minecraftServer = null;
		try {
			minecraftServerField = serverThreadClass.getDeclaredField(MINECRAFT_SERVER_FIELD_NAME);
			minecraftServerField.setAccessible(true);
			minecraftServer = (MinecraftServer) minecraftServerField.get(serverThread);
			minecraftServerField.setAccessible(false);
		} catch (Exception e) { // lol
			// TODO: do some proper exception handling
			e.printStackTrace();
		}
		
		return minecraftServer;
	}

	private ThreadServerApplication getThreadServerApplication(Thread[] threads) {

		ThreadServerApplication serverThread = null;

		for (Thread t : threads) {
			if (t != null && t.getName() != null
					&& t.getName().equals(MINECRAFT_SERVER_THREAD_NAME)) {
				serverThread = (ThreadServerApplication) t;
				break;
			}
		}
		return serverThread;
	}

	private Thread[] getThreads() {

		ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();

		while (rootGroup.getParent() != null) {
			rootGroup = rootGroup.getParent();
		}
		
		Thread threads[] = new Thread[rootGroup.activeCount()];
		
		// activeCount() only provides an estimate for the number of
		// running threads, so this loop ensures that all threads are
		// captured.
		while (rootGroup.enumerate(threads, true) >= threads.length) {
			threads = new Thread[threads.length * 2];
		}
		
		return threads;

	}

}
