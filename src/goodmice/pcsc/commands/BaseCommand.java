package goodmice.pcsc.commands;

import org.bukkit.command.TabExecutor;

import goodmice.pcsc.PCSCuirass;

public abstract class BaseCommand implements TabExecutor {
	
	protected PCSCuirass plugin;
	
	public BaseCommand(PCSCuirass plugin) {
		this.plugin = plugin;
	}
	
}
