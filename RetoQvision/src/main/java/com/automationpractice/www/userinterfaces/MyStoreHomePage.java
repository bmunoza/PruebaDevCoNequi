package com.automationpractice.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class MyStoreHomePage extends PageObject {

    public static final Target SIGN_IN_BUTTON = Target.the("sign in button in my store home page")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]"));

    public final static Target PRODUCT_LIST = Target.the("List of product")
            .located(By.xpath("//*[@id=\"homefeatured\"]/li[*]"));

}
