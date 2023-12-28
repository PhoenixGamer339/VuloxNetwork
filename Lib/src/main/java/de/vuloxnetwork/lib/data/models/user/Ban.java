package de.vuloxnetwork.lib.data.models.user;

import de.vuloxnetwork.lib.utils.IDGenerator;
import dev.morphia.annotations.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ban {

    private String interalId;

    private String reason;
    private UserInfo issuedBy;

    private Date createdAt;
    private Date end;

    private boolean revoked;
    private UserInfo revokedBy;

    public Ban(String reason, UserInfo issuedBy, Date end) {
        this.interalId = IDGenerator.generateInternalID();

        this.reason = reason;
        this.issuedBy = issuedBy;

        this.createdAt = new Date();
        this.end = end;

        this.revoked = false;
        this.revokedBy = null;
    }
}
