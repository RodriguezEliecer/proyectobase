package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarCursoChoucairAcademy extends PageObject {
    public static final Target INPUT_UNIVERSIDAD = Target.the(
            "input para seleccionar la universidad CH").located(
            //By.xpath("//*[@id='universidad']//strong[contains(text(),'Universidad')]")
            By.xpath("//*[@id='universidad']//strong")
    );
    public static final Target INPUT_BUSQUEDA = Target.the(
            "input para bucar el curso").located(
                    By.id("coursesearchbox")
    );
    public static final Target BTN_BUSCAR = Target.the(
            "Boton para realizar la busqueda").located(
            By.xpath("//*[@id='coursesearch']//button[contains(text(),'Ir')]")
    );
    public static final Target NOMBRE_CURSO = Target.the(
            "Extrae el nombre del curso").located(
            By.xpath("//*[@id='yui_3_17_2_1_1720648509185_296']")
    );
}
