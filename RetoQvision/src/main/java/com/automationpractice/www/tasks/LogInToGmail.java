package com.automationpractice.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.automationpractice.www.userinterfaces.GmailHomePage.*;

public class LogInToGmail implements Task {


    private String user;
    private String password;

    public LogInToGmail(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Enter.theValue(user).into(USER_INPUT).thenHit(Keys.ENTER),
                    Enter.theValue(password).into(PASSWORD_INPUT).thenHit(Keys.ENTER)
            );
    }

    public static LogInToGmail withTheCredentials(String user, String password) {
        return Tasks.instrumented(LogInToGmail.class, user, password);
    }
}
