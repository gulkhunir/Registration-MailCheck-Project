package business.concretes;

import business.abstracts.EmailActivationService;
import entities.concretes.User;

public class EmailActivationManager implements EmailActivationService{

	@Override
	public boolean activate(User user) {
		
		return true;
	}

}
