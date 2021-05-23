package eCommerce.business.concretes;

import java.util.Collection;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private final String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public Iterable<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void add(User user) {
		if (rules(user))
			return;
		emailSend(user);
		userDao.add(user, "Veri eklendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void update(User user) {
		if (rules(user))
			return;
		userDao.update(user, "Veri güncellendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void remove(User user) {
		userDao.delete(user, "Veri silindi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void verificationByEmail(User user) {
		user.setConfirm_email(true);
		update(user);
		System.out.println("Email doðrulamasý gerçekleþtirildi.");
	}

	private boolean rules(User user) {
		if (user.getId() <= 0 || user.getFirstName() == "" || user.getLastName() == "" || user.getEmail() == ""
				|| user.getPassword() == "") {
			System.out.println("Tüm alanlar doldurulmalýdýr.");
			return true;
		}

		if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakter olmalýdýr.");
			return true;
		}

		if (!user.getEmail().matches(pattern)) {
			System.out.println("Geçeli bir e-posta giriniz.");
			return true;
		}

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ýsim ve soyisim en az 2 karakter olmalýdýr.");
			return true;
		}

		if (checkEmail(user.getEmail())) {
			System.out.println("Bu email ile daha önce kayýt yapýlmýþ.");
			return true;
		}

		return false;
	}

	private boolean checkEmail(String email) {
		if (((Collection<?>) userDao.getAll()).size() <= 0) {
			return false;
		}

		for (User user : userDao.getAll()) {
			if (user.getEmail() == email) {
				return true;
			}
		}

		return false;
	}

	private void emailSend(User user) {
		System.out.println("Doðrulama emaili gönderildi: " + user.getEmail());
	}

}
