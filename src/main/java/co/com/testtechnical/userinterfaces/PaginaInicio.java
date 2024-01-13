package co.com.testtechnical.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {


    public static final Target TXT_USUARIO =
            Target.the("Input Usuario").located(By.xpath("//*[@name='username']"));
    public static final Target TXT_PASSWORD =
            Target.the("Input password").located(By.xpath("//*[@name='password']"));
    public static final Target BTN_ENVIAR =
            Target.the("btn enviar").located(By.xpath("(//*[contains(.,'Enviar')])[6]"));



}