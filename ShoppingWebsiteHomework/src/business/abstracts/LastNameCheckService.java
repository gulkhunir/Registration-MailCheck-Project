package business.abstracts;

import entities.concretes.User;

public interface LastNameCheckService {
	boolean checkLastName(User user);
}
