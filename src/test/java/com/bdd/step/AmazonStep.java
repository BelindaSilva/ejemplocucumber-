package com.bdd.step;

import com.bdd.page.AmazonPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class AmazonStep extends ScenarioSteps{

    private AmazonPage   amazonPage;

    @Step
    public void cargarPaginaAmazonn() {
      amazonPage.open();
    }
}
