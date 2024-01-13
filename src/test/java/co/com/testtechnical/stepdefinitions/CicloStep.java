package co.com.testtechnical.stepdefinitions;

import co.com.testtechnical.questions.ValidacionCicloOK;
import co.com.testtechnical.questions.VerificarMensaje;
import co.com.testtechnical.tasks.IniciarSesion;
import co.com.testtechnical.tasks.SeleccionarFecha;
import co.com.testtechnical.tasks.formulario.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.testtechnical.userinterfaces.PaginaDeCiclos.CHECK_BOX_CICLO_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class CicloStep {

    @Managed
    WebDriver myDriver;

    @Before
    public void setUp(){

        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("Andres").can(BrowseTheWeb.with(myDriver));
    }

    @Dado("^que Jhonatan inicia sesion en la pagina de Evalart con usuario: (.*) y la clave: (.*)$")
    public void iniciarSesion(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.enEvalart(usuario, clave)
        );
    }

    @Cuando("^el decide llenar la pestania del ciclo UNO con el valor de (.*) y (.*)$")
    public void llenaPestaniaCicloUno(String campoTexto, String nroObjetos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CicloUno.cicloUno(campoTexto, nroObjetos));
    }

    @Entonces("^visualiza el mensaje de Se encuentra en el siguiente ciclo$")
    public void seVeMensajeDelSiguienteCiclo() {
        OnStage.theActorInTheSpotlight().should(seeThat(
                ValidacionCicloOK.esVisible()
        )
        );
    }
}
