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

    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .located(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//a[@class='button ajax_add_to_cart_button btn btn-default']"));


}
