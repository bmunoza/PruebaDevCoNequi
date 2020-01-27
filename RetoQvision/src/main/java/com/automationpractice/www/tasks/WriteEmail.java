package com.automationpractice.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.nio.file.Path;
import java.nio.file.Paths;

import static com.automationpractice.www.userinterfaces.GmailHomePage.*;

public class WriteEmail implements Task {

    private String destinationEmail;

    public WriteEmail(String destinationEmail){
        this.destinationEmail = destinationEmail;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Path testFIlePath = Paths.get("FOTO.png").toAbsolutePath();
        actor.attemptsTo(Click.on(REDACTAR_BUTTON),
                Enter.theValue(destinationEmail).into(TO_INPUT),
                Enter.theValue("Comprobante").into(ASUNTO_IMPUT),
                Upload.theFile(testFIlePath).to(INPUT_FILE),
                Click.on(SEND_BUTTON));

    }

    public static WriteEmail to(String destinationEmail) {
        return Tasks.instrumented(WriteEmail.class, destinationEmail);
    }


}
