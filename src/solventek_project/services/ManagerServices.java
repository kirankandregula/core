package solventek_project.services;

import java.util.Scanner;

public class ManagerServices implements UserService{

	HealthCareServices healthCareServices = HealthCareServices.getInstance();
	InsuranceServices insuraceServices = InsuranceServices.getInstance();

	public void handleUserOperations() {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Manager Menu:");
			System.out.println("1. Update Healthcare Product");
			System.out.println("2. Remove Healthcare Product");
			System.out.println("3. Update Insurance Product");
			System.out.println("4. Remove Insurance Product");
			System.out.println("5. View HealthCare Prouduct");
			System.out.println("6. View Insurance Products");
			System.out.println("7. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				healthCareServices.updateProduct();;
				break;
			case 2:
				healthCareServices.removeProduct();
				break;
			case 3:
				insuraceServices.updateProduct();
				break;
			case 4:
				insuraceServices.removeProduct();
				break;
			case 5:
				healthCareServices.viewProducts();
			case 6:
				insuraceServices.viewProducts();
			case 7:
				return; // Exit the loop
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
		}
	}

}
