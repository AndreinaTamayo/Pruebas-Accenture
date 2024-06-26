
Feature: Ingresar al Portal Web demoblaze.com
@singup
 Scenario Outline: Ingresar al sing up
    Given   El usuario ingresa a la pagina web
    And     visualiza el modal de sing up
    When    Ingresa con su "<username>" y "<password>"
    And     da clic en el boton sing up
    Then    se visualiza la alerta de Sign up successful
    Examples:
      | username    | password |
      | AndreTamayo | 123456   |



  @Login
  Scenario Outline: Ingresar al login
    Given   El usuario ingresa a la pagina web visualiza el modal de login
    When    Ingresa al login con su "<usernamelogin>" y "<passwordlogin>"
    And     da clic en el boton login
    Then    se visualiza la pagina principal Welcome AndreTamayo
    Examples:
      | usernamelogin | passwordlogin |
      | AndreTamayo   | 123456        |


  @Compra
  Scenario Outline: Se realiza una compra
    Given   El usuario ingresa a la pagina web selecciona un producto
    And     va al carro de compras
    When    da clic en el boton de realizar pedido
    And    ingresa los datos de "<name>" "<country>" "<city>" "<Credit>" "<Month>" "<Year>"
    Then   se visualiza el modal de pedido exitoso
    Examples:
      | name     | country  | city       | Credit    | Month | Year |
      | Tamayito | Colombia | Bucarayork | 123456789 | 06    | 2028 |



