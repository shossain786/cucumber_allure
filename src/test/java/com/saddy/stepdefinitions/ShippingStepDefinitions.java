package com.saddy.stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ShippingStepDefinitions {

    /**
     * Enters details for the given entity type (shipper, consignee, or forwarder).<br>
     * <ul>
     *   <li><b>entity</b> - the entity type whose details should be entered</li>
     * </ul>
     */
    @Given("I enter {string} details")
    public void iEnterEntityDetails(String entity) {
        System.out.println("Entering details for: " + entity);

        // Add logic to enter details based on the entity
        switch (entity.toLowerCase()) {
            case "shipper":
                enterDetails("Shipper", "ABC Logistics", "123 Street, NY");
                break;
            case "consignee":
                enterDetails("Consignee", "XYZ Corp", "789 Road, LA");
                break;
            case "forwarder":
                enterDetails("Forwarder", "LMN Shipping", "456 Blvd, SF");
                break;
            default:
                throw new IllegalArgumentException("Invalid entity: " + entity);
        }
    }

    /**
     * Clicks on the specified button or element.<br>
     * <ul>
     *   <li><b>button</b> - the name or label of the button to click</li>
     * </ul>
     */
    @Given("I perform click on {string}")
    public void iClickOn(String button) {
        System.out.println("Clicking on: " + button);
        // Selenium logic to click the button
    }

    /**
     * Selects the specified option from a list or radio group.<br>
     * <ul>
     *   <li><b>option</b> - the option to select</li>
     * </ul>
     */
    @Given("I select {string}")
    public void iSelect(String option) {
        System.out.println("Selecting: " + option);
        // Selenium logic to select the option
    }

    private void enterDetails(String entityType, String name, String address) {
        System.out.println("Entering " + entityType + " details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        // Selenium code to enter these details in the form fields
        // Example:
        // driver.findElement(By.id("nameField")).sendKeys(name);
        // driver.findElement(By.id("addressField")).sendKeys(address);
    }

    /**
     * Performs multiple actions defined in a DataTable with columns: Entity, Action, Field Name, Value.<br>
     * <ul>
     *   <li><b>table</b> - the DataTable containing the actions to perform</li>
     * </ul>
     */
    @Given("I perform the following actions:")
    public void iPerformTheFollowingActions(DataTable table) {
        List<Map<String, String>> actions = table.asMaps(String.class, String.class);

        for (Map<String, String> action : actions) {
            String entity = action.get("Entity");
            String actionType = action.get("Action");
            String fieldName = action.get("Field Name");
            String value = action.get("Value");

            System.out.println("\nPerforming action for: " + entity);

            switch (actionType) {
                case "Enter Text":
                    enterText(fieldName, value);
                    break;
                case "Click":
                    clickButton(fieldName);
                    break;
                case "Select Dropdown":
                    selectDropdown(fieldName, value);
                    break;
                default:
                    System.out.println("Unknown action: " + actionType);
            }
        }
    }

    private void enterText(String fieldName, String value) {
        System.out.println("Entering '" + value + "' in field '" + fieldName + "'");
        // Implement Selenium logic here
    }

    private void clickButton(String buttonName) {
        System.out.println("Clicking on: " + buttonName);
        // Implement Selenium logic here
    }

    private void selectDropdown(String fieldName, String value) {
        System.out.println("Selecting '" + value + "' in dropdown '" + fieldName + "'");
        // Implement Selenium logic here
    }

    /**
     * Fills in additional form fields not covered by other steps.
     */
    @Given("I fill other form fields")
    public void iFillOtherFormFields() {
        System.out.println("Filling other form fields...");
        // Additional logic
    }

    /**
     * Submits the current form.
     */
    @Given("I submit the form")
    public void iSubmitTheForm() {
        System.out.println("Submitting the form...");
        // Additional logic
    }

    /**
     * Selects a value from the specified dropdown.<br>
     * <ul>
     *   <li><b>value</b> - the value to select</li>
     *   <li><b>dropdownName</b> - the name of the dropdown</li>
     * </ul>
     */
    @And("I select {string} from {string}")
    public void iSelectFromDropdown(String value, String dropdownName) {
        System.out.println("Selecting '" + value + "' from dropdown '" + dropdownName + "'");
        // Implement Selenium code here to select from a dropdown
    }
    /**
     * Enters a value into the specified input field.<br>
     * <ul>
     *   <li><b>value</b> - the text to enter</li>
     *   <li><b>fieldName</b> - the name of the field</li>
     * </ul>
     */
    @When("I enter {string} in {string}")
    public void enterField(String value, String fieldName) {
        System.out.println("Entering " + value + " onto " + fieldName);
        // Selenium code to enter text
    }

    // Step to handle parameterized details entry (prints parameters)
    /**
     * Enters details for an entity with the given name, address, and partner.<br>
     * <ul>
     *   <li><b>entity</b> - the entity type (e.g., Shipper, Consignee)</li>
     *   <li><b>name</b> - the entity's name</li>
     *   <li><b>address</b> - the entity's address</li>
     *   <li><b>partner</b> - the associated partner name</li>
     * </ul>
     */
    @When("I enter details for {string} with name {string} address {string} and partner {string}")
    public void enterDetailsForEntity(String entity, String name, String address, String partner) {
        System.out.println("[DEBUG] Entering details for Entity: " + entity);
        System.out.println("[DEBUG] Name: " + name + ", Address: " + address + ", Partner: " + partner);
    }

    /**
     * Navigates to the Shipping Form page.
     */
    @Given("I am on the Shipping Form page")
    public void iAmOnTheShippingFormPage() {
        System.out.println("I am on the Shipping Form page");
    }

    /**
     * Fills form details for an entity using regex-matched parameters.<br>
     * <ul>
     *   <li><b>entity</b> - the entity type</li>
     *   <li><b>name</b> - the entity's name</li>
     *   <li><b>address</b> - the entity's address</li>
     *   <li><b>partner</b> - the associated partner name</li>
     * </ul>
     */
    @Given("^I fill the details for \"([^\"]*)\" with name \"([^\"]*)\", address \"([^\"]*)\", and partner \"([^\"]*)\"$")
    public void iFillDetails(String entity, String name, String address, String partner) {
        System.out.println("Filling details for: " + entity);
        enterText(name, entity + " Name");
        enterText(address, entity + " Address");
        clickButton("My Partners");
        selectDropdown(partner, entity + " Partner");
    }
}