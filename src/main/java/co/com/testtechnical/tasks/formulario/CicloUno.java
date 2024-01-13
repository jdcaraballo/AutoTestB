package co.com.testtechnical.tasks.formulario;


import co.com.testtechnical.interactions.esperas.Esperar;
import co.com.testtechnical.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.*;
import static co.com.testtechnical.userinterfaces.PaginaInicio.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CicloUno implements Task {

  private String campoTexto;
  private String nroObjetos;

  public CicloUno(String campoTexto, String nroObjetos) {
    this.campoTexto = campoTexto;
    this.nroObjetos = nroObjetos;
  }

  public static CicloUno cicloUno(String campoTexto, String nroObjetos) {
    return instrumented(CicloUno.class, campoTexto, nroObjetos);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Esperar.unTiempo(5),
        EsperarElemento.esClickable(TXT_GENERAL_SELECT_INPUT),
//        Click.on(TXT_GENERAL_SELECT_INPUT),
//        Enter.theValue(campoTexto).into(TXT_GENERAL_SELECT_INPUT),
        SelectFromOptions.byVisibleText(campoTexto).from(TXT_GENERAL_SELECT_INPUT),
        Click.on(RADIO_BUTTON_CICLO_UNO),
        Click.on(CHECK_BOX_CICLO_UNO_108),
        Click.on(CHECK_BOX_CICLO_UNO_198),
        Click.on(CHECK_BOX_CICLO_UNO_144),
        Click.on(CHECK_BOX_CICLO_UNO_150),
        Click.on(CHECK_BOX_CICLO_UNO_150),
        Enter.theValue(nroObjetos).into(CHECK_BOX_CICLO_UNO_NRO_OBJETOS),
        Click.on(BTN_ENVIAR));

  }
}
