package co.com.nequi.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NequiHomePage {

    public static final Target CELL_PHONE_NUMBER_FIELD= Target.the("cell phone number field")
            .located(By.xpath("//*[@class='android.widget.EditText']"));

    public static final Target ENTER_BUTTON = Target.the("forward button")
            .located(By.xpath("//*[@text='Entra']"));

    public static Target numericKeyboard(String numero){
        return Target.the("numeric keyboard")
                .located(By.xpath("//*[@text='"+numero+"']"));
    }

}
