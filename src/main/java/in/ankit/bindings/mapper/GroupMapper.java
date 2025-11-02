package in.ankit.bindings.mapper;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import in.ankit.bindings.GroupDTO;
import in.ankit.entities.Group;
import in.ankit.entities.User;

@Component
public class GroupMapper {

    public GroupDTO toDTO(Group group) {
        GroupDTO dto = new GroupDTO();
        dto.setId(group.getId());
        dto.setName(group.getName());
        dto.setMemberIds(group.getMembers().stream().map(User::getId).collect(Collectors.toSet()));
        dto.setMemberNames(group.getMembers().stream().map(User::getUsername).collect(Collectors.toSet()));
        return dto;
    }

    public Group toEntity(GroupDTO dto) {
        Group group = new Group();
        group.setId(dto.getId());
        group.setName(dto.getName());
        return group;
    }
}
