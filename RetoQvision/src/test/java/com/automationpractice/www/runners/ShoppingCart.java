package com.automationpractice.www.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/shopping_cart.feature"},
        glue="com.automationpractice.www.stepdefinitions",
        snippets= SnippetType.CAMELCASE)
public class ShoppingCart {
}
