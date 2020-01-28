package com.automationpractice.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyStoreDressesPage {

    public static final Target DRESSES_PRICES = Target.the("prices of all dresses")
            .located(By.xpath("//div[@class='right-block']//span[@class='price product-price']"));

    public  static Target dress(String price) {
        return Target.the("most expensive dress")
                .located(By.xpath("//div[@class='right-block']//span[@class='price product-price'][contains(text(),'"+price+"')]"));
    }

    public static final Target PROCEED_TO_CHECKOUT_BUTTON = Target.the("proceed to checkout button")
            .located(By.xpath("//span[contains(text(),'Proceed to checkout')]"));

    public static final Target PROCEED_CHECKOUT_SUMAMARY_BUTTON = Target.the("proceed to checkout button")
            .located(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));

    public static final Target PROCEED_CHECKOUT_ADDRESS_BUTTON = Target.the("proceed to checkout button")
            .located(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]"));

    public static final Target PROCEED_CHECKOUT_SHIPPING_BUTTON = Target.the("proceed to checkout button")
            .located(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"));

    public static final Target ACCEPT_TERMS_AND_CONDITIONS = Target.the("accept terms and conditions check")
            .located(By.xpath("//input[@id='cgv']"));

    public static final Target PAY_BY_BANK_WIRE_OPTION = Target.the("bank payment method")
            .located(By.xpath("//a[@class='bankwire']"));

    public static final Target CONFIRM_MY_ORDER_BUTTON = Target.the("i confirm my order button")
            .located(By.xpath("//span[contains(text(),'I confirm my order')]"));

    public static final Target INVOICE = Target.the("evidence purchase invoice")
            .located(By.xpath("//div[@class='box']"));












}
