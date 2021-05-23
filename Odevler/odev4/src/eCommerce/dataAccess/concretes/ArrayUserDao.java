package eCommerce.dataAccess.concretes;

import java.util.ArrayList;

import eCommerce.core.concretes.ArrayEntityRespository;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class ArrayUserDao extends ArrayEntityRespository<User, Integer> implements UserDao {

	public ArrayUserDao(ArrayList<User> list) {
		super(list);
	}
}
