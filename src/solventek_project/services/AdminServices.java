package solventek_project.services;

import java.util.Scanner;

public class AdminServices implements UserService {


	@Override
	public void handleUserOperations() {
		Scanner scanner = new Scanner(System.in);

		HealthCareServices healthCareServices = HealthCareServices.getInstance();
		InsuranceServices insuraceServices = InsuranceServices.getInstance();

		while (true) {
			System.out.println("Admin Menu:");
			System.out.println("1. Add Healthcare Product");
			System.out.println("2. Add Insurance Product");
			System.out.println("3. View Healthcare Product");
			System.out.println("4. View Insurance Product");
			System.out.println("5. Exit");

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
				healthCareServices.viewProducts();
				break;
			case 4:
				insuraceServices.viewProducts();
				break;
			case 5:
				return; // Exit the loop
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
			
		}

	
		
	}

		

}
