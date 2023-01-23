package co.com.choucair.certificacion.retoautoma.stepdefinitions;
import co.com.choucair.certificacion.retoautoma.question.Verificar;
import co.com.choucair.certificacion.retoautoma.task.AbrirPagina;
import co.com.choucair.certificacion.retoautoma.task.AbrirPagina_2;
import co.com.choucair.certificacion.retoautoma.task.Login;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class MyStepdefs {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Que el usuario ingrese a la pagina$")
    public void queElUsuarioIngreseALaPagina() {
        OnStage.theActorCalled("usuario").wasAbleTo(AbrirPagina_2.urlApp());
    }

    @Cuando("^digite el usuario y contraseña$")
    public void digiteElUsuarioYContraseña() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.credenciales());
    }

    @Entonces("^verificar que ingrese a la pagina(.*)$")
    public void verificarQueIngreseALaPagina(String question) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("Bootstrap-Admin-Template")));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(question)));
    }
}
