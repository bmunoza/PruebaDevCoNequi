package co.com.nequi.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SendMoneyPage {


	public static final Target SEND_MONEY_BUTTON = Target.the("send money button nequi")
			.located(By.xpath("//*[@text='Envía plata']"));

	public static final Target TRANSACTION_BUTTON = Target.the("Transactions button in Nequi")
			.located(By.xpath("//*[@text='#']"));

	public static final Target DISPONIBLE_MONEY_OPTION = Target.the("available money nequi")
			.located(By.xpath("//*[@text and @class='android.view.View' and ./parent::*[./parent::*[@class='android.widget.ListView']]]"));

	public static final Target CELULAR_FIELD = Target.the("cell phone number field")
			.located(By.xpath("(((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]/*[@class='android.view.View'])[6]/*[@class='android.view.View'])[1]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[1]/*/*[@class='android.widget.EditText'])[1]"));

	public static final Target CANTIDAD_FIELD = Target.the("amount money field")
			.located(By.xpath("(((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]/*[@class='android.view.View'])[6]/*[@class='android.view.View'])[1]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[1]/*/*[@class='android.widget.EditText'])[2]"));

	public static final Target MENSAJE_FIELD = Target.the("transaction message field")
			.located(By.xpath("(((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]/*[@class='android.view.View'])[6]/*[@class='android.view.View'])[1]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[1]/*/*[@class='android.widget.EditText'])[3]"));

	public static final Target NEXT_BUTTON = Target.the("next button")
			.located(By.xpath("//*[@text='Continúa']"));

	public static final Target CONFIRM_BUTTON = Target.the("confirm button")
			.located(By.xpath("//*[@text='Confirma']"));

	public static final Target ERROR_MESSAGE = Target.the("error message when sending money")
			.located(By.xpath("//*[@text='Los envíos de tu cuenta Nequi a tí mismo no están permitidos.\n\nMejor intenta enviarle plata a un amigo.']"));




}
