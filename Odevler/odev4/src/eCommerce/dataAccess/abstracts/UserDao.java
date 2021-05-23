package eCommerce.dataAccess.abstracts;

import eCommerce.core.abstracts.EntityRepository;
import eCommerce.entities.concretes.User;

public interface UserDao extends EntityRepository<User, Integer> {
}
