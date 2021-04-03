package co.com.petBook.stepdefinitions;

import co.com.petBook.exceptions.ResultadoDeBusquedaInesperado;
import co.com.petBook.questions.CaracteristicasBtnGatos;
import co.com.petBook.questions.CaracteristicasBtnPerros;
import co.com.petBook.questions.CaracteristicasBtnTodasImagenes;

import co.com.petBook.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.ArrayList;

import static co.com.petBook.exceptions.ResultadoDeBusquedaInesperado.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookFiltrarMascotasStepDefinitions {

    @Cuando("^la (.*) presione el boton All para ver todas las mascotas$")
    public void PersonaPresionaBotonVerTodasMascotas(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(PresionarBotonAll.verImagenesBotonAll());
    }

    @Entonces("^debe encontrar todas las mascotas$")
    public void EncontrarTodasLasMascotas() {

        ArrayList listaAnimalesPetBook = new ArrayList();
        SimuladorDBAnimalesPetBook dbAnimalesPetBook = new SimuladorDBAnimalesPetBook();
        dbAnimalesPetBook.cargueTodoslosAnimales();

        listaAnimalesPetBook = dbAnimalesPetBook.getListaAnimalesPetBook();
        int i = 0;
        while (i < listaAnimalesPetBook.size()){
            theActorInTheSpotlight().should(seeThat(
                    CaracteristicasBtnTodasImagenes.resultadoBtnTodasImagenes((String) listaAnimalesPetBook.get(i))
            ).orComplainWith(
                    ResultadoDeBusquedaInesperado.class, FALTA_FOTO_MASCOTA));

            i++;
        }

    }

    @Cuando("^la (.*) presione el boton perro$")
    public void PersonaPresioneBotonPerro(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(PresionarBotonPerro.verImagenesBotonPerro());
    }

    @Entonces("^debe encontrar todos los perros$")
    public void encontrarTodosLosPerros() {
        ArrayList listaAnimalesPerrosPetBook = new ArrayList();
        SimuladorDBAnimalesPetBook dbAnimalesPetBook = new SimuladorDBAnimalesPetBook();
        dbAnimalesPetBook.cargueTodoslosPerros();
        listaAnimalesPerrosPetBook = dbAnimalesPetBook.getListaAnimalesPetBook();
        int i=0;
        while (i < listaAnimalesPerrosPetBook.size()){
            theActorInTheSpotlight().should(seeThat(
                    CaracteristicasBtnPerros.resultadoBtnPerros((String) listaAnimalesPerrosPetBook.get(i))
            ).orComplainWith(
                    ResultadoDeBusquedaInesperado.class, NO_ENCONTRO_ALGUNA_FOTO_PERRO));
            i++;
        }

    }

    @Cuando("^la (.*) presione el boton Gato$")
    public void personaPresionaBotonGato(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(PresionarBotonGato.verImagenesBotonGato());
    }

    @Entonces("^debe encontrar todos los gatos$")
    public void encontrarTodosLosGatos() {
        ArrayList listaAnimalesGatosPetBook = new ArrayList();
        SimuladorDBAnimalesPetBook dbAnimalesPetBook = new SimuladorDBAnimalesPetBook();
        dbAnimalesPetBook.cargueTodoslosGatos();
        listaAnimalesGatosPetBook = dbAnimalesPetBook.getListaAnimalesPetBook();
        int i=0;
        while (i < listaAnimalesGatosPetBook.size()){

            theActorInTheSpotlight().should(seeThat(
                    CaracteristicasBtnGatos.resultadoBtnGatos((String) listaAnimalesGatosPetBook.get(i))
            ).orComplainWith(
                    ResultadoDeBusquedaInesperado.class, NO_ENCONTRO_ALGUNA_FOTO_GATO));
            i++;

        }
    }

}