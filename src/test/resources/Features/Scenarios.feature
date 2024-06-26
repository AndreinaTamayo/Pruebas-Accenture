
Feature: Ingresar al Portal Web demoblaze.com

  @AgregarCarrito
  Scenario: agregar al carrito
    Given   usuario  en la pagina de productos
    When    selecciona un producto
    And     hace  clic en el boton Add to cart
    Then    se visualiza agregado al carro de compras

