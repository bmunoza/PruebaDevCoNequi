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
}
