package odev2;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c�s� eklendi.");
	}

	public void addMultipleUser(User[] users) {
		for (User user : users) {
			addUser(user);
		}
	}
}
