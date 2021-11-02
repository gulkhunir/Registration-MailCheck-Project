package business.concretes;

import business.abstracts.ValidationService;
import entities.concretes.User;

public class ValidationManager implements ValidationService{

	@Override
	public void validate(User user) {
		System.out.println("Dogrulama maili gonderildi..");
		
	}

}
