package Tasks;

import Hooks.TheActor;
import UserInterfaces.CompraUserInterfaces;
import Utils.AlertHandler;
import Utils.EsperasUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.Actor;

import static UserInterfaces.AgregarCarritoUserInterfaces.*;
import static UserInterfaces.AgregarCarritoUserInterfaces.BTNAGREGAR;
import static UserInterfaces.CompraUserInterfaces.PLACEOLDER;
import static UserInterfaces.CompraUserInterfaces.PURCHASE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompraTask implements Task {
    private static String name;
    private static String country;
    private static String city;
    private static String Credit;
    private static String Month;
    private static String Year;
    public CompraTask(String name, String country, String city,String Credit,String Month, String Year) {

        this.name = name;
        this.country = country;
        this.city = city;
        this.Credit = Credit;
        this.Month = Month;
        this.Year = Year;

    }
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
            EsperasUtils.twoseconds();

            actor.attemptsTo(
                    Click.on(BTNCARRO),
                    WaitUntil.the(PLACEOLDER, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(PLACEOLDER),
                    Enter.theValue(name).into(CompraUserInterfaces.NAME),
                    Enter.theValue(country).into(CompraUserInterfaces.COUNTRY),
                    Enter.theValue(city).into(CompraUserInterfaces.CITY),
                    Enter.theValue(Credit).into(CompraUserInterfaces.CREDITCARD),
                    Enter.theValue(Month).into(CompraUserInterfaces.MONTH),
                    Enter.theValue(Year).into(CompraUserInterfaces.YEARS),
                    Click.on(PURCHASE));

        }

        public static  CompraTask compraTask(String name, String country, String city,String Credit,String Month, String Year) {

            return new CompraTask(name, country, city, Credit, Month, Year);

        }


}

