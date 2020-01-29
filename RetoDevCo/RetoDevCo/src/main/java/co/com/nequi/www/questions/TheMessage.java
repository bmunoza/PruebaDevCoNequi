package co.com.nequi.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class TheMessage implements Question<String> {

    private Target target;

    public TheMessage(Target target){
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static TheMessage of(Target target){
        return new TheMessage(target);
    }
}
