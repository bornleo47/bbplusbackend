package org.verscend.bbplus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.verscend.bbplus.service.UserService;

@SpringBootApplication
public class BbplusApplication {

	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(BbplusApplication.class, args);
}

	/*
	@Override
	public void run(String... args) throws Exception {
	User user1 = new User();
		
		user1.setFirstName("Anuk");
		user1.setLastName("Shakya");
		user1.setUsername("admin");
		user1.setPassword("admin");
		user1.setEmail("bornleo47@outlook.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
		
		userRoles.clear();
		
	}
	*/
	
	
	
	
}
