package in.ankit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entities.Group;

public interface GroupRepo extends JpaRepository<Group, Long> {
	
    Group findByName(String name);
}
