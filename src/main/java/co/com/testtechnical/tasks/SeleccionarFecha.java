package co.com.testtechnical.tasks;

import co.com.testtechnical.tasks.formulario.CicloDosMultiplos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.LBL_CALENDARIO;
import static co.com.testtechnical.userinterfaces.PaginaInicio.BTN_ENVIAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFecha implements Task {

    public String cantidadDeDias;

    public SeleccionarFecha(String cantidadDeDias) {
        this.cantidadDeDias = cantidadDeDias;
    }

    public static SeleccionarFecha enEvalart(String cantidadDeDias) {
        return instrumented(SeleccionarFecha.class, cantidadDeDias);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(LBL_CALENDARIO),
                Hit.the(Keys.ARROW_LEFT).into(LBL_CALENDARIO),
                Hit.the(Keys.ARROW_LEFT).into(LBL_CALENDARIO));

        switch (cantidadDeDias) {
            case "22":
                cantidadDe_322(actor);
                break;
            case "78":
                cantidadDe_78(actor);
                break;
            case "95":
                cantidadDe_95_atras(actor);
                break;
            case "47":
                cantidadDe_47(actor);
                break;
            case "97":
                cantidadDe_97(actor);
                break;
        }
        actor.attemptsTo(Click.on(BTN_ENVIAR));
    }


    private void cantidadDe_322(Actor actor) {
        actor.attemptsTo(
        Enter.theValue("10").into(LBL_CALENDARIO),
        Enter.theValue("11").into(LBL_CALENDARIO),
        Enter.theValue("2022").into(LBL_CALENDARIO));
    }
    private void cantidadDe_78(Actor actor) {
        actor.attemptsTo(
        Enter.theValue("05").into(LBL_CALENDARIO),
        Enter.theValue("01").into(LBL_CALENDARIO),
        Enter.theValue("2023").into(LBL_CALENDARIO));
    }

    private void cantidadDe_95_atras(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("16").into(LBL_CALENDARIO),
                Enter.theValue("07").into(LBL_CALENDARIO),
                Enter.theValue("2022").into(LBL_CALENDARIO));
    }

    private void cantidadDe_47(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("05").into(LBL_CALENDARIO),
                Enter.theValue("12").into(LBL_CALENDARIO),
                Enter.theValue("2022").into(LBL_CALENDARIO));
    }

    private void cantidadDe_97(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("24").into(LBL_CALENDARIO),
                Enter.theValue("01").into(LBL_CALENDARIO),
                Enter.theValue("2023").into(LBL_CALENDARIO));
    }

}