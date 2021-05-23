package eCommerce.core.utilities;

import eCommerce.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter {

	public void register(int id, String email, String password, String firstName, String lastName) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(email, password);
	}

	public void login(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email, password);
	}
}
