package co.com.petBook.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookDetalleImagen {
    public static final Target DETALLE_IMAGEN = Target.the("verifica que la imagen buscada sea la misma").locatedBy("//div[@style='background-image: url(\"assets/images/{0}\");']");
        //.located(By.xpath("//div[@style='background-image: url(\"assets/images/perro1.jpg\");']"))                     locatedBy("//img[@src='assets/images/{0}']")
}
