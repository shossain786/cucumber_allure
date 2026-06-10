Feature: Sample Feature
  Background:
    Given This is just a background
    
  @sanity
  Scenario: Test a simple functionality
    Given I have a sample setup
    When I perform an action
    Then I verify the result
    When I click on "Group Report"
    And  I enter "orderid" in "Orderid"
    And I select "Java" from "Language" dropdown
    And I open the file "abc.txt"

  @sanity
  Scenario: Test another simple functionality
    Given I have a sample setup
    When I perform an action
    Then I verify the result
    And  I logout

  Scenario: This is a new test
    Given I click on "Login"
    When  I perform an action
    Then  I have a sample setup