package co.com.choucair.certificacion.retoautoma.task;
import co.com.choucair.certificacion.retoautoma.userinterfaces.DespliegueMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.certificacion.retoautoma.interaction.Alert.alergettext;

public class IngresaDatos implements Task{
    public static IngresaDatos datosform() {
        return Tasks.instrumented(IngresaDatos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo
                (Click.on(DespliegueMenu.CLIC_MENU),
                Enter.theValue("dbeltranp@choucairtesting.com").into(DespliegueMenu.CAMPO_EMAIL),
                Enter.theValue("Daniel Beltran").into(DespliegueMenu.CAMPO_NOMBRE),
                Enter.theValue("Mensaje de prueba, para validación de campo").into(DespliegueMenu.CAMPO_MENSAJE),
                Click.on(DespliegueMenu.CLIC_BTN_SEND)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo();
    }


}
