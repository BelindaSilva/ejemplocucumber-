package com.bdd.page;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestBCP {


@Test void localizadores() {


   //tipos de localizacion

    By locator = By.id("id de elemento");
    By locator_name = By.name("name_element");
    By locator_className = By.className("clase_element");
    By locator_tagName = By.tagName("tag");
    By locator_linktext = By.linkText("texto_link");
    By locator_partialLinkText= By.partialLinkText("ByPartialLinkText - busca texto que coincidad");
    By locator_cssSelector= By.cssSelector("input[name=q]");
    By local_Xpath= By.xpath("//input[@name=q]");









}


}





