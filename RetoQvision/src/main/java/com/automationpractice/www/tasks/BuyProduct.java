package com.automationpractice.www.tasks;

import com.automationpractice.www.interactions.ChooseMoreExpensive;
import com.automationpractice.www.utils.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;

import static com.automationpractice.www.models.Data.FILE_NAME;
import static com.automationpractice.www.userinterfaces.MyStoreDressesPage.*;
import static com.automationpractice.www.userinterfaces.MyStoreHomePage.DRESSES_OPTION;

public class BuyProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Hover.over(DRESSES_OPTION),
                Click.on(DRESSES_OPTION),
                ChooseMoreExpensive.fromTheList(),
                Click.on(PROCEED_TO_CHECKOUT_BUTTON),
                Click.on(PROCEED_CHECKOUT_SUMAMARY_BUTTON),
                Click.on(PROCEED_CHECKOUT_ADDRESS_BUTTON),
                Click.on(ACCEPT_TERMS_AND_CONDITIONS),
                Click.on(PROCEED_CHECKOUT_SHIPPING_BUTTON),
                Click.on(PAY_BY_BANK_WIRE_OPTION),
                Click.on(CONFIRM_MY_ORDER_BUTTON),
                Hover.over(INVOICE)
        );

        TakeScreenshot.withTheName(FILE_NAME.getString());

    }

    public static BuyProduct inTheWebsite() {
        return Tasks.instrumented(BuyProduct.class);
    }
}
