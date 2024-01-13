package co.com.prueba_sophos.tasks.autenticacion;


import co.com.prueba_sophos.interactions.comunes.AbrirNavegador;
import co.com.prueba_sophos.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.prueba_sophos.userInterfaces.paginaDeCiclos.PaginaDeCiclos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

  private String usuario;
  private String clave;

  public IniciarSesion(String usuario, String clave) {
    this.usuario = usuario;
    this.clave = clave;
  }

  public static IniciarSesion enEvalart(String usuario, String clave) {
    return instrumented(IniciarSesion.class, usuario, clave);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        AbrirNavegador.enEvalart(),
        EsperarElemento.esClickable(TXT_USUARIO),
        Enter.theValue(usuario).into(TXT_USUARIO),
        Enter.theValue(clave).into(TXT_PASSWORD),
        Click.on(BTN_ENVIAR));

  }
}
