package co.com.petBook.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookResultadosPage {
    public static final Target RESULTADOS_BUSQUEDA = Target.the("verifica que la imagen buscada sea la misma").located(By.xpath("//div[@class='row']"));
        //.located(By.xpath("//div[@style='background-image: url(\"assets/images/perro1.jpg\");']"))
}