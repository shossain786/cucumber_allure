Feature: This feature is to test reusable steps from a different feature


  Scenario: Test entities with multiple parameters
    When I enter details for "Shipper" with name "ABC Corp" address "123 Main St" and partner "Global Partners"
    When I enter details for "Consignee" with name "XYZ Logistics" address "456 Elm St" and partner "Ocean Freight"
    When I enter details for "Forwarder" with name "Fast Forwarders" address "789 Oak St" and partner "Air Cargo"