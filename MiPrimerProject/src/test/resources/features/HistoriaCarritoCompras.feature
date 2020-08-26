Feature: Historia de carrito de compras
  como cliente
  necesito realizar la selección de productos
  para realidar una compra

  Scenario: Compra con datos de tarjeta credito
    Given validar que la web este disponible
    When generar tarjeta valida
    And Obtener los datos de la tarjeta
    And seleccionar la cantidad "4"
    And comprar el producto
    And ingresar los datos de la tarjeta
    And pagar el producto
