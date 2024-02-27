package solventek_project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import solventek_project.entity.Product;

public class InsuranceServices implements ProductService{
	
	 private static InsuranceServices instance;

	static List<Product> insuranceProducts;

	static {

		insuranceProducts = new ArrayList<>();

		// Initialize some product examples
		insuranceProducts.add(new Product(3, "Insurace", "HealthInsurance", 500000));
		insuranceProducts.add(new Product(4, "Insurance", "LifeInsurance", 10000000));
	}
	
	 public static  InsuranceServices getInstance() {
	        if (instance == null) {
	            instance = new InsuranceServices();
	        }
	        return instance;
	    }


	@Override
	public void viewProducts() {
		System.out.println("Insurance Products:");
		for (Product product : insuranceProducts) {
			System.out.println(product);
		}

		
	}

	@Override
	public void addProduct() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name of the new Insurance product:");
		String name = scanner.nextLine();

		System.out.println("Enter the price of the new Insurance product:");
		double price = scanner.nextDouble();

		// Generate a new ID for the product
		int id = insuranceProducts.size() + 1;

		// Create a new Product object and add it to the list
		Product newProduct = new Product(id, "Insurance", name, price);
		insuranceProducts.add(newProduct);

		System.out.println("Insurance product added successfully:");
		System.out.println(newProduct);

		
	}

	@Override
	public void updateProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id of the product to update:");
		int id = scanner.nextInt();

		for (Product product : insuranceProducts) {
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
			}}
		
	}

	@Override
	public void removeProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id of the product to update:");
		int id = scanner.nextInt();

		for (Product product : insuranceProducts) {
			if (product.getId().equals(id)) {
				insuranceProducts.remove(product);
				System.out.println("Product removed successfully.");
				return;
			}
		}

		System.out.println("Product not found.");
		
	}

}
