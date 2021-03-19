package co.com.petBook.stepdefinitions;


import co.com.petBook.questions.CaracteristicasImagen;
import co.com.petBook.tasks.BuscarEnPetBook;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookVerImagenMascotaStepDefinitions {


    @Cuando("^la (.*) busca la foto (.*) de la mascota$")
    public void personaBuscaFotoMascota(String nombreActor, String imagen) {
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

}
