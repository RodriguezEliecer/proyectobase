package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginChoucairAcademy;

public class IniciarSesion implements Task {
    public static IniciarSesion ingresarApp() {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginChoucairAcademy.LOGIN_BTN),
                Enter.theValue("erodriguezch").into(LoginChoucairAcademy.INPUT_NOMBREUSUARIO),
                Enter.theValue("Ch0uca1rER096").into(LoginChoucairAcademy.INPUT_CLAVE),
                Click.on(LoginChoucairAcademy.BTN_ACCEDER)
        );
    }
}
