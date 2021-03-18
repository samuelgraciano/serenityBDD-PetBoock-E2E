package co.com.petBook.stepdefinitions;


import co.com.petBook.exceptions.ResultadoDeBusquedaInesperado;
import co.com.petBook.questions.CaracteristicasImagen;
import co.com.petBook.questions.PrimerResultadoGoogle;
import co.com.petBook.tasks.BuscarEnPetBook;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookVerImagenMascotaStepDefinitions {


    @Cuando("^el (.*) busca la foto (.*) de la mascota$")
    public void usuarioBuscaFotoMascota(String nombreActor, String imagen) {
        theActorCalled(nombreActor).attemptsTo(
                BuscarEnPetBook.imagenDeMascota(imagen)
        );
    }

    @Entonces("^debe encontrar la foto (.*) y agrandarla$")
    public void encontrarFotoAgrandarla(String foto) {
        theActorInTheSpotlight().should(seeThat(
                CaracteristicasImagen.resultadoImagen(foto)
        ));
    }


    @Entonces("^debe ver como primer resultado (.*)$")
    public void debeVerComoPrimerResultado(String resultado) {
        theActorInTheSpotlight().should(seeThat(
                PrimerResultadoGoogle.es(resultado)).orComplainWith(
                ResultadoDeBusquedaInesperado.class, ResultadoDeBusquedaInesperado.ENCONTRADO_OTRO_RESULTADO
                )
        );
    }
}
