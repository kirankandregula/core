package solventek_project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import solventek_project.entity.Product;

public class HealthCareServices implements ProductService {
	
	private static HealthCareServices instance;

	static List<Product> healthCareProducts;
	

	static {

		healthCareProducts = new ArrayList<>();

		// Initialize some product examples
		healthCareProducts.add(new Product(1, "HealthCare", "Cardio", 20000));
		healthCareProducts.add(new Product(2, "Healthcare", "Dermatlology", 10000));

	}
	
	  public static  HealthCareServices getInstance() {
	        if (instance == null) {
	            instance = new HealthCareServices();
	        }
	        return instance;
	    }

	

	@Override
	public void viewProducts() {
		System.out.println("Healthcare Products:");
		for (Product product : healthCareProducts) {
			System.out.println(product);
		}
		
	}

	@Override
	public void addProduct() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name of the new health product:");
		String name = scanner.nextLine();

		System.out.println("Enter the price of the new health product:");
		double price = scanner.nextDouble();

		// Generate a new ID for the product
		int id = healthCareProducts.size() + 1;

		// Create a new Product object and add it to the list
		Product newProduct = new Product(id, "Healthcare", name, price);
		healthCareProducts.add(newProduct);

		System.out.println("Healthcare product added successfully:");
		System.out.println(newProduct);
		
	}

	@Override
	public void updateProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id of the product to update:");
		int id = scanner.nextInt();

		for (Product product : healthCareProducts) {
			if (product.getId().equals(id)) {

				System.out.println("Enter new name for " + product.getName() + ":");
				String newName = scanner.nextLine();
				scanner.nextLine(); // Consume newline

				System.out.println("Enter new price for " + product.getName() + ":");
				double newPrice = scanner.nextDouble();
				scanner.nextLine(); // Consume newline

				product.setPrice(newPrice);
				product.setName(newName);
				System.out.println("Product updated successfully:");
				System.out.println(product);
				return;
			}
			
		}

		System.out.println("Product not found.");
	
		
	}

	@Override
	public void removeProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id of the product to update:");
		int id = scanner.nextInt();

		for (Product product : healthCareProducts) {
			if (product.getId().equals(id)) {
				healthCareProducts.remove(product);
				System.out.println("Product removed successfully.");
				return;
			}
			
		}
	
		System.out.println("Product not found.");
		
	}

}
