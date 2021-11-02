package business.concretes;

import entities.concretes.User;

public class PasswordCheckService implements business.abstracts.PasswordCheckService{

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}else {
			return false;
			
		}
		
	}

}
