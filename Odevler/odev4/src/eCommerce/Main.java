package eCommerce;

import java.util.ArrayList;

import eCommerce.business.concretes.UserManager;
import eCommerce.dataAccess.concretes.ArrayUserDao;
import eCommerce.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		ArrayList<User> db = new ArrayList<User>();

		UserManager userManager = new UserManager(new ArrayUserDao(db));

		User user1 = new User(1, "Ali", "Veli", "ali@veli.com", "Sifre123", false);
		User user2 = new User(2, "Hasan", "Hüseyin", "has", "Sifre123", false);
		User user3 = new User(3, "Mahmut", "Mustafa", "mahmut@mustafa.com", "Sif", false);
		User user4 = new User(4, "M", "M", "mahmut@mustafa.com", "Sifre123", false);
		User user5 = new User(5, "Hakký", "Hikmet", "ali@veli.com", "Sifre123", false);

		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		userManager.add(user4);
		userManager.add(user5);

//		userManager.getAll().forEach(x -> System.out.println(x.getEmail()));
//
//		System.out.println(userManager.getById(1).getFirstName());
//		user1.setFirstName("Mehmet");
//		userManager.update(user1);
//		System.out.println(userManager.getById(1).getFirstName());
//
//		userManager.remove(user1);
//		User read = userManager.getById(1);
//		if (read != null) {
//			System.out.println(read.getFirstName());
//		}
	}
}
