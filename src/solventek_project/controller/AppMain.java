package solventek_project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import solventek_project.entity.User;
import solventek_project.entity.UserRole;
import solventek_project.services.Services;

public class AppMain {

	private static List<User> users = new ArrayList<>();

	public static void main(String[] args) {

		// initialize some user examples
		users.add(new User("kiran", "kiran@123", UserRole.ADMIN));
		users.add(new User("satish", "satish@123", UserRole.MANAGER));
		users.add(new User("lokesh", "lokesh@123", UserRole.CUSTOMER));
		users.add(new User("sumith","sumith@123",UserRole.CUSTOMER));
		users.add(new User("raheem","raheem@123",UserRole.CUSTOMER));

		// authenticate User
		Scanner scanner = new Scanner(System.in);

		User currentUser = null;

		System.out.println("Enter username: ");
		String userName = scanner.nextLine();
		System.out.println("Enter password: ");
		String passWord = scanner.nextLine();

		currentUser = authenticateUser(userName, passWord);
		if (currentUser != null) {
			System.out.println("Login successful... Welcome " + currentUser.getUserName());
			Services services = new Services();
			services.handleUserOperations(currentUser);

		} else {
			System.out.println("Invalid username and password");
		}

		scanner.close();

	}

	private static User authenticateUser(String userName, String passWord) {

		for (User user : users) {
			if (user.getUserName().equals(userName) && user.getPassWord().equals(passWord)) {
				return user;
			}
		}
		return null;
	}

}
