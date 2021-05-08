package odev2;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcısı eklendi.");
	}

	public void addMultipleUser(User[] users) {
		for (User user : users) {
			addUser(user);
		}
	}
}
