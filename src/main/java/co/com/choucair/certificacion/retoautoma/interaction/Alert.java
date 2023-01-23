package co.com.choucair.certificacion.retoautoma.interaction;
import co.com.choucair.certificacion.retoautoma.task.IngresaDatos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class Alert implements Interaction {

    public static Alert alergettext() {
        return Instrumented.instanceOf(Alert.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver webdriver = BrowseTheWeb.as(actor).getDriver();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webdriver.switchTo().alert().dismiss();

        System.out.println("Texto del alert :");

    }
}
