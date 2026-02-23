package com.saddy.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.saddy",
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "json:target/cucumber-report.json"
        },
        tags = "",
        dryRun = false,
        monochrome = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
        static {
                System.setProperty("allure.results.directory", "target/allure-results");
        }
}
