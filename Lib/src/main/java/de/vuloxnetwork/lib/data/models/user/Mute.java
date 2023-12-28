package de.vuloxnetwork.lib.data.models.user;

import dev.morphia.annotations.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mute {

    private String interalId;

    private String reason;
    private UserInfo issuedBy;

    private Date createdAt;
    private Date end;

    private boolean revoked;
    private UserInfo revokedBy;

}
