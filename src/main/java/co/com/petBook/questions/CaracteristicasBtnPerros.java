package co.com.petBook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import static co.com.petBook.userinterfaces.PetBookDetalleImagen.DETALLE_TODAS_LAS_IMAGENES_PERROS;

public class CaracteristicasBtnPerros implements Question<Boolean> {
    private String resultado;


    public CaracteristicasBtnPerros(String resultado){
        this.resultado = resultado;
    }

    public static CaracteristicasBtnPerros resultadoBtnPerros (String resultado){
        return new CaracteristicasBtnPerros(resultado);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(DETALLE_TODAS_LAS_IMAGENES_PERROS.of(resultado)).named("src").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado);
    }
}