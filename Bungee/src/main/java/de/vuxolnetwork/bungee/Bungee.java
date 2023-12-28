package de.vuxolnetwork.bungee;

import de.vuloxnetwork.lib.VuxolLib;
import de.vuxolnetwork.bungee.commands.ExampleCommand;
import dev.morphia.Datastore;
import lombok.Getter;
import net.md_5.bungee.api.plugin.Plugin;

public class Bungee extends Plugin {

    @Getter private static Bungee instance;

    @Getter private static Datastore datastore;


    @Override
    public void onEnable() {
        instance = this;

        VuxolLib.init();
        datastore = VuxolLib.getDatabase().getDatastore();

        getProxy().getPluginManager().registerCommand(this, new ExampleCommand());

        /*
        *
        *
        * Ban-Command
        *   - /ban <Spieler> <ID>
        *
        *
        *
        * */
    }

    @Override
    public void onDisable() {

    }
}
