package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.menuPage;

public class HistoriaCarritoCompraDefinition {

    menuPage menu;

    public HistoriaCarritoCompraDefinition() {
        menu = new pageobjects.menuPage(Hooks.driver);
    }

    @Given("validar que la web este disponible")
    public void validarQueLaWebEsteDisponible() {
        Hooks.driver.get("http://demo.guru99.com/payment-gateway/index.php");
    }

    @When("generar tarjeta valida")
    public void generarTarjetaValida() {
        menu.clickGenerarTarjeta();
     //   Assert.assertEquals(cantidad, listado.size());
    }

    @And("obtener los datos de la tarjeta")
    public void obtenerLosDatosDeLaTarjeta() {

    }
}





