package business.abstracts;

import entities.concretes.User;

public interface MailCheckService {
	boolean checkMail(User user);
}
