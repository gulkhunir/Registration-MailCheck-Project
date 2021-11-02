package core.concretes;

import JGoogle.SignInGoogle;
import core.abstracts.JGoogleService;

public class JGoogleManagerAdaptor implements JGoogleService{

	@Override
	public void add(String message) {
	SignInGoogle googleSignIn = new SignInGoogle();
	googleSignIn.googleAdd(message);
		
	}

}
