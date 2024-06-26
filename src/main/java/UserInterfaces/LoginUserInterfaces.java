package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserInterfaces extends PageObject {

    public static final Target BTNLOGIN = Target.the("Boton para ingresar al LOGIN ").located(By.id("login2"));
    public static final Target TXTUSERNAMELOGIN = Target.the("label para ingresar usuario ").located(By.id("loginusername"));
    public static final Target TXTPASSWORDLOGIN = Target.the("label para ingresar contraseña ").located(By.id("loginpassword"));

    public static final Target BTNLOGIN2 = Target.the("Boton para el login ").located(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));

    public static final Target WELCOME = Target.the("label que confirma el ingreso ").located(By.id("nameofuser"));




}
