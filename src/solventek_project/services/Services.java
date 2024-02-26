package solventek_project.services;

import solventek_project.entity.User;

public class Services {

	 public void handleUserOperations(User user) {
	        UserService userService = UserServiceFactroy.createUserService(user);
	        if (userService != null) {
	            userService.handleUserOperations();
	        } else {
	            System.out.println("Invalid user role");
	        }
	    }

}
