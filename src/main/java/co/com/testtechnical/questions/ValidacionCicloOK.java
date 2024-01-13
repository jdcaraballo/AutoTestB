package co.com.testtechnical.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.CHECK_BOX_CICLO_OK;
import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.MSG_EXITOSO;

public class ValidacionCicloOK implements Question<Boolean> {

  public static ValidacionCicloOK esVisible() {
    return new ValidacionCicloOK();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
//    return !CHECK_BOX_CICLO_OK.resolveAllFor(actor).isEmpty();

    return (CHECK_BOX_CICLO_OK.waitingForNoMoreThan(Duration.ofSeconds(3)).resolveFor(actor).isVisible());
  }
}


