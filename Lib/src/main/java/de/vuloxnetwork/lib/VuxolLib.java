package de.vuloxnetwork.lib;

import de.vuloxnetwork.lib.utils.MongoDatabase;
import lombok.Getter;

public class VuxolLib {

    @Getter private static MongoDatabase database;

    public static void init() {
        database = new MongoDatabase();
        database.init();



    }

}