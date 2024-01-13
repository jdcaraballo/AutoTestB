package co.com.testtechnical.tasks.formulario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.CAMPO_TEXTO_LETRA_K;
import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.LBL_CALENDARIO;
import static co.com.testtechnical.userinterfaces.PaginaInicio.BTN_ENVIAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;


//public class CicloTresRepeat {
//
//  public static void main(String[] args) {
//    int veces = 321;
//    String letra = "K";
//    for (int i = 0; i <= veces; i++) {
//      System.out.print(letra);
//      //
//    }
//  }
//}

public class CicloTresRepeat implements Task {


  public String letra;
  public int veces;

  public CicloTresRepeat(String letra, int veces) {
    this.letra = letra;
    this.veces = veces;
  }

  public static CicloTresRepeat enEvalart(String letra, int veces) {
    return instrumented(CicloTresRepeat.class, letra, veces);
  }


//  @Override
//  public <T extends Actor> void performAs(T actor) {
//    int cantidad = veces;
//    for (int i = 1; i <= veces; i++) {
//                    System.out.print(letra);
//      actor.attemptsTo(
//              Enter.keyValues(letra).into(CAMPO_TEXTO_LETRA_K));
//    }
//    actor.attemptsTo(Click.on(BTN_ENVIAR));
//  }
//}

//  @Override
//  public <T extends Actor> void performAs(T actor) {
//      actor.attemptsTo(
//              Enter.keyValues("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK").into(CAMPO_TEXTO_LETRA_K),
//              Click.on(BTN_ENVIAR));
//    }
//
//
//}
@Override
public <T extends Actor> void performAs(T actor) {
  switch (letra) {
    case "K":
      cantidadDe_322(actor);
      break;
    case "b":
      cantidadDe_282(actor);
      break;
  }
}

  private void cantidadDe_322(Actor actor) {
      actor.attemptsTo(
              Enter.keyValues("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK").into(CAMPO_TEXTO_LETRA_K)
//              Click.on(BTN_ENVIAR)
      );
    }

  private void cantidadDe_282(Actor actor) {
      actor.attemptsTo(
              Enter.keyValues("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb").into(CAMPO_TEXTO_LETRA_K)
//              Click.on(BTN_ENVIAR)
      );
    }
  }
//}

