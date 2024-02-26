package solventek_project.services;

import solventek_project.entity.User;

public class UserServiceFactroy {
	
	  public static UserService createUserService(User user) {
          switch (user.getRole()) {
              case ADMIN:
                  return new AdminServices();
              case MANAGER:
                  return new ManagerServices();
              case CUSTOMER:
                  return new CustomerServices();
              default:
                  return null;
          }
      }
  }


