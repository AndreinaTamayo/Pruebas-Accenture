package Tasks;

import UserInterfaces.SingUpUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UserInterfaces.SingUpUserInterfaces.BTNSINGUP;
import static UserInterfaces.SingUpUserInterfaces.TXTUSERNAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SingUpTask implements Task {

    private static String userName;
    private static String passWord;
    public SingUpTask(String userName, String passWord) {

        this.userName = userName;
        this.passWord = passWord;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTNSINGUP),
                WaitUntil.the(TXTUSERNAME, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(userName).into(SingUpUserInterfaces.TXTUSERNAME),
                Enter.theValue(passWord).into(SingUpUserInterfaces.TXTPASSWORD),
                Click.on(SingUpUserInterfaces.BTNSINGUP2));
    }

    public static  SingUpTask singUpTask(String userName, String passWord) {

        return new SingUpTask(userName, passWord);

    }

}
