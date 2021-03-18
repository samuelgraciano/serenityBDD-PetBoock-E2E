package co.com.petBook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.petBook.userinterfaces.PetBookDetalleImagen.DETALLE_IMAGEN;

public class CaracteristicasImagen implements Question<Boolean> {
    private String resultado;

    public CaracteristicasImagen(String resultado){
        this.resultado = resultado;
    }

    public static CaracteristicasImagen resultadoImagen(String resultado){
        return new CaracteristicasImagen(resultado);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(DETALLE_IMAGEN).named("href").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado);
        // nesecito preguntar como hago para man verificar la foto que esta llegando con el xpath
    }
}
