package com.bdd.step;


import com.bdd.page.EbayPage;
import net.thucydides.core.annotations.Step;

import net.thucydides.core.steps.ScenarioSteps;

public class EbayStep extends ScenarioSteps{

    private EbayPage ebayPage;

    @Step
    public void cargarPaginaEbay() {
        ebayPage.open();
    }


    @Step
    public void escribirProductoEbay(String producto) {
        ebayPage.escribirProductoEbay(producto);
    }

    @Step
    public void clickBisqueda() {
        ebayPage.clickBusqueda();
    }

    @Step
    public void clickMarca() {
        ebayPage.cickMarca();
    }
}
