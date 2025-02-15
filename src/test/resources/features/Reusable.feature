Feature: Filling shipping details with reusable steps

  Background:
    Given I am on the Shipping Form page

  Scenario: Fill shipping details for different entities
    Given I fill the details for "Shipper" with name "ABC Logistics", address "123 Street, NY", and partner "FedEx"
    Given I fill the details for "Consignee" with name "XYZ Corp", address "789 Road, LA", and partner "DHL"
    Given I fill the details for "Forwarder" with name "LMN Shipping", address "456 Blvd, SF", and partner "UPS"

    And I fill other form fields
    And I submit the form

  @Step
  Scenario: I fill the details for "<Entity>" with name "<Name>", address "<Address>", and partner "<Partner>"
    Given I enter "<Name>" in "<Entity> Name"
    Given I enter "<Address>" in "<Entity> Address"
    Given I click on "My Partners"
    Given I select "<Partner>" from "<Entity> Partner>"
