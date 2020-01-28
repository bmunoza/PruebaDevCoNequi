package com.automationpractice.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class MyStoreHomePage extends PageObject {

    public static final Target SIGN_IN_HOME_BUTTON = Target.the("sign in button in my store home page")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]"));

    public final static Target DRESSES_OPTION = Target.the("Dresses option")
            .located(By.xpath("//body[@id='my-account']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]"));
}
