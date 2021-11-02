package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void signUp(User user);
	void login(User user);
}
