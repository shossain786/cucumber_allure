Feature: Adding multiple shipping details

  Scenario Outline: Enter Entity Details <Entity>
    Given I enter "<Entity>" details

    Examples:
      | Entity     |
      | Shipper    |
      | Consignee  |
      | Forwarder  |

  Scenario: Click and Select Partner "test"
    Given I perform click on "My Partners"
    When I select "Shipper Partner"
    Then I should see "Shipper Partner" is displayed
  

  @sanity
  Scenario: Fill out shipping details for different entities
    Given I perform the following actions:
      | Entity     | Action            | Field Name         | Value             |
      | Shipper    | Enter Text        | Shipper Name       | ABC Logistics     |
      | Shipper    | Enter Text        | Shipper Address    | 123 Street, NY    |
      | Shipper    | Click             | My Partners        |                   |
      | Shipper    | Select Dropdown   | Shipper Partner    | FedEx             |
      | Consignee  | Enter Text        | Consignee Name     | XYZ Corp          |
      | Consignee  | Enter Text        | Consignee Address  | 789 Road, LA      |
      | Consignee  | Click             | My Partners        |                   |
      | Consignee  | Select Dropdown   | Consignee Partner  | DHL               |
      | Forwarder  | Enter Text        | Forwarder Name     | LMN Shipping      |
      | Forwarder  | Enter Text        | Forwarder Address  | 456 Blvd, SF      |
      | Forwarder  | Click             | My Partners        |                   |
      | Forwarder  | Select Dropdown   | Forwarder Partner  | UPS               |

    And I fill other form fields
    And I submit the form

  Scenario: Fill out shipping details
    Given I enter "ABC Logistics" in "Shipper Name"
    When I enter "123 Street, NY" in "Shipper Address"
    And I click on "My Partners"
    And I select "FedEx" from "Shipper Partner"

    And I enter "XYZ Corp" in "Consignee Name"
    And I enter "789 Road, LA" in "Consignee Address"
    And I click on "My Partners"
    And I select "DHL" from "Consignee Partner"

    And I enter "LMN Shipping" in "Forwarder Name"
    And I enter "456 Blvd, SF" in "Forwarder Address"
    And I click on "My Partners"
    And I select "UPS" from "Forwarder Partner"

    And I fill other form fields
    And I submit the form