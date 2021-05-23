package eCommerce;

import java.util.ArrayList;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.dataAccess.concretes.ArrayUserDao;
import eCommerce.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		ArrayList<User> db = new ArrayList<User>();

		UserService userService = new UserManager(new ArrayUserDao(db));
		AuthService authService = new AuthManager(userService);

		User user1 = new User(1, "Ali", "Veli", "ali@veli.com", "Sifre123", false);
		User user2 = new User(2, "Hasan", "Hüseyin", "has", "Sifre123", false);
		User user3 = new User(3, "Mahmut", "Mustafa", "mahmut@mustafa.com", "Sif", false);
		User user4 = new User(4, "M", "M", "mahmut@mustafa.com", "Sifre123", false);
		User user5 = new User(5, "Hakký", "Hikmet", "ali@veli.com", "Sifre123", false);

		userService.add(user1);
		System.out.println("--------------------------------------");
		userService.add(user2);
		System.out.println("--------------------------------------");
		userService.add(user3);
		System.out.println("--------------------------------------");
		userService.add(user4);
		System.out.println("--------------------------------------");
		userService.add(user5);
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		userService.verificationByEmail(user1);
		System.out.println("--------------------------------------");
		userService.remove(user1);
		System.out.println("--------------------------------------");
		authService.registerByGoogle(user1);
		System.out.println("--------------------------------------");
		authService.loginByGoogle("ali@veli.com", "Sifre123");

//		userManager.getAll().forEach(x -> System.out.println(x.getEmail()));
//
//		System.out.println(userManager.getById(1).getFirstName());
//		user1.setFirstName("Mehmet");
//		userManager.update(user1);
//		System.out.println(userManager.getById(1).getFirstName());
//
//		User read = userManager.getById(1);
//		if (read != null) {
//			System.out.println(read.getFirstName());
//		}
	}
}
