package co.com.petBook.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookHomePage {
	public static final String PET_BOOK_HOME_PAGE = "http://localhost:4200/";
	public static final Target CLICK_IMAGEN = Target.the("encuentra la imagen que busca y le da click").located(By.xpath("//img[@src='assets/images/perro1.jpg']"));

}
