Feature: Filling shipping details with reusable steps

  Scenario: Fill out shipping details
    * I enter "ABC Logistics" in "Shipper Name"
    * I enter "123 Street, NY" in "Shipper Address"
    * I click on "My Partners"
    * I select "FedEx" from "Shipper Partner"

    * I enter "XYZ Corp" in "Consignee Name"
    * I enter "789 Road, LA" in "Consignee Address"
    * I click on "My Partners"
    * I select "DHL" from "Consignee Partner"

    * I enter "LMN Shipping" in "Forwarder Name"
    * I enter "456 Blvd, SF" in "Forwarder Address"
    * I click on "My Partners"
    * I select "UPS" from "Forwarder Partner"

    * I fill other form fields
    * I submit the form