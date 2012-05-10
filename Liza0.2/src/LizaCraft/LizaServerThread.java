package LizaCraft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.bukkit.craftbukkit.Main;

// TODO: Auto-generated Javadoc
/**
 * The Class LizaServerThread.
 */
public class LizaServerThread extends Thread {

/** The out. */
private PrintStream out;
    
    /** The args. */
    private final String args[] = {"-h", "localhost", "-p", "25565"};
    
    /**
     * Instantiates a new liza server thread.
     *
     * @param name the name
     */
    public LizaServerThread(String name) {
        super(name);
        try {
            out = new PrintStream(new FileOutputStream(new File("liza-out.txt"), false));
        } catch (FileNotFoundException e) {
            
        }
    }
    
    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    public void run() {
        System.setOut(this.out);
        
        Main.main(args);
    }
}
