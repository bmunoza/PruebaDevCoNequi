package co.com.nequi.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/send_money.feature",
        glue="co.com.nequi.www.stepdefinitions",
        snippets=SnippetType.CAMELCASE,
		dryRun = false)

public class SendMoney {

}
