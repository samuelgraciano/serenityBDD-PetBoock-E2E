package co.com.petBook.questions;

import co.com.petBook.userinterfaces.PetBookResultadosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.petBook.userinterfaces.PetBookDetalleImagen.DETALLE_IMAGEN;
import static co.com.petBook.userinterfaces.PetBookResultadosPage.RESULTADOS_BUSQUEDA;

public class PrimerResultadoGoogle implements Question<Boolean> {
    private String resultado;

    public PrimerResultadoGoogle(String resultado){
        this.resultado = resultado;
    }

    public static PrimerResultadoGoogle es(String resultado){
        return new PrimerResultadoGoogle(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(DETALLE_IMAGEN).named("href").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado);
    }
}
