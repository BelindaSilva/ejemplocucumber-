package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.ebay.com/")
public class EbayPage extends PageObject {

    @FindBy(xpath = "//input[@id='gh-ac']") //definiendo el xpath
    private WebElementFacade txtBusqueda; //asignando a la variable txtBusqueda el valor del xpath

    @FindBy(xpath = "//input[@id='gh-btn']") //definiendo el xpath
    private WebElementFacade btnBusqueda; //asignando a la variable btnBusqueda el valor del xpath

    @FindBy(xpath = "//* [ contains(@aria-label, 'Nike')]") //definiendo el xpath
    private WebElementFacade chkMarca; //asignando a la variable chkMarca el valor del xpath


    public void escribirProductoEbay(String producto) {

        txtBusqueda.sendKeys(producto);
    }

    public void clickBusqueda() {
    btnBusqueda.click();

    }

    public void cickMarca() {
        chkMarca.click();
    }
}
