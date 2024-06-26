package StepDefinitions;

import UserInterfaces.SingUpUserInterfaces;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Open;

import static Hooks.TheActor.Andreina;

public class SingUpStepDefinitions {
    SingUpUserInterfaces Url;

    @Given("El usuario ingresa a la pagina web")
    public void elUsuarioIngresaALaPaginaWeb() {
        Andreina.wasAbleTo(Open.browserOn().the(Url));
    }

    @And("visualiza el modal de sing up")
    public void visualizaElModalDeSingUp() {

    }

    @When("Ingresa con su {string} y {string}")
    public void ingresaConSuY(String username, String password) {

        Andreina.attemptsTo(Tasks.SingUpTask.singUpTask(username, password));

    }

    @And("da clic en el boton sing up")
    public void daClicEnElBotonSingUp() {

    }

    @Then("se visualiza la alerta de Sign up successful")
    public void seVisualizaLaAlertaDeSignUpSuccessful() {
    }
}
