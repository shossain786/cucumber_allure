# reusable.feature
Feature: Reusable Steps

  @Reusable
  Scenario: Template for entering entity details
    When I enter details for "<Entity>" with name "<Name>" address "<Address>" and partner "<Partner>"
      step 'I enter "<Name>" in "<Entity> name"'
      step 'I enter "<Address>" in "<Entity> Address"'
      step 'I click on "My Partners"'
      step 'I select "<Partner>"'