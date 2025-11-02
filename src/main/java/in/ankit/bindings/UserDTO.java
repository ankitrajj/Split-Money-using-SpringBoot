package in.ankit.bindings;

import java.util.Set;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private Set<Long> groupIds;
    private Set<String> groupNames;
}