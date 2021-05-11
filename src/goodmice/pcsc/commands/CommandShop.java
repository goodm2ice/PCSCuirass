package goodmice.pcsc.commands;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import goodmice.pcsc.PCSCuirass;

public final class CommandShop extends BaseCommand {

	public CommandShop(PCSCuirass plugin) {
		super(plugin);
	}

	@Override
	public List<String> onTabComplete(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		return null;
	}

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		return false;
	}

}
