package LizaCraft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.bukkit.craftbukkit.Main;

public class LizaServerThread extends Thread {
	private PrintStream out;
	
	private final String args[] = {"-h", "localhost", "-p", "25565"};
	
	public LizaServerThread(String name) {
		super(name);
		try {
			out = new PrintStream(new FileOutputStream(new File("liza-out.txt"), false));
		} catch (FileNotFoundException e) {
			
		}
	}
	
	public void run() {
		System.setOut(this.out);
		
		Main.main(args);
	}
}
