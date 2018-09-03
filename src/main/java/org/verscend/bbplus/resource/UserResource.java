package org.verscend.bbplus.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.verscend.bbplus.models.User;
import org.verscend.bbplus.repository.UserRepository;

@RestController
public class UserResource {

	@Autowired
	UserRepository userRepository;

	@PostMapping("saveUser")
	public void save(@RequestBody User user) {
		userRepository.save(user);
	}

	@GetMapping("users")
	public List<User> findUsers() {
		List<User> userList = new ArrayList<>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}

	@DeleteMapping("users/{id}")
	public void deleteUser(int id) {
		userRepository.deleteById((long) id);
	}

	@PutMapping("updateUser")
	public void updateUser(User user) {
		userRepository.save(user);
	}

}
