package co.com.testtechnical.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeCiclos {

//CICLO_UNO
    public static final Target TXT_GENERAL_SELECT_INPUT =
//            Target.the("Input General Select Ciclo").located(By.xpath("//*[@name='select']"));
            Target.the("Input General Select Ciclo").located(By.xpath("//*[@name='select']//*[contains(text(),'Respuesta')]"));

  public static final Target RADIO_BUTTON_CICLO_UNO =
      Target.the("Btn radio button Ciclo uno").locatedBy("(//*[@class='grid grid-cols-4 gap-4 mt-4'])[1]//*[@value='909132']");
  public static final Target CHECK_BOX_CICLO_UNO_108 =
          Target.the("Btn radio button Ciclo uno 108").locatedBy(" (//*[@class='grid grid-cols-4 gap-4 mt-4'])[2]//*[@value='108']");
  public static final Target CHECK_BOX_CICLO_UNO_198 =
          Target.the("Btn radio button Ciclo uno 198").locatedBy(" (//*[@class='grid grid-cols-4 gap-4 mt-4'])[2]//*[@value='198']");
  public static final Target CHECK_BOX_CICLO_UNO_144 =
          Target.the("Btn radio button Ciclo uno 144").locatedBy("(//*[@class='grid grid-cols-4 gap-4 mt-4'])[2]//*[@value='144']");
  public static final Target CHECK_BOX_CICLO_UNO_150 =
          Target.the("Btn radio button Ciclo uno 150").locatedBy("(//*[@class='grid grid-cols-4 gap-4 mt-4'])[2]//*[@value='150']");
  public static final Target CHECK_BOX_CICLO_UNO_NRO_OBJETOS =
          Target.the("Btn radio button Ciclo uno Numero de objetos").locatedBy("//*[@placeholder=' Numero  ']");
 public static final Target CHECK_BOX_CICLO_OK =
          Target.the("Btn radio button Ciclo uno Validacion de ciclo OK").locatedBy("(//*[contains(.,'Se encuentra en el ciclo')])[6]");






  public static final Target TXT_NUMERO_BALLENAS =Target.the("Btn Sumatoria").locatedBy("//*[contains(text(),'{0}')]");
  public static final Target RADIO_BUTTON_RESULTADO_ARITMETICO =Target.the("Btn Sumatoria").locatedBy("//*[contains(text(),'{0}')]");

    public static final Target MSG_EXITOSO =
      Target.the("Btn Sumatoria").locatedBy("//*[contains(text(),'{0}')]");

  public static final Target MSG_DE_INICIO_SESION =
      Target.the("Btn Sumatoria").located(By.xpath("//*[contains(text(),'Se encuentra en el ciclo')]"));
    public static final Target SELECCIONAR_NUMERO =
            Target.the("Seleccionar Btn Sumatoria").locatedBy("//*[@name='select']");
  public static final Target SELECCIONAR_NUMERO_EN_LISTA =
          Target.the("Seleccionar Btn Sumatoria").locatedBy("//*[contains(@value,'{0}')]");

  public static final Target CAMPO_TEXTO_LETRA_K =
          Target.the("Seleccionar Btn Sumatoria").locatedBy("//*[@name='text']");
  public static final Target LBL_CALENDARIO =
          Target.the("Btn calendario").locatedBy("//*[@name='date']");

    public static final Target CHECKBOX_MULTIPLOS =
            Target.the(" primer Numero multiplo de 6").locatedBy("//*[contains(@value,'{0}')]");
    public static final Target PRIMER_MULTIPLOS_DE_SEIS =
            Target.the(" primer Numero multiplo de 6").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/label[2]"));
    public static final Target SEGUNDO_MULTIPLOS_DE_SEIS =
            Target.the("segudno Numero multiplo de 6").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/label[4]"));
    public static final Target TERCERO_MULTIPLOS_DE_SEIS =
            Target.the("tecero Numero multiplo de 6").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/label[9]"));
    public static final Target CUARTO_MULTIPLOS_DE_SEIS =
            Target.the("cuarto Numero multiplo de 6").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/label[14]"));
  public static final Target QUINTO_MULTIPLOS_DE_SEIS =
          Target.the("Quinto Numero multiplo de 6").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/label[15]"));

  public static final Target PRIMER_MULTIPLOS_DE_OCHO =
          Target.the(" primer Numero multiplo de 8").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[15]"));
  public static final Target SEGUNDO_MULTIPLOS_DE_OCHO =
          Target.the("segudno Numero multiplo de 8").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[16]"));
}
