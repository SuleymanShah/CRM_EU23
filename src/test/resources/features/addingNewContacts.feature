Feature: Testing different functionalities of POOL feature in CRM app

  Background: User is already logged in the app and clicked the 'Pool' button on the Activity Stream page
    Given user is already POOL area

  Scenario: User should be able to add multiple users from Employees and Departments contact lists.
    When user clicks Add More button
    Then clicks on Employees and departments button
    Then clicks on HR department
    And clicks on All department and sub department employees check box