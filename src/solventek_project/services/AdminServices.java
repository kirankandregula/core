package solventek_project.services;

import java.util.Scanner;

public class AdminServices implements UserService {


	@Override
	public void handleUserOperations() {
		Scanner scanner = new Scanner(System.in);

		HealthCareServices healthCareServices = new HealthCareServices();
		InsuranceServices insuraceServices = new InsuranceServices();

		while (true) {
			System.out.println("Admin Menu:");
			System.out.println("1. Add Healthcare Product");
			System.out.println("2. Add Insurance Product");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				healthCareServices.addProduct();
				break;
			case 2:
				insuraceServices.addProduct();
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
