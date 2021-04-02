package co.com.petBook.stepdefinitions;


import co.com.petBook.questions.CaracteristicasImagen;
import co.com.petBook.tasks.BuscarEnPetBook;
import co.com.petBook.tasks.PresionarBotonAll;
import co.com.petBook.tasks.SimuladorDBAnimalesPetBook;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookVerTodasImagenesMascotasStepDefinitions {

    @Cuando("^la (.*) quiere darle click a todas las mascotas$")
    public void darleClickATodasLasMascotas(String persona) {
        theActorCalled(persona).attemptsTo(
                PresionarBotonAll.verImagenesBotonAll()
        );
    }

    @Entonces("^le da click a cada foto y debe de agrandarla$")
    public void clickCadaFotoAgrandarla() {

        ArrayList listaAnimalesPetBook = new ArrayList();
        SimuladorDBAnimalesPetBook dbAnimalesPetBook = new SimuladorDBAnimalesPetBook();
        dbAnimalesPetBook.cargueTodoslosAnimales();
        listaAnimalesPetBook = dbAnimalesPetBook.getListaAnimalesPetBook();

        int i = 0;
        while (i < listaAnimalesPetBook.size()){
            theActorInTheSpotlight().attemptsTo(
                    BuscarEnPetBook.imagenDeMascota((String) listaAnimalesPetBook.get(i))
            );

            i++;
        }
    }

}
