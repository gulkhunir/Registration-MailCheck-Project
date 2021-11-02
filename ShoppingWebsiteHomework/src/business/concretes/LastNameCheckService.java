package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entities.concretes.User;

public class LastNameCheckService implements business.abstracts.LastNameCheckService{

	@Override
	public boolean checkLastName(User user) {
	
	String regex = "[A-Za-z]{2,}";
	Pattern pattern=Pattern.compile(regex);
	
	Matcher matcher=pattern.matcher(user.getLastName());
	if(matcher.matches()==true) {
		return true;
	}else {
		return false;
		}
	
	}

}
