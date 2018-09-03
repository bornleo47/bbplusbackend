package org.verscend.bbplus.service;

import java.util.Set;

import org.verscend.bbplus.models.User;
import org.verscend.bbplus.privilege.UserRole;

public interface UserService {

	User createUser(User user, Set<UserRole> userRoles);

}
