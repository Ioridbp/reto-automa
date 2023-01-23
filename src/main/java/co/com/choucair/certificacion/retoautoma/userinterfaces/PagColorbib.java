package co.com.choucair.certificacion.retoautoma.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PagColorbib extends PageObject {
    public static final Target TXT_USER = Target.the("Rellenar usuario").
            located(By.xpath("//*[@id=\"login\"]/form/input[1]"));
    public static final Target TXT_PASS = Target.the("rellenar contraseña").
            located(By.xpath("//*[@id=\"login\"]/form/input[2]"));
    public static final Target BTN_SIGN = Target.the("Clic boton sign in").
            located(By.xpath("//*[@id=\"login\"]/form/button"));
    public static final Target LBL_TITULO = Target.the("Extrae el título de la pag").
            located(By.xpath("//h1[contains(text(),'Bootstrap-Admin-Template')]"));

}
