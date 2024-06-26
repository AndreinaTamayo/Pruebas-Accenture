package StepDefinitions;

import UserInterfaces.LoginUserInterfaces;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static Hooks.TheActor.Andreina;

public class LoginStepDefinitions {

    LoginUserInterfaces Url;


    @Given("El usuario ingresa a la pagina web visualiza el modal de login")
    public void elUsuarioIngresaALaPaginaWebVisualizaElModalDeLogin() {
        Andreina.wasAbleTo(Open.browserOn().the(Url));

    }

    @When("Ingresa al login con su {string} y {string}")
    public void ingresaAlLoginConSuY(String usernamelogin, String passwordlogin) {

        Andreina.attemptsTo(Tasks.LoginTask.loginTask(usernamelogin, passwordlogin));

    }

    @And("da clic en el boton login")
    public void daClicEnElBotonLogin() {

    }

    @Then("se visualiza la pagina principal Welcome AndreTamayo")
    public void seVisualizaLaPaginaPrincipalWelcomeAndreTamayo() {
    }
}
