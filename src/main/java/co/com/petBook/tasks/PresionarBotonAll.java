package co.com.petBook.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.petBook.userinterfaces.PetBookHomePage.*;
import static co.com.petBook.userinterfaces.PetBookHomePage.CLICK_BOTON_ALL;
import static co.com.petBook.userinterfaces.PetBookResultadosPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PresionarBotonAll implements Task {


    public PresionarBotonAll() {
    }

    public static Performable verImagenesBotonAll() {
        return instrumented(PresionarBotonAll.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PET_BOOK_HOME_PAGE),
                Click.on(CLICK_BOTON_ALL),
                WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
