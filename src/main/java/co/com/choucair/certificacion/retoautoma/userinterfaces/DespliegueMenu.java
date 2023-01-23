package co.com.choucair.certificacion.retoautoma.userinterfaces;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class DespliegueMenu extends PageObject {
    public static final Target CLIC_MENU = Target.the("Desplegar menu contact").
            located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
    public static final Target CAMPO_EMAIL = Target.the("Rellenar correo").
            located(By.xpath("//*[@id=\"recipient-email\"]"));
    public static final Target  CAMPO_NOMBRE = Target.the("Rellenar nombre").
            located(By.xpath("//*[@id=\"recipient-name\"]"));
    public static final Target CAMPO_MENSAJE = Target.the("Rellenar mensaje").
            located(By.xpath("//*[@id=\"message-text\"]"));
    public static final Target CLIC_BTN_SEND = Target.the("Enviar mensaje").
            located(By.xpath("//button[contains(text(),'Send message')]"));
}
