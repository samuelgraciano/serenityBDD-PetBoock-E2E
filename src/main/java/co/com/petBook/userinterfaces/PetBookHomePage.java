package co.com.petBook.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleSearchPage {
	public static final String PET_BOOK_HOME_PAGE = "http://localhost:4200/";
	public static final Target CLICK_IMAGEN = Target.the("encuentra la imagen que busca y le da click").located(By.xpath("//img[@src='assets/images/{0}']"));
	public static final Target RESULTADOS_BUSQUEDA = Target.the("verifica que la imagen buscada sea la misma").located(By.xpath("//div[@style='background-image: url(\"assets/images/{0}\");']"));

}
