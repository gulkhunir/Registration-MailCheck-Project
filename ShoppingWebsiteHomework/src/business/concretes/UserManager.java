package business.concretes;

import JGoogle.GoogleRegisterService;
import business.abstracts.UsersService;
import entities.concretes.User;

public class UserManager implements UsersService{

	private MailCheckService mailCheck;
	private PasswordCheckService passwordCheck;
	private GoogleRegisterService google;
	private FirstNameCheckService checkFirstName;
	private EmailActivationManager emailActivationManager;
	private ValidationManager validationManager;
	
	
	
	
	
	
	public UserManager(MailCheckService mailCheck, PasswordCheckService passwordCheck, GoogleRegisterService google,
			FirstNameCheckService checkFirstName,EmailActivationManager emailActivationManager, ValidationManager validationManager) {
		super();
		this.mailCheck = mailCheck;
		this.passwordCheck = passwordCheck;
		this.google = google;
		this.checkFirstName = checkFirstName;
		this.emailActivationManager = emailActivationManager;
		this.validationManager = validationManager;
	}

	@Override
	public void save(User user) {
		if(mailCheck.checkMail(user)== true &&
		passwordCheck.checkPassword(user)== true &&
		checkFirstName.checkFirstName(user)== true) {
			validationManager.validate(user);
			if(emailActivationManager.activate(user)== true) {
				System.out.println("Email is activated "+ user.getEmail());
				System.out.println("User saved on system "+ user.getFirstName());
			}else{
				System.out.println("Please validate your email.");
			}
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Account deleted..");
		
	}

	@Override
	public void upDate(User user) {
	if(mailCheck.checkMail(user)==true &&
		passwordCheck.checkPassword(user)==true){
			System.out.println("Settings updated..");
		}else {
			System.out.println("Wrong mail or password. Please try again1..");
		}
		
	}

	@Override
	public void LoginIn(User user) {
		if(mailCheck.checkMail(user)==true &&
				passwordCheck.checkPassword(user)==true){
			System.out.println("Logged in "+user.getFirstName());
			}else {
				System.out.println("Wrong mail or password. Please try again2..");
			}
		}

	@Override
	public void saveGoogle(User user) {
		google.googleAdd("Logged in with Google Account" + user.getEmail());
		
	}

}
