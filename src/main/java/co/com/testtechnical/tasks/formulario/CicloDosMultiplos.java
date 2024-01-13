package co.com.testtechnical.tasks.formulario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.*;
import static co.com.testtechnical.userinterfaces.PaginaInicio.BTN_ENVIAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CicloDosMultiplos implements Task {

    public String multiploBase;

    public CicloDosMultiplos(String multiploBase) {
        this.multiploBase = multiploBase;
    }

    public static CicloDosMultiplos enEvalart(String multiploBase) {
        return instrumented(CicloDosMultiplos.class, multiploBase);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    switch (multiploBase) {
      case "6":
        multiploBase_6(actor);
        break;
      case "8":
        multiploBase_8(actor);
        break;
    }
    }

    private void multiploBase_6(Actor actor) {
        String multiplo_de_6_1 = Text.of(PRIMER_MULTIPLOS_DE_SEIS).viewedBy(actor).asString().trim();
        String multiplo_de_6_2 = Text.of(SEGUNDO_MULTIPLOS_DE_SEIS).viewedBy(actor).asString().trim();
        String multiplo_de_6_3 = Text.of(TERCERO_MULTIPLOS_DE_SEIS).viewedBy(actor).asString().trim();
        String multiplo_de_6_4 = Text.of(CUARTO_MULTIPLOS_DE_SEIS).viewedBy(actor).asString().trim();
        String multiplo_de_6_5 = Text.of(QUINTO_MULTIPLOS_DE_SEIS).viewedBy(actor).asString().trim();

        actor.attemptsTo(
                Click.on(CHECKBOX_MULTIPLOS.of(multiplo_de_6_1)),
                Click.on(CHECKBOX_MULTIPLOS.of(multiplo_de_6_2)),
                Click.on(CHECKBOX_MULTIPLOS.of(multiplo_de_6_3)),
                Click.on(CHECKBOX_MULTIPLOS.of(multiplo_de_6_4)),
                Click.on(CHECKBOX_MULTIPLOS.of(multiplo_de_6_5)));
    }

    private void multiploBase_8(Actor actor) {
        String multiplo_de_8_1 = Text.of(PRIMER_MULTIPLOS_DE_OCHO).viewedBy(actor).asString().trim();
        String multiplo_de_8_2 = Text.of(SEGUNDO_MULTIPLOS_DE_OCHO).viewedBy(actor).asString().trim();

        actor.attemptsTo(
                Click.on(CHECKBOX_MULTIPLOS.of(multiplo_de_8_1)),
                Click.on(CHECKBOX_MULTIPLOS.of(multiplo_de_8_2)));

        actor.attemptsTo(Click.on(BTN_ENVIAR));
    }
}

