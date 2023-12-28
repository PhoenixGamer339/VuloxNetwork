package de.vuloxnetwork.lib.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import de.vuloxnetwork.lib.data.constants.DatabaseConstants;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import lombok.Getter;

public class MongoDatabase {

    @Getter private Datastore datastore;

    public void init() {
        MongoClient client = MongoClients.create(MongoClientSettings.builder()
                .applyToConnectionPoolSettings(builder -> {
                    builder.minSize(5);
                    builder.maxSize(20);
                    builder.applyConnectionString(new ConnectionString(DatabaseConstants.DATABASE_URI));
                })
                .applyConnectionString(new ConnectionString(DatabaseConstants.DATABASE_URI))
                .build());

        datastore = Morphia.createDatastore(client, DatabaseConstants.DATABASE_NAME);
        System.out.println("[Database] Connection estabilished.");

    }


}
