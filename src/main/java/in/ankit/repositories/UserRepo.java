package in.ankit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
    User findByUsername(String username);
    User findByEmail(String email);
}
