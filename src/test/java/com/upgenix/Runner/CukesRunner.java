package com.upgenix.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = {"pretty","html:target/default-cucumber-reports","json:target/cucumber.json"},
        features = "src/test/resources/feature",
        glue = "com/upgenix/Step_Definations",
        dryRun = true,
        tags="@login"

)
public class CukesRunner {
}
