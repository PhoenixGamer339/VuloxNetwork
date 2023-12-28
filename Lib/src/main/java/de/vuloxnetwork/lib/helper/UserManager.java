package de.vuloxnetwork.lib.helper;

import de.vuloxnetwork.lib.VuxolLib;
import de.vuloxnetwork.lib.data.models.user.User;
import de.vuloxnetwork.lib.data.models.user.UserInfo;
import dev.morphia.query.filters.Filters;

public class UserManager {

    public User getUserByName(String name) {
        return VuxolLib.getDatabase().getDatastore().find(User.class).filter(Filters.eq("userInfo.name", name)).first();
    }

    public User getUserByUUID(String uuid) {
        return VuxolLib.getDatabase().getDatastore().find(User.class).filter(Filters.eq("userInfo.uuid", uuid)).first();

    }

    public void createUser(UserInfo info) {
        if(userExists(info)) return;

        User user = new User(info);
        VuxolLib.getDatabase().getDatastore().save(user);
        System.out.println("[DB] Inserted " + info.getName() + " | " + info.getUuid());
    }

    public boolean userExists(UserInfo info) {
        return VuxolLib.getDatabase().getDatastore().find(User.class).filter(Filters.eq("userInfo.uuid", info.getUuid())).first() != null;

    }

}
