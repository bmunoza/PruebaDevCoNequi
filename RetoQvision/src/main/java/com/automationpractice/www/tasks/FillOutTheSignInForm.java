package com.automationpractice.www.tasks;

import com.automationpractice.www.exceptions.FillOutTheSignInFormException;
import com.automationpractice.www.userinterfaces.MyStoreSignInPage;
import org.openqa.selenium.NoSuchElementException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.automationpractice.www.userinterfaces.MyStoreHomePage.SIGN_IN_HOME_BUTTON;
import static com.automationpractice.www.userinterfaces.MyStoreSignInPage.SIGN_IN_BUTTON;


public class FillOutTheSignInForm implements Task {

	private String emailAddress;
	private String password;

	public FillOutTheSignInForm(String emailAddress, String password) {
		this.emailAddress = emailAddress;
		this.password = password;
	}

	@Override
	@Step("{0} fills out the form to login in My Store page fromTheList the email #emailAdress and the password #password")
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Click.on(SIGN_IN_HOME_BUTTON),
					Enter.theValue(emailAddress).into(MyStoreSignInPage.EMAIL_INPUT),
					Enter.theValue(password).into(MyStoreSignInPage.PASSWORD_INPUT),
					Click.on(SIGN_IN_BUTTON));

		} catch (NoSuchElementException e) {
			throw new FillOutTheSignInFormException(FillOutTheSignInFormException.NO_SUCH_ELEMENT_EXCEPTION, e);
		}
	}

	public static FillOutTheSignInForm with(String emailAddress, String password) {
		return Tasks.instrumented(FillOutTheSignInForm.class, emailAddress, password);
	}
}
