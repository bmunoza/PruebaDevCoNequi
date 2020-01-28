package com.automationpractice.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
public class GmailHomePage extends PageObject {


    public static final Target USER_INPUT = Target.the("user input gmal")
            .locatedBy("//input[@name='identifier']");

    public static final Target PASSWORD_INPUT = Target.the("password input gmail")
            .locatedBy("//input[@name='password']");

    public static final Target INPUT_FILE = Target.the("destination button gmail")
            .locatedBy("//input[@name='Filedata']");

    public static final Target REDACTAR_BUTTON = Target.the("redactar button gmail ")
            .locatedBy("//div[@class='T-I J-J5-Ji T-I-KE L3']");

    public static final Target ASUNTO_IMPUT = Target.the("asuntoinput body gmail")
            .located(By.name("subjectbox"));

    public static final Target TO_INPUT = Target.the("To input gmail")
            .located(By.name("to"));

    public static final Target SEND_BUTTON= Target.the("Send input gmail")
            .locatedBy("//div[@class='dC']");

    public static final Target MESSAGE_SUCCESSFUL= Target.the("message successful gmail")
            .locatedBy("//span[@class='bAq']");




}
