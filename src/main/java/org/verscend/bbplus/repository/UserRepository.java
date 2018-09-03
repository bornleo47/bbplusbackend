package org.verscend.bbplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.verscend.bbplus.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();
	
	
}
