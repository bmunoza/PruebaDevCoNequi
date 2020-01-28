package co.com.nequi.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailHomePage {


	public static final Target ENVIA_PLATA_BUTTON = Target.the("button ir a gmail")
			.located(By.xpath("//*[@class='android.view.View' and ./*[@text='Envía plata']]"));


	public static final Target PESOS_BUTTON = Target.the("button ir a gmail")
			.located(By.xpath("//*[@text='#']"));



	public static final Target EMAIL = Target.the("button ir a gmail")
			.located(By.xpath("//*[@text and @class='android.view.View' and ./parent::*[./parent::*[@class='android.widget.ListView']]]"));

	public static final Target CELULAR_FIELD = Target.the("button ir a gmail")
			.located(By.xpath("(((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]/*[@class='android.view.View'])[6]/*[@class='android.view.View'])[1]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[1]/*/*[@class='android.widget.EditText'])[1]"));

	public static final Target CANTIDAD_FIELD = Target.the("button ir a gmail")
			.located(By.xpath("(((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]/*[@class='android.view.View'])[6]/*[@class='android.view.View'])[1]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[1]/*/*[@class='android.widget.EditText'])[2]"));

	public static final Target MENSAJE_FIELD = Target.the("button ir a gmail")
			.located(By.xpath("(((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]/*[@class='android.view.View'])[6]/*[@class='android.view.View'])[1]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[1]/*/*[@class='android.widget.EditText'])[3]"));

	public static final Target NEXT_BUTTON = Target.the("button ir a gmail")
			.located(By.xpath("//*[@text='Continúa']"));

	public static final Target CONFIRM_BUTTON = Target.the("button ir a gmail")
			.located(By.xpath("//*[@text='Confirma']"));

	public static final Target ERROR_MESSAGE = Target.the("button ir a gmail")
			.located(By.xpath("//*[@text='Los envíos de tu cuenta Nequi a tí mismo no están permitidos.\n\nMejor intenta enviarle plata a un amigo.']"));




}
