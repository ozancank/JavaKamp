package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.utilities.GoogleAuthManagerAdapter;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {
	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		userService.add(user);
		System.out.println("Kullanýcý kaydý yapýldý.");
	}

	@Override
	public void login(String email, String password) {
		if (email == "" || password == "") {
			System.out.println("Email ve þifre girilmelidir.");
			return;
		}

		System.out.println("Giriþ baþarýlý");
	}

	@Override
	public void registerByGoogle(User user) {
		GoogleAuthManagerAdapter adapter = new GoogleAuthManagerAdapter();
		adapter.register(user.getId(), user.getEmail(), user.getPassword(), user.getFirstName(), user.getLastName());
	}

	@Override
	public void loginByGoogle(String email, String password) {
		GoogleAuthManagerAdapter adapter = new GoogleAuthManagerAdapter();
		adapter.login(email, password);
	}
}
