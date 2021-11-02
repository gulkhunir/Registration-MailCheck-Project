package business.concretes;
import java.util.regex.*;
import entities.concretes.User;

public class FirstNameCheckService implements business.abstracts.FirstNameCheckService{

	@Override
	public boolean checkFirstName(User user) {
		
		String regex="[a-zA-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(user.getFirstName());
		if(matcher.matches()==true) {
			return true;
		}else {
			
			return false;
		}
		
		
		
	}

}
