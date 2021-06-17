package com.bdd.stepdefinition;

import com.bdd.step.AmazonStep;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class AmazonStepDefinition {

    @Steps
    private AmazonStep amazonStep;

    @Given("^Cargar la pagina de Amazon$")
    public void cargar_la_pagina_de_Amazon(){
     amazonStep.cargarPaginaAmazonn();
    }



}
