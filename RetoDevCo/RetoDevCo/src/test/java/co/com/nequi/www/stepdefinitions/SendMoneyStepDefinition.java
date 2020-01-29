package co.com.nequi.www.stepdefinitions;

import co.com.nequi.www.questions.TheMessage;
import co.com.nequi.www.tasks.LogInToNequi;
import co.com.nequi.www.tasks.SendMoney;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.nequi.www.models.Data.*;
import static co.com.nequi.www.userinterfaces.SendMoneyPage.ERROR_MESSAGE;
import static co.com.nequi.www.utils.TakeCredentialsFromUser.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SendMoneyStepDefinition {

	
	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
		takeCredentialsFromUser();
	}

	@Given("^(.*) is logged into the nequi app with his credentials$")
	public void bryanIsLoggedIntoTheNequiAppWithHisCredentials(String actor) {

		System.out.println(userInformation());
		System.out.println(passwordInformation());
		theActorCalled(actor).wasAbleTo(LogInToNequi.withTheCredentials(userInformation(),passwordInformation()));
	}

	@When("^he sends money to his own nequi account$")
	public void heSendsMoneyToHisOwnNequiAccount()  {
		theActorInTheSpotlight().attemptsTo(SendMoney.whitTheData(userInformation(),AMOUNT_MONEY.getData(), TRANSACTION_MESSAGE.getData()));
	}

	@Then("^he should see a shipping error message not allowed$")
	public void heShouldSeeAShippingErrorMessageNotAllowed() {
		theActorInTheSpotlight().should(seeThat(TheMessage.of(ERROR_MESSAGE),equalTo(TRANSACTION_MESSAGE_ERROR.getData())));
	}
	

	

}
