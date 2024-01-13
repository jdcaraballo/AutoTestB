package co.com.testtechnical.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Interaction {

  public static AbrirNavegador enEvalart() {
    return instrumented(AbrirNavegador.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url("https://tasks.evalartapp.com/automatization/"));
  }
}
