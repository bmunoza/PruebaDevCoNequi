package co.com.nequi.www.tasks;

import co.com.nequi.www.interactions.TypeOnTheKeyboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.nequi.www.userinterfaces.NequiHomePage.CELL_PHONE_NUMBER_FIELD;
import static co.com.nequi.www.userinterfaces.NequiHomePage.ENTER_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LogInToNequi implements Task {


    private String user;
    private String password;

    public LogInToNequi(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    @Step("{0} sing in nequi app with credentials")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(CELL_PHONE_NUMBER_FIELD,isVisible()),
                Enter.theValue(user).into(CELL_PHONE_NUMBER_FIELD),
                Click.on(ENTER_BUTTON),
                TypeOnTheKeyboard.withTheData(password));
    }

    public static LogInToNequi withTheCredentials(String user, String password) {
        return Tasks.instrumented(LogInToNequi.class, user, password);
    }
}
