package co.com.choucair.certificacion.retoautoma.task;
import co.com.choucair.certificacion.retoautoma.userinterfaces.Paginablaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPageFromClass;


public class AbrirPagina implements Task {
    private Paginablaze paginablaze;
    public static AbrirPagina urlApp(){
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginablaze));
    }
}
