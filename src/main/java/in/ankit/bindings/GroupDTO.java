package in.ankit.bindings;

import java.util.Set;

import lombok.Data;

@Data
public class GroupDTO {
    private Long id;
    private String name;
    private Set<Long> memberIds;
    private Set<String> memberNames;
}
