package de.vuxolnetwork.bungee.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class ExampleCommand extends Command {

    public ExampleCommand() {
        super("example", "bungee.example", "ex");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if(!(sender instanceof ProxiedPlayer p)) {
            sender.sendMessage("Kein Spieler!");
            return;
        }

        p.sendMessage("Hallo :)");




    }
}
