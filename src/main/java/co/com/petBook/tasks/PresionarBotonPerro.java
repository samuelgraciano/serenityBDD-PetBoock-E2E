package co.com.petBook.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.petBook.userinterfaces.PetBookHomePage.*;
import static co.com.petBook.userinterfaces.PetBookResultadosPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PresionarBotonPerro implements Task {


    public PresionarBotonPerro() {
    }

    public static Performable verImagenesBotonPerro() {
        return instrumented(PresionarBotonPerro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PET_BOOK_HOME_PAGE),
                Click.on(CLICK_BOTON_PERRO),
                //  Enter.theValue().into(CLICK_IMAGEN).thenHit(Keys.ENTER),
                WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}

