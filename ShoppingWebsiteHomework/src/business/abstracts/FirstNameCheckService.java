package business.abstracts;

import entities.concretes.User;

public interface FirstNameCheckService {
	boolean checkFirstName(User user);
}
