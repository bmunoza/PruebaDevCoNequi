package com.automationpractice.www.stepdefinitions;

import com.automationpractice.www.questions.TheMessage;
import com.automationpractice.www.tasks.*;
import com.automationpractice.www.userinterfaces.GmailHomePage;
import com.automationpractice.www.userinterfaces.MyStoreHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.automationpractice.www.models.Data.MESSAGE_SEND;
import static com.automationpractice.www.userinterfaces.GmailHomePage.MESSAGE_SUCCESSFUL;
import static com.automationpractice.www.utils.TakeCredentialsFromUser.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class ShoppingCartStepDefinition {


    MyStoreHomePage myStoreHomePage;
    GmailHomePage gmailHomePage;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        takeCredentialsFromUser();
    }

    @Given("^that (.*) is on the My Store website$")
    public void thatMeganIsOnTheMyStoreWebsite(String actor) {
        theActorCalled(actor).attemptsTo(OpenTheBrowser.on(myStoreHomePage),
                FillOutTheSignInForm.with( userInformation(), passwordInformation()));
    }

    @When("^she buys a product on the website$")
    public void sheBuysAProductOnTheWebsite() {
        theActorInTheSpotlight().attemptsTo(BuyProduct.inTheWebsite());
    }

    @When("^she sent the receipt to the email (.*)$")
    public void sheSentTheReceiptToTheEmailPruebaGmailCom(String destinationEmail){
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(gmailHomePage),
                LogInToGmail.withTheCredentials( userInformation(), passwordInformation()),
                WriteEmail.to(destinationEmail));
    }

    @Then("^she should see that the email was sent correctly$")
    public void sheShouldSeeThatTheEmailWasSentCorrectly() {
        theActorInTheSpotlight().should(seeThat(TheMessage.of(MESSAGE_SUCCESSFUL),equalTo(MESSAGE_SEND.getString())));
    }

}
