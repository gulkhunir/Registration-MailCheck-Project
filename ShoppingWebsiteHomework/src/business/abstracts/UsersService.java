package business.abstracts;

import entities.concretes.User;

public interface UsersService {


	void save(User user);
	void delete(User user);
	void upDate(User user);
	void saveGoogle(User user);
	void LoginIn(User user);
}