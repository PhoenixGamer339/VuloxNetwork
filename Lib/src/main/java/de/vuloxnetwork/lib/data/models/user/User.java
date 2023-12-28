package de.vuloxnetwork.lib.data.models.user;

import dev.morphia.annotations.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.List;

@Entity("users")
@Indexes(value = {
        @Index(options = @IndexOptions(name = "userInfo.name"), fields = @Field("userInfo.name")),
        @Index(options = @IndexOptions(name = "userInfo.uuid"), fields = @Field("userInfo.uuid")),
        @Index(options = @IndexOptions(name = "ban.revoked"), fields = @Field("ban.revoked")) /* Todo: testen */
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private ObjectId id;

    private UserInfo userInfo;
    private long playtimeMinutes;
    private int tokens;

    private String verfiedId;

    private List<Ban> bans;
    private List<Mute> mutes;

    //Todo: History

    public User(UserInfo userInfo) {
        this.userInfo = userInfo;
        this.playtimeMinutes = 0;
        this.tokens = 0;
    }

    public boolean isBanned() {
        return bans.stream().anyMatch(ban -> !ban.isRevoked());
    }
    public boolean isMuted() {
        return mutes.stream().anyMatch(mute -> !mute.isRevoked());
    }

    public Ban createBan(String reason, UserInfo issuedBy) {
        Ban ban = new Ban("")
    }

}
