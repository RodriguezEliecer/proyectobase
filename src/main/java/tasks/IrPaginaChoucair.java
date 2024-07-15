package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.*;

public class IrPaginaChoucair implements Task {
    private paginaChoucairAcademy urlChoucairAcademy;
    public static IrPaginaChoucair urlApp() {
        return Tasks.instrumented(IrPaginaChoucair.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(urlChoucairAcademy)
        );
    }
}
