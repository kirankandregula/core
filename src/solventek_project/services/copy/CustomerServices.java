package solventek_project.services.copy;

import java.util.Scanner;

import solventek_project.controller.AppMain;

public class CustomerServices {


	HealthCareServices healthCareServices = new HealthCareServices();
	InsuranceServices insuraceServices = new InsuranceServices();

	public void handleCustomerOperations() {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Customer Menu:");
			System.out.println("1. View Healthcare Products");
			System.out.println("2. View Insurance Products");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				healthCareServices.viewProducts();
				break;
			case 2:
				insuraceServices.viewProducts();
				break;
			case 3:
				return; // Exit the loop
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
			
		}
	}

}
