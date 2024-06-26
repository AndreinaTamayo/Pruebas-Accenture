package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingUpUserInterfaces  extends PageObject {

    public static final Target BTNSINGUP = Target.the("Boton para ingresar al Sing up ").located(By.id("signin2"));
    public static final Target TXTUSERNAME = Target.the("label para ingresar usuario ").located(By.id("sign-username"));
    public static final Target TXTPASSWORD = Target.the("label para ingresar contraseña ").located(By.id("sign-password"));
    public static final Target BTNSINGUP2 = Target.the("Boton para Registro ").located(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]"));



}











