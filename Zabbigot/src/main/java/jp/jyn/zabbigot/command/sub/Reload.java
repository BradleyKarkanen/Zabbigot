package jp.jyn.zabbigot.command.sub;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import jp.jyn.zabbigot.Zabbigot;
import jp.jyn.zabbigot.command.SubBase;

public class Reload extends SubBase {

	private final Zabbigot zabbigot;

	public Reload(Zabbigot zabbigot) {
		super("zabbigot.reload");
		this.zabbigot = zabbigot;
	}

	@Override
	protected void exec(CommandSender sender) {
		zabbigot.onDisable();
		zabbigot.onEnable();
		sender.sendMessage("[Zabbigot] " + ChatColor.GREEN + "Zabbigot has been reloaded.");
	}

}
