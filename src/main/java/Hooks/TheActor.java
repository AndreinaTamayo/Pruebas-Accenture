package Hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TheActor {

    public static Actor Andreina;
    @Managed(driver = "chrome")


    private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }


    @Before(order = 1)
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Before(order = 2)
    public void setTheActor(){
        Andreina = Actor.named("Andreina");
        Andreina.can(BrowseTheWeb.with(driver));
    }
}






