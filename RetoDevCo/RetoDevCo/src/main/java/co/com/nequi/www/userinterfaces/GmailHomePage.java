package co.com.accenture.automation.retogmailandroid.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GmailHomePage {

	public static final Target ENTENDIDO_BUTTON = Target.the("button entendido")
			.located(By.xpath("//android.widget.Button[@content-desc=\"porcentaje\"]"));
	public static final Target IR_A_GMAIL_BUTTON = Target.the("button ir a gmail")
			.located(By.id("com.google.android.gm:id/action_done"));

	public static final Target SIGUIENTE_BUTTON = Target.the("button ir a gmail")
			.located(By.id("com.google.android.gm:id/gm_dismiss_button"));

	public static final Target ACEPTAR_BUTTON = Target.the("button ir a gmail")
			.located(By.id("com.google.android.gm:id/gm_dismiss_button"));

	public static final Target EMAIL = Target.the("button ir a gmail").located(By.id("com.google.android.gm:id/owner"));

	public static final Target REDACTAR_BUTTON = Target.the("button ir a gmail").located(By.id("compose_button"));

	public static final Target TEXT_ENVIANDO = Target.the("button ir a gmail").locatedBy("//*[@id='description_text']");

}
