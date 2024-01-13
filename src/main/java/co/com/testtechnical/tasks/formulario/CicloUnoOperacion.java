package co.com.testtechnical.tasks.formulario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.*;
import static co.com.testtechnical.userinterfaces.PaginaInicio.BTN_ENVIAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CicloUnoOperacion implements Task {

    public String resultadoSuma;

    public CicloUnoOperacion(String resultadoSuma) {
        this.resultadoSuma = resultadoSuma;
    }

    public static CicloUnoOperacion enEvalart(String resultadoSuma) {
        return instrumented(CicloUnoOperacion.class, resultadoSuma);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (resultadoSuma) {
            case "431015":
                sumatoriaDe_431015(actor);
                break;
                case "-2695":
                sumatoriaDe_2695(actor);
                break;
            case "-1221":
                sumatoriaDe_1221(actor);
                break;
            case "33652":
                sumatoriaDe_33652(actor);
                break;
        }

//        if (!Visibility.of(RADIO_BUTTON_RESULTADO_ARITMETICO.of(resultadoSuma)).viewedBy(actor).resolveAll().isEmpty()) {
//            actor.attemptsTo(Click.on(RADIO_BUTTON_RESULTADO_ARITMETICO.of(resultadoSuma)));
//        }else {
//            actor.attemptsTo(
//                    Click.on(SELECCIONAR_NUMERO),
//                    Click.on(SELECCIONAR_NUMERO_EN_LISTA.of(resultadoSuma))
//            );
//        }


    }

    private void sumatoriaDe_431015(Actor actor) {
        actor.attemptsTo(Click.on(RADIO_BUTTON_RESULTADO_ARITMETICO.of(resultadoSuma)),
                Click.on(BTN_ENVIAR));
    }

    private void sumatoriaDe_2695(Actor actor) {
        actor.attemptsTo(
                Click.on(SELECCIONAR_NUMERO),
                Click.on(SELECCIONAR_NUMERO_EN_LISTA.of(resultadoSuma)),
                Click.on(BTN_ENVIAR));
    }

    private void sumatoriaDe_1221(Actor actor) {
        actor.attemptsTo(
                Click.on(SELECCIONAR_NUMERO),
                Click.on(SELECCIONAR_NUMERO_EN_LISTA.of(resultadoSuma)));

    }

    private void sumatoriaDe_33652(Actor actor) {
        actor.attemptsTo(
                Click.on(SELECCIONAR_NUMERO),
                Click.on(SELECCIONAR_NUMERO_EN_LISTA.of(resultadoSuma)),
                Click.on(BTN_ENVIAR));
    }




}

