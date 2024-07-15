package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.BuscarCursoChoucairAcademy;


public class BuscarCurso implements Task {

    public static BuscarCurso busqueda() {
        return Tasks.instrumented(BuscarCurso.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Prueba123");
        actor.attemptsTo(
                Click.on(BuscarCursoChoucairAcademy.INPUT_UNIVERSIDAD),
                Enter.theValue("Metodología Bancolombia").into(BuscarCursoChoucairAcademy.INPUT_BUSQUEDA),
                Click.on(BuscarCursoChoucairAcademy.BTN_BUSCAR)
        );
    }
}
