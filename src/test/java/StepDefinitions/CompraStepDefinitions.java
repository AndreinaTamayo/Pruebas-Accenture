package StepDefinitions;

import UserInterfaces.CompraUserInterfaces;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static Hooks.TheActor.Andreina;


public class CompraStepDefinitions {

  CompraUserInterfaces Url;

    @Given("El usuario ingresa a la pagina web selecciona un producto")
    public void elUsuarioIngresaALaPaginaWebSeleccionaUnProducto() {
        Andreina.wasAbleTo(Open.browserOn().the(Url));
    }

    @And("va al carro de compras")
    public void vaAlCarroDeCompras() {
    }

    @When("da clic en el boton de realizar pedido")
    public void daClicEnElBotonDeRealizarPedido() {
    }

    @And("ingresa los datos de {string} {string} {string} {string} {string} {string}")
    public void ingresaLosDatosDe(String name, String country, String city,String Credit,String Month, String Year) {

        Andreina.attemptsTo(Tasks.CompraTask.compraTask(name, country,city, Credit, Month, Year));

    }

    @Then("se visualiza el modal de pedido exitoso")
    public void seVisualizaElModalDePedidoExitoso() {
    }

}
