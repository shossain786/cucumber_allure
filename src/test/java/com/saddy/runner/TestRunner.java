package com.saddy.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = "com.saddy.stepdefinitions",       // Path to step definitions
        plugin = {
                "pretty", // For readable console output
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", // Allure plugin
                "json:target/cucumber-report.json" // Optional: Generates JSON report
        },
        monochrome = true // Makes the console output more readable
)
public class TestRunner extends AbstractTestNGCucumberTests {
        static {
                System.setProperty("allure.results.directory", "target/allure-results");
        }
}
