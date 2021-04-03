package co.com.petBook.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookDetalleImagen {

    public static final Target DETALLE_IMAGEN = Target.the("verifica que la imagen buscada sea la misma").locatedBy("//div[@style='background-image: url(\"assets/images/{0}\");']");
    public static final Target DETALLE_TODAS_LAS_IMAGENES = Target.the("verifica que esten todas las imagenes de los animales").locatedBy("//app-root//div//app-imagegallery//ul//li//img[@src='assets/images/{0}']");
    public static final Target DETALLE_TODAS_LAS_IMAGENES_PERROS = Target.the("verifica que esten todas las imagenes de los perros").locatedBy("//app-root//div//app-imagegallery//ul//li//img[@src='assets/images/{0}']");
    public static final Target DETALLE_TODAS_LAS_IMAGENES_GATOS = Target.the("verifica que esten todas las imagenes de los gatos").locatedBy("//app-root//div//app-imagegallery//ul//li//img[@src='assets/images/{0}']");

}
