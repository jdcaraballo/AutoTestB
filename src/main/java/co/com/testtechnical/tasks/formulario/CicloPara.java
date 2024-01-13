package co.com.testtechnical.tasks.formulario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.CAMPO_TEXTO_LETRA_K;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CicloPara implements Task {

  private final Target elemento;
  public String letra;

  public CicloPara(Target input) {
    this.elemento = input;
  }


  public static Performable enEvalart(Target input) {
    return instrumented(CicloPara.class, input);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    int longitud = 322;
    for (int i = 0; i <= longitud; i++) {
      elemento.resolveFor(actor).sendKeys(Keys.BACK_SPACE);
      elemento.resolveFor(actor).sendKeys(letra);

      actor.attemptsTo(
          Click.on(CAMPO_TEXTO_LETRA_K),
              Enter.theValue(letra).into(CAMPO_TEXTO_LETRA_K));
    }
  }
}

