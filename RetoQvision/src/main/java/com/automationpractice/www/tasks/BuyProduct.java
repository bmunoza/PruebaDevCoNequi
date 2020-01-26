package com.automationpractice.www.tasks;

import com.automationpractice.www.interactions.ExtractMaximumPrice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;

import static com.automationpractice.www.userinterfaces.MyStoreDressesPage.ADD_TO_CART_BUTTON;
import static com.automationpractice.www.userinterfaces.MyStoreHomePage.DRESSES_OPTION;

public class BuyProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Hover.over(DRESSES_OPTION),
                Click.on(DRESSES_OPTION),
                ExtractMaximumPrice.with()
               // Hover.over(ADD_TO_CART_BUTTON),
               // Click.on(ADD_TO_CART_BUTTON)

        );
       // ADD_TO_CART_BUTTON.resolveFor(actor).waitUntilVisible().waitUntilClickable().click();

    }

    public static BuyProduct with() {
        return Tasks.instrumented(BuyProduct.class);
    }
}
