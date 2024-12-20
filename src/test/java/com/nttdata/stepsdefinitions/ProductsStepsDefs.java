package com.nttdata.stepsdefinitions;

import com.nttdata.steps.BuySteps;
import com.nttdata.steps.ProductsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ProductsStepsDefs {

    @Steps
    ProductsSteps productsSteps;
    BuySteps buySteps;
    CartStepsDefs cartStepsDefs;
    BuyStepsDefs buyStepsDefs;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {

    }
    @Given("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        productsSteps.validatePage();

    }






}
