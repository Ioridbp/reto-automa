package co.com.choucair.certificacion.retoautoma.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/prueba_2.feature",
        tags ="@HistoriaDeUsuario",
        glue ="co.com.choucair.certificacion.retoautoma.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class Runner2 {
}
