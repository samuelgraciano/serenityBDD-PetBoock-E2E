package co.com.petBook.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.petBook.userinterfaces.PetBookHomePage.CLICK_BOTON_ALL;
import static co.com.petBook.userinterfaces.PetBookHomePage.PET_BOOK_HOME_PAGE;
import static co.com.petBook.userinterfaces.PetBookResultadosPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DarleClickTodasImagenes implements Task {
    private String mascota;


    public DarleClickTodasImagenes(String mascota) {
        this.mascota = mascota;
    }

    public static Performable clickTodasImagenes(String mascota) {
        return instrumented(DarleClickTodasImagenes.class, mascota);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PET_BOOK_HOME_PAGE),
                Click.on(CLICK_BOTON_ALL.of(mascota)),
                WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
