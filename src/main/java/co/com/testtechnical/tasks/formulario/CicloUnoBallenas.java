package co.com.testtechnical.tasks.formulario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.TXT_NUMERO_BALLENAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CicloUnoBallenas implements Task {

    public String resultadoBalenas;



    public CicloUnoBallenas(String resultadoBalenas) {
        this.resultadoBalenas = resultadoBalenas;
    }

    public static CicloUnoBallenas enEvalart(String resultadoBalenas) {
        return instrumented(CicloUnoBallenas.class, resultadoBalenas);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
            Click.on(TXT_NUMERO_BALLENAS),
            Enter.theValue(resultadoBalenas).into(TXT_NUMERO_BALLENAS));
    }
}

