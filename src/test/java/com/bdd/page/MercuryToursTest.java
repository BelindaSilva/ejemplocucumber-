package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class MercuryToursTest {


    private WebDriver webDriver;
    By RegisterLinkLocator = By.linkText("REGISTER");
    By RegistrerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");
    By UsernameLocator  = By.id("email");

    @Test
    public void registerUser() {

        webDriver.findElement(RegisterLinkLocator).click();
        Thread.sleep(2000);

              if(webDriver.findElement(RegistrerPageLocator).isDisplayed(){

    }  }




}
