package com.automationpractice.www.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class MyStoreSignInPage {

	public static final Target EMAIL_INPUT = Target.the("email address field in the sign in form")
			.located(By.xpath("//*[@id=\"email\"]"));
	
	public static final Target PASSWORD_INPUT = Target.the("password field in the sign in form")
			.located(By.xpath("//*[@id=\"passwd\"]"));
	
	public static final Target SIGN_IN_BUTTON = Target.the("sign in button in the form")
			.located(By.xpath("//*[@id=\"SubmitLogin\"]"));

}
