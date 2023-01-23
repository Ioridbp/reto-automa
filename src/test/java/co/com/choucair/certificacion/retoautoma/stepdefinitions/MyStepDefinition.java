package co.com.choucair.certificacion.retoautoma.stepdefinitions;

import co.com.choucair.certificacion.retoautoma.question.Verificar;
import co.com.choucair.certificacion.retoautoma.task.AbrirPagina;
import co.com.choucair.certificacion.retoautoma.task.IngresaDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.mockito.stubbing.Answer;

import java.util.regex.Matcher;

public class MyStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Que el usuario ingresa a la pagina$")
    public void queElUsuarioIngresaALaPagina() {

        OnStage.theActorCalled("usuario").wasAbleTo(AbrirPagina.urlApp());
    }

    @Cuando("^de click en el menú Contact y rellene el formulario$")
    public void deClickEnElMenúContactYRelleneElFormulario() {
        //OnStage.theActorCalled("usuario").wasAbleTo(IngresaDatos.datosform());
        OnStage.theActorInTheSpotlight().attemptsTo(IngresaDatos.datosform());

    }

    @Entonces("^verifica que el mensaje pueda ser enviado(.*)$")
    public void verificaQueElMensajePuedaSerEnviado(String question) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.btnaceptar(question)));
    }
}
