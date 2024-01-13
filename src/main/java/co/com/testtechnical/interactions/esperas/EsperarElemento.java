package co.com.testtechnical.interactions.esperas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class EsperarElemento implements Interaction {

  private Target elemento;
  private String tipo;
  private String stringClickable = "clickable";

  public EsperarElemento(Target elemento, String tipo) {
    this.elemento = elemento;
    this.tipo = tipo;
  }

  public static EsperarElemento esClickable(Target elemento) {
    return instrumented(EsperarElemento.class, elemento, "clickable");
  }

  public static EsperarElemento esVisible(Target elemento) {
    return instrumented(EsperarElemento.class, elemento, "visible");
  }

  @Step("Esperar elemento #elemento es #tipo")
  @Override
  public <T extends Actor> void performAs(T actor) {
    if (tipo.equals(stringClickable)) {
      actor.attemptsTo(WaitUntil.the(elemento, isClickable()).forNoMoreThan(30).seconds());
    } else {
      actor.attemptsTo(WaitUntil.the(elemento, isCurrentlyVisible()).forNoMoreThan(30).seconds());
    }
  }
}
