package co.com.nequi.www.tasks;

import co.com.nequi.www.exceptions.SendMoneyException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.NoSuchElementException;
import static co.com.nequi.www.exceptions.SendMoneyException.NO_SUCH_ELEMENT_EXCEPTION;
import static co.com.nequi.www.userinterfaces.NequiHomePage.CELL_PHONE_NUMBER_FIELD;
import static co.com.nequi.www.userinterfaces.SendMoneyPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SendMoney implements Task {

	private String cellPhoneNumber;
	private String amount;
	private String message;

	public SendMoney(String cellPhoneNumber,String amount, String message) {
		this.cellPhoneNumber = cellPhoneNumber;
		this.amount = amount;
		this.message = message;
	}

	@Override
	@Step("{0} send money from your nequi account")
	public <T extends Actor> void performAs(T actor) {

		try {
			actor.attemptsTo(WaitUntil.the(TRANSACTION_BUTTON,isVisible()),
					Click.on(TRANSACTION_BUTTON),
					WaitUntil.the(SEND_MONEY_BUTTON,isVisible()),
					Click.on(SEND_MONEY_BUTTON),
					Click.on(DISPONIBLE_MONEY_OPTION),
					Enter.theValue(cellPhoneNumber).into(CELULAR_FIELD),
					Enter.theValue(amount).into(CANTIDAD_FIELD),
					Enter.theValue(message).into(MENSAJE_FIELD),
					Click.on(NEXT_BUTTON),
					Click.on(CONFIRM_BUTTON));
		} catch (NoSuchElementException e) {
			throw new SendMoneyException(NO_SUCH_ELEMENT_EXCEPTION,e);
		}
	}

	public static SendMoney whitTheData(String cellPhoneNumber,String amount, String message) {
		return Tasks.instrumented(SendMoney.class, cellPhoneNumber,amount,message);
	}

}
