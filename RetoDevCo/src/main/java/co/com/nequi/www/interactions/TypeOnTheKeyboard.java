package co.com.nequi.www.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.nequi.www.userinterfaces.NequiHomePage.numericKeyboard;

public class TypeOnTheKeyboard implements Interaction {

    private String number;

    public TypeOnTheKeyboard(String number) {
        this.number = number;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        for(int i=0;i<number.length();i++){
            actor.attemptsTo(Click.on(numericKeyboard(String.valueOf(number.charAt(i)))));
        }
    }

    public static TypeOnTheKeyboard withTheData(String number) {
        return Tasks.instrumented(TypeOnTheKeyboard.class, number);
    }
}
