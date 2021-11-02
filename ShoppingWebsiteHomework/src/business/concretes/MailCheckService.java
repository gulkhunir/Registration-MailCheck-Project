package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entities.concretes.User;

public class MailCheckService implements business.abstracts.MailCheckService{

	@Override
	public boolean checkMail(User user) {
		String regex = "^[a-z0-9](\\.?[a-z0-9]){1,}@g(oogle)?mail\\.com$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(matcher.matches()==true) {
			return true;
		}else {
			return false;
			
		}
		
		
	}

}
