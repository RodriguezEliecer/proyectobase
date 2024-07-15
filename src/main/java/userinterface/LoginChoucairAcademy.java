package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginChoucairAcademy extends PageObject {
    public static final Target LOGIN_BTN = Target.the(
            "Boton para iniciar sesion").located(
                    By.xpath("//*[@id='nav-menu']/ul[2]//strong[contains(text(),'Ingresar')]")
    );
    public static final Target INPUT_NOMBREUSUARIO = Target.the(
            "Input nombre del usuario").located(
                    By.id("username")
    );
    public static final Target INPUT_CLAVE = Target.the(
    "Input clave del usuario").located(
                    By.id("password")
    );
    public static final Target BTN_ACCEDER = Target.the(
            "boton acceder a la pagina").located(
                    By.xpath("//button[contains(@class,'btn btn-primary')]")
    );
}
