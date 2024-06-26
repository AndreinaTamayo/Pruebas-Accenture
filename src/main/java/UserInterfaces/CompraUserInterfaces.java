package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraUserInterfaces extends PageObject {

    public static final Target PLACEOLDER = Target.the("Boton para realizar la compra").located(By.xpath("/html/body/div[6]/div/div[2]/button"));
    public static final Target NAME = Target.the("label para el nombre").located(By.id("name"));
    public static final Target COUNTRY = Target.the("label para el pais").located(By.id("country"));
    public static final Target CITY = Target.the("label para la ciudad").located(By.id("city"));
    public static final Target CREDITCARD = Target.the("label para la tarjeta de credito").located(By.id("card"));
    public static final Target MONTH = Target.the("label para ingresar el mes").located(By.id("month"));
    public static final Target YEARS = Target.the("label para ingresar el año").located(By.id("year"));
    public static final Target PURCHASE = Target.the("Boton para COMPRAR").located(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));






}
