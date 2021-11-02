package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void signUp(User user) {
		System.out.println("Saved on DB successfully : " + user.getFirstName());
		System.out.println("Validation e-mail sended. Please check "+user.getEmail()+"'s inbox. ");
	}

	@Override
	public void login(User user) {
		System.out.println("Welcome " + user.getFirstName());
		
	}

}
