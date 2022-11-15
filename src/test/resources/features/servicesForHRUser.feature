@AGLP-1624
Feature: Services Functionality
  Agile story: As a HR user, I should be able to use "Services" functionality
  so that I can take advantage of company's services.

  Background: user is on the login page
    Given user "hr1" is already logged in
@AGLP-1667
  Scenario: HR User can print the lists by clicking "Print" button under Lists page of Services menu.
    When user clicks the services module
    When user clicks Lists page
    Then user is able to print by clicking the print element