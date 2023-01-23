package co.com.choucair.certificacion.retoautoma.task;

import co.com.choucair.certificacion.retoautoma.userinterfaces.PagColorbib;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina_2 implements Task {
    private PagColorbib pag_colorbib;
    public static AbrirPagina_2 urlApp() {
        return Tasks.instrumented(AbrirPagina_2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pag_colorbib));
    }
}
