package com.saddy.stepdefinitions;

import io.cucumber.java.en.*;

public class MyStepDefinitions {
    @Given("I have a sample setup")
    public void i_have_a_sample_setup() {
        System.out.println("Setup completed!");
    }

    @When("I perform an action")
    public void i_perform_an_action() {
        System.out.println("Action performed!");
    }

    @Then("I verify the result")
    public void i_verify_the_result() {
        System.out.println("Result verified!");
    }
}
