package co.com.testtechnical.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.MSG_EXITOSO;

public class VerificarMensaje implements Question<Boolean> {

  private String mensaje;

  public VerificarMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public static VerificarMensaje esVisible(String mensaje) {
    return new VerificarMensaje(mensaje);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return !MSG_EXITOSO.of(mensaje).resolveAllFor(actor).isEmpty();
  }
}
