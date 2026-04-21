package com.saddy.stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {
    /**
     * Sets up the initial sample test environment.
     */
    @Given("I have a sample setup")
    public void i_have_a_sample_setup() {
        System.out.println("Setup completed!");
    }

    /**
     * Performs the main test action.
     */
    @When("I perform an action")
    public void i_perform_an_action() {
        System.out.println("Action performed!");
    }

    /**
     * Verifies the expected result after the action.
     */
    @Then("I verify the result")
    public void i_verify_the_result() {
        System.out.println("Result verified!");
        Assert.assertEquals(7,7);
    }

    /**
     * Clicks on the specified element.<br>
     * <ul>
     *   <li><b>arg0</b> - the name or label of the element to click</li>
     * </ul>
     */
    @When("I click on {string}")
    public void iClickOn(String arg0) {
        System.out.println("I click on " + arg0);
    }

    /**
     * Executes the background step shared across scenarios.
     */
    @Given("This is just a background")
    public void thisIsJustABackground() {
        System.out.println("This is just a background");
    }

    /**
     * Selects an option from the specified dropdown.<br>
     * <ul>
     *   <li><b>data</b> - the option to select</li>
     *   <li><b>dropdown</b> - the name of the dropdown</li>
     * </ul>
     */
    @And("I select {string} from {string} dropdown")
    public void iSelectFromDropdown(String data, String dropdown) {
        System.out.println("I select " + data + " from " + dropdown + " dropdown");
    }

    /**
     * Logs out of the current session.
     */
    @And("I logout")
    public void iLogout() {
        System.out.println("I logout");
    }

    /**
     * Opens the specified file.<br>
     * <ul>
     *   <li><b>arg0</b> - the name or path of the file to open</li>
     * </ul>
     */
    @Given("I open the file {string}")
    public void iOpenTheFile(String arg0) {
        System.out.println("I open the file " + arg0);
    }
}
