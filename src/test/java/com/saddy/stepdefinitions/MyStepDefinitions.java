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

    @When("I click on {string}")
    public void iClickOn(String arg0) {
        System.out.println("I click on " + arg0);
    }

    @Given("This is just a background")
    public void thisIsJustABackground() {
        System.out.println("This is just a background");
    }

    @And("I select {string} from {string} dropdown")
    public void iSelectFromDropdown(String data, String dropdown) {
        System.out.println("I select " + data + " from " + dropdown + " dropdown");
    }
}
