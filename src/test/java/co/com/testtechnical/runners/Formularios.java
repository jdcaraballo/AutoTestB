package co.com.testtechnical.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/formulario.feature",
        snippets = SnippetType.CAMELCASE,
//        tags = "@Ciclo1",
        glue = "co.com.testtechnical.stepdefinitions",dryRun = false)


public class Formularios {
}
