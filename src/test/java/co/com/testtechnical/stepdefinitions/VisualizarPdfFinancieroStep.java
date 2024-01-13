package co.com.testtechnical.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class VisualizarPdfFinancieroStep {

    @Managed
    WebDriver myDriver;

    @Before
    public void setUp(){

        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("Andres").can(BrowseTheWeb.with(myDriver));
    }

    @Given("^que (.*) ha ingresado a la pagina$")
    public void queAndresHaIngresadoALaPagina(String actor) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.aerocivil.gov.co/"));
        theActorCalled(actor);
    }

}
