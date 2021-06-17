package com.bdd.runner;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/Ebay.feature"},

        glue = {"com.bdd"},
        tags = {"@AMAZON2"}
)
public class RunnerTest {
}
