package solventek_project.services.copy;

import solventek_project.entity.User;

public class Services {

	public void handleUserOperations(User user) {

		
		
		switch (user.getRole()) {

		case ADMIN:
			AdminServices adminServices = new AdminServices();
			adminServices.handleAdminOperations();
			break;
		case MANAGER:
			ManagerServices managerServices = new ManagerServices();
			managerServices.handleManagerOperations();
			break;
		case CUSTOMER:
			CustomerServices customerServices = new CustomerServices();
			customerServices.handleCustomerOperations();
			break;
		default:
			System.out.println("Invalid user role");
			break;
		}
	}

}
