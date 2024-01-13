package co.com.testtechnical.interactions.esperas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Clickable implements Interaction {

  Target elemento;

  public Clickable(Target elemento) {
    this.elemento = elemento;
  }

  @Step("Espera #elemento clickable")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(elemento, isClickable()).forNoMoreThan(20).seconds());
  }
}
