package exceptions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterface.BuscarCursoChoucairAcademy.*;

public class ValidarCurso implements Question<Boolean>{
    private String question;

    public ValidarCurso(String question) {
        this.question = question;
    }

    public static ValidarCurso irCurso(String question) {
        return new ValidarCurso(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String nombreCurso = Text.of(NOMBRE_CURSO).answeredBy(actor).toString();

        System.out.println("Nombre de curso " +nombreCurso);
        if (question.equals(nombreCurso))
            resultado = true;
        else
            resultado = false;
        return resultado;
    }
}
