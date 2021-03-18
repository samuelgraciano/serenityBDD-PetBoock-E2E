package co.com.petBook.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.petBook.userinterfaces.PetBookHomePage.*;
import static co.com.petBook.userinterfaces.PetBookResultadosPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarEnPetBook implements Task {
    private String imagen;

    public BuscarEnPetBook(String imagen) {
        this.imagen = imagen;
    }

    public static Performable imagenDeMascota(String imagen) {
        return instrumented(BuscarEnPetBook.class, imagen);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PET_BOOK_HOME_PAGE),
                Click.on(CLICK_IMAGEN),// nesecito preguntar como le mando la imagen al target y se la coloco al xpath
              //  Enter.theValue().into(CLICK_IMAGEN).thenHit(Keys.ENTER),
                WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
