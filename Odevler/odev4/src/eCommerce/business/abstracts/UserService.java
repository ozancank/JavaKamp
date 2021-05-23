package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	User getById(int id);

	Iterable<User> getAll();

	void add(User user);

	void update(User user);

	void remove(User user);
}
