@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Check LandingPage is open
    And Toggle Search Manifest is open
    And I Select SCAC Manifest
    And Enter Manifest Number
    And I Select Trip Status
    And I Select Filing Status
    Then Enter Port of Arrival
    And I click on Manifested button
    And I Enter First Name
    And I Enter Last Name
    And I Enter Fast Number
    And i enter Vehicle Number
    And I Enter From Date
    And I Enter To Date
    And I Click Manifested
    Then I click Search Manifests

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
