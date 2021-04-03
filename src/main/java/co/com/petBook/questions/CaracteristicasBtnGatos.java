package co.com.petBook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.petBook.userinterfaces.PetBookDetalleImagen.DETALLE_TODAS_LAS_IMAGENES_GATOS;

public class CaracteristicasBtnGatos implements Question<Boolean> {
    private String resultado;


    public CaracteristicasBtnGatos(String resultado){
        this.resultado = resultado;
    }

    public static CaracteristicasBtnGatos resultadoBtnGatos (String resultado){
        return new CaracteristicasBtnGatos(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(DETALLE_TODAS_LAS_IMAGENES_GATOS.of(resultado)).named("src").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado);
    }
}