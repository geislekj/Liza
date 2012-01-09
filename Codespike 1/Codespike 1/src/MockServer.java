import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.bukkit.craftbukkit.Main;

public class MockServer extends Thread {
	private PrintStream out;
	
	public MockServer(String name) {
		super(name);
		try {
			out = new PrintStream(new FileOutputStream(new File("liza-out.txt"), false));
		} catch (FileNotFoundException e) {
			
		}
	}
	
	public void run() {
		String args[] = {"-h", "localhost", "-p", "25565"};
		System.setOut(this.out);
		
		Main.main(args);
	}
}
