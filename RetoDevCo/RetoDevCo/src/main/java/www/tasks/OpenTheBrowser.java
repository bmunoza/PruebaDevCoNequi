package com.automationpractice.www.tasks;


import com.automationpractice.www.exceptions.OpenTheBrowserException;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.UnsupportedDriverException;

import static com.automationpractice.www.exceptions.OpenTheBrowserException.DRIVER_FAILED_MESSAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    private PageObject page;

    public OpenTheBrowser(PageObject page){
        this.page = page;
    }


    @Override
    @Step("{0} opens the browser on My Store home page")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Open.browserOn(page));
        }catch (UnsupportedDriverException e){
            throw new OpenTheBrowserException(DRIVER_FAILED_MESSAGE,e);
        }
    }

    public static OpenTheBrowser on( PageObject page){
        return instrumented(OpenTheBrowser.class,page);
    }
}
