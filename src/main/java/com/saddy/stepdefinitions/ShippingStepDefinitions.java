package com.saddy.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class ShippingStepDefinitions {

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

    @Given("I perform click on {string}")
    public void iClickOn(String button) {
        System.out.println("Clicking on: " + button);
        // Selenium logic to click the button
    }

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

    @Given("I fill other form fields")
    public void iFillOtherFormFields() {
        System.out.println("Filling other form fields...");
        // Additional logic
    }

    @Given("I submit the form")
    public void iSubmitTheForm() {
        System.out.println("Submitting the form...");
        // Additional logic
    }

    @And("I select {string} from {string}")
    public void iSelectFromDropdown(String value, String dropdownName) {
        System.out.println("Selecting '" + value + "' from dropdown '" + dropdownName + "'");
        // Implement Selenium code here to select from a dropdown
    }
    @When("I enter {string} in {string}")
    public void enterField(String value, String fieldName) {
        System.out.println("Entering " + value + " onto " + fieldName);
        // Selenium code to enter text
    }

    // Step to handle parameterized details entry (prints parameters)
    @When("I enter details for {string} with name {string} address {string} and partner {string}")
    public void enterDetailsForEntity(String entity, String name, String address, String partner) {
        System.out.println("[DEBUG] Entering details for Entity: " + entity);
        System.out.println("[DEBUG] Name: " + name + ", Address: " + address + ", Partner: " + partner);
    }
}