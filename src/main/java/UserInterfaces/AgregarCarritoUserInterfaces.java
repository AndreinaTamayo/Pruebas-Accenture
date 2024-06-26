package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarCarritoUserInterfaces extends PageObject {

    public static final Target PHONE = Target.the("Boton para seleccionar phone").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"));
    public static final Target LAPTOPS = Target.the("Boton para seleccionar LAPTOPS").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
    public static final Target MONITORS = Target.the("Boton para seleccionar MONITORS").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));
    public static final Target GALAXYS6 = Target.the("Seleccionar telefono").located(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a\n"));
    public static final Target MACBOOKPRO = Target.the("Seleccionar laptos").located(By.xpath("/html/body/div[5]/div/div[2]/div/div[6]/div/div/h4/a"));
    public static final Target APPLEMONITORS = Target.the("Seleccionar monitor").located(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a"));
    public static final Target BTNAGREGAR = Target.the("Boton para Agregar al carrito").located(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
    public static final Target BTNCARRO = Target.the("Boton para ver que hay en el carrito").located(By.id("cartur"));
    public static final Target BTNHOME = Target.the("Boton para volver home").located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
    public static final Target DELETE = Target.the("Boton PARA ELIMINAR").located(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a"));


}
