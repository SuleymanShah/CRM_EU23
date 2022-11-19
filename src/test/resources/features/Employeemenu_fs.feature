@AGLP-1721
Feature: As a user, I should be able to use functions on Employee page

  Background: For the scenarios in the feature file, user is expected already logged in and landed on the home page
  Given : user is already logged in

@AGLP-1715
  Scenario:
    When user clicks Employee button
    When user should be able to display Employee page
    When user clicks Company Structure
    Then User should be able to display Company Structure
@AGLP-1718
  Scenario:
    When user clicks Employee button
    When user should be able to display Employee page
    When user clicks Add Department
    Then User should be able to Add a department
@AGLP-1719
  Scenario:
    When user clicks Employee button
    When user should be able to display Employee page
    When user clicks Find Employee
    When User should be able to find Employees
    When user clicks More button
    Then User should be able to export the Employee list

  @AGLP-1720
    Scenario:
    When user clicks Employee button
    When user should be able to display Employee page
    When user clicks Telephone Directory
    When User should be able to display Telephone Directory
    When user clicks an email
    Then User should be able to send a message to an employee from the telephone directory
