package co.com.petBook.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookHomePage {
	public static final String PET_BOOK_HOME_PAGE = "http://localhost:4200/";
	public static final Target CLICK_IMAGEN = Target.the("encuentra la imagen que busca y le da click").locatedBy("//img[@src='assets/images/{0}']");
	public static final Target CLICK_BOTON_ALL = Target.the("encuentra el boton All y le da click").located(By.id("btnAll"));
	public static final Target CLICK_BOTON_PERRO = Target.the("encuentra el boton perro y le da click").located(By.id("btnPerro"));
	public static final Target CLICK_BOTON_GATO = Target.the("encuentra el boton gato y le da click").located(By.id("btnGato"));

}
