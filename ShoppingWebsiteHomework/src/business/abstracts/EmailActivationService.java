package business.abstracts;

import entities.concretes.User;

public interface EmailActivationService {
	boolean activate(User user);
}
