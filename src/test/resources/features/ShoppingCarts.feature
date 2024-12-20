
  Feature: Compra

    @compra
    Scenario: Compra

      Given estoy en la aplicación de SauceLabs
      And valido que carguen correctamente los productos en la galeria
      When agrego "2" del siguiente producto "Sauce Labs Backpack"
      Then valido el carrito de compra actualice correctamente "2" y "Sauce Labs Backpack"
