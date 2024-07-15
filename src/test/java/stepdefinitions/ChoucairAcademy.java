package stepdefinitions;

import exceptions.ValidarCurso;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.BuscarCurso;
import tasks.IniciarSesion;
import tasks.IrPaginaChoucair;


public class ChoucairAcademy {

    @Before
    public void ingresarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que un usuario quiere ingresar automaticamente a choucair academy")
    public void queUnUsuarioQuiereIngresarAutomaticamenteAChoucairAcademy() {
        OnStage.theActorCalled("usuario").wasAbleTo(
                IrPaginaChoucair.urlApp(), IniciarSesion.ingresarApp()
        );
    }
    @Cuando("se diriga a buscar el curso de Automatizacion en el plataforma de choucair academy")
    public void seDirigaABuscarElCursoDeAutomatizacionEnElPlataformaDeChoucairAcademy() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarCurso.busqueda()
        );
    }
    @Entonces("^el llama el curso automaticamente(.*)$")
    public void elLlamaElCursoAutomaticamente(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCurso.irCurso(question)));
    }
}
