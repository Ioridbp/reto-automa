package co.com.choucair.certificacion.retoautoma.task;

import co.com.choucair.certificacion.retoautoma.userinterfaces.PagColorbib;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login credenciales(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("dbeltranp@choucairtesting.com").into(PagColorbib.TXT_USER),
                Enter.theValue("contra123456").into(PagColorbib.TXT_PASS),
                Click.on(PagColorbib.BTN_SIGN)
        );

    }
}
