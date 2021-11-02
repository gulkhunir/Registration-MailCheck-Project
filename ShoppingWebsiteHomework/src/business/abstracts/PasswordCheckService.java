package business.abstracts;

import entities.concretes.User;

public interface PasswordCheckService {
	boolean checkPassword(User user);
}
