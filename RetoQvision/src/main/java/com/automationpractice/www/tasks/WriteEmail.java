package com.automationpractice.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.thucydides.core.annotations.Step;

import java.nio.file.Path;
import java.nio.file.Paths;

import static com.automationpractice.www.models.Data.AFFAIR_EMAIL;
import static com.automationpractice.www.models.Data.FILE_NAME;
import static com.automationpractice.www.userinterfaces.GmailHomePage.*;

public class WriteEmail implements Task {

    private String destinationEmail;

    public WriteEmail(String destinationEmail){
        this.destinationEmail = destinationEmail;
    }

    @Override
    @Step("{0} write a email for clara´s dad")
    public <T extends Actor> void performAs(T actor) {
        Path testFIlePath = Paths.get(FILE_NAME.getString()).toAbsolutePath();

        actor.attemptsTo(Click.on(REDACTAR_BUTTON),
                Enter.theValue(destinationEmail).into(TO_INPUT),
                Enter.theValue(AFFAIR_EMAIL.getString()).into(ASUNTO_IMPUT),
                Upload.theFile(testFIlePath).to(INPUT_FILE),
                Click.on(SEND_BUTTON));
    }

    public static WriteEmail to(String destinationEmail) {
        return Tasks.instrumented(WriteEmail.class, destinationEmail);
    }


}
