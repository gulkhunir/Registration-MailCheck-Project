import entities.concretes.User;
import business.concretes.*;
import JGoogle.SignInGoogle;


public class Main {

	public static void main(String[] args) {
		User user1= new User(1,"Mehmet","Guven","guvennmehmet@gmail.com","12345789");
		User user2= new User(2,"Mehmet","Guven","mehmetguven@gmail.com","1sadsad236");
		
		/*PasswordCheckService passwordCheck=new PasswordCheckService();
		MailCheckService mailCheck=new MailCheckService();
		mailCheck.checkMail(user2);		
		ValidationManager validate=new ValidationManager();
		EmailActivationManager activation=new EmailActivationManager();
		FirstNameCheckService checkName=new FirstNameCheckService();
		LastNameCheckService checkName2=new LastNameCheckService();
		SignInGoogle google = new SignInGoogle();*/
	
		UserManager userManager=
				new UserManager(
						new MailCheckService(),
						new PasswordCheckService(),
						new SignInGoogle(),
						new FirstNameCheckService(), 
						new EmailActivationManager(),
						new ValidationManager()
						);
		userManager.save(user1);
		userManager.saveGoogle(user2);
		userManager.LoginIn(user2);
		
	}

}
