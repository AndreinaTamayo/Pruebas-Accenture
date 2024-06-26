package Tasks;

import Hooks.TheActor;
import UserInterfaces.LoginUserInterfaces;
import UserInterfaces.SingUpUserInterfaces;
import Utils.AlertHandler;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UserInterfaces.LoginUserInterfaces.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task  {

    private static String userNameLogin;
    private static String passWordLogin;
    public LoginTask(String userNameLogin, String passWordLogin) {

        this.userNameLogin = userNameLogin;
        this.passWordLogin = passWordLogin;
    }

    AlertHandler alerthandler = new AlertHandler(TheActor.getDriver());
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTNLOGIN),
                WaitUntil.the(TXTUSERNAMELOGIN, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(userNameLogin).into(LoginUserInterfaces.TXTUSERNAMELOGIN),
                Enter.theValue(passWordLogin).into(LoginUserInterfaces.TXTPASSWORDLOGIN),
                Click.on(LoginUserInterfaces.BTNLOGIN2));


        alerthandler.acceptAlert();
        actor.attemptsTo(WaitUntil.the(WELCOME, isVisible()).forNoMoreThan(5).seconds());
    }


    public static  LoginTask loginTask(String userNameLogin, String passWordLogin) {

        return new LoginTask(userNameLogin, passWordLogin);

    }



}
