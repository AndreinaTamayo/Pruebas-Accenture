package Tasks;

import Hooks.TheActor;
import Utils.AlertHandler;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UserInterfaces.AgregarCarritoUserInterfaces.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarCarritoTask implements Task {


    AlertHandler alerthandler = new AlertHandler(TheActor.getDriver());
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTNHOME),
                WaitUntil.the(PHONE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(PHONE),
                Click.on(GALAXYS6),
                Click.on(BTNAGREGAR));

        alerthandler.acceptAlert();

        actor.attemptsTo(
                Click.on(BTNHOME),
                WaitUntil.the(LAPTOPS, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LAPTOPS),
                Click.on(MACBOOKPRO),
                Click.on(BTNAGREGAR));


        alerthandler.acceptAlert();

        actor.attemptsTo(
                Click.on(BTNHOME),
                WaitUntil.the(MONITORS, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MONITORS),
                Click.on(APPLEMONITORS),
                Click.on(BTNAGREGAR));

        alerthandler.acceptAlert();

        actor.attemptsTo(
                Click.on(BTNHOME),
                WaitUntil.the(BTNCARRO, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTNCARRO),
                WaitUntil.the(DELETE, isVisible()).forNoMoreThan(5).seconds());


    }
    public static AgregarCarritoTask agregarCarritoTask() {

        return new AgregarCarritoTask();

    }

}
