package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface AuthService {
	void register(User user);

	void login(String email, String password);

	void registerByGoogle(User user);

	void loginByGoogle(String email, String password);
}
