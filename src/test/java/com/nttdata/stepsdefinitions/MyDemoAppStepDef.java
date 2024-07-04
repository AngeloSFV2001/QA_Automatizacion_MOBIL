package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import com.nttdata.steps.MyDemoAppSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MyDemoAppStepDef {

    @Steps
    MyDemoAppSteps myDemoAppSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {

    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int Unidades,String Productos) {
        myDemoAppSteps.searchByText(Productos,Unidades);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
    }
}
