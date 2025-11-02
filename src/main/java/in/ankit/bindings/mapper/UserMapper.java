package in.ankit.bindings.mapper;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import in.ankit.bindings.UserDTO;
import in.ankit.entities.Group;
import in.ankit.entities.User;

@Component
public class UserMapper {

    public UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setGroupIds(user.getGroups().stream().map(Group::getId).collect(Collectors.toSet()));
        dto.setGroupNames(user.getGroups().stream().map(Group::getName).collect(Collectors.toSet()));
        return dto;
    }

    public User toEntity(UserDTO dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        return user;
    }
}
