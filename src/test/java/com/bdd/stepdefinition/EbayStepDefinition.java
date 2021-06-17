package com.bdd.stepdefinition;

import com.bdd.step.EbayStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EbayStepDefinition {

    @Steps
    private EbayStep ebayStep;


    @Given("^Cargar la pagina de Ebay$")
    public void cargar_la_pagina_de_Ebay(){
        ebayStep.cargarPaginaEbay();

    }

    @When("^Escribir marca \"([^\"]*)\"$")
    public void escribir_Producto_Ebay(String producto) {
        ebayStep.escribirProductoEbay(producto);
    }

    @And("^hacer click de busqueda$")
    public void hacer_click_de_busqueda() {
        ebayStep.clickBisqueda();
    }


    @And("Click en marca$")
    public void clickEnMarca() {
        ebayStep.clickMarca();
    }
}



