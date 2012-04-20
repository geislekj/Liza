import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class BobPlugin extends JavaPlugin {
	private Logger log = this.getLogger();
	
	@Override
	public void onEnable() {
		this.log.info("BobPlugin has been enabled");
	}
	
	@Override
	public void onDisable() {
		this.log.info("BobPlugin has been disabled");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("hi")) {
			sender.sendMessage("Hello, " + sender.getName());
			return true;
		}
		return false;
	}
}
