package StepDefinitions;

import Tasks.AgregarCarritoTask;
import UserInterfaces.AgregarCarritoUserInterfaces;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import static Hooks.TheActor.Andreina;

public class AgregarCarritoStepDefinitions {

    AgregarCarritoUserInterfaces Url;

    @Given("usuario  en la pagina de productos")
    public void usuarioEnLaPaginaDeProductos() {

        Andreina.wasAbleTo(Open.browserOn().the(Url));
    }

    @When("selecciona un producto")
    public void seleccionaUnProducto() {

        Andreina.attemptsTo(AgregarCarritoTask.agregarCarritoTask());

    }

    @And("hace  clic en el boton Add to cart")
    public void haceClicEnElBotonAddToCart() {

    }

    @Then("se visualiza agregado al carro de compras")
    public void seVisualizaAgregadoAlCarroDeCompras() {
    }
}
