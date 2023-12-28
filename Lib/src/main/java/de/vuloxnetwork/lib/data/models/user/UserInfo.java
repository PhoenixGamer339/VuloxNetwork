package de.vuloxnetwork.lib.data.models.user;

import dev.morphia.annotations.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private String name;
    private String uuid;

}
