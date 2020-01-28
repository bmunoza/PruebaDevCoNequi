package com.automationpractice.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static com.automationpractice.www.models.Data.MESSAGE_SEND;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class TheMessage implements Question<String> {

    private Target target;

    public TheMessage(Target target){
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
        WaitUntil.the(target,containsText(MESSAGE_SEND.getString())));
        return Text.of(target).viewedBy(actor).asString();
    }

    public static TheMessage of(Target target){
        return new TheMessage(target);
    }
}
