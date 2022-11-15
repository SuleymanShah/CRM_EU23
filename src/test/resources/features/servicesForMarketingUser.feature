@AGLP-1624 @smoke
Feature: Services Functionality
  Agile story: As a Marketing user, I should be able to use "Services" functionality
  so that I can take advantage of company's services.

  Background: user is on the login page
    Given user "marketing1" is already logged in
@AGLP-1662
  Scenario: Marketing User can suggest new idea by clicking "New idea"
  under Ideas page of Services module.
    When user clicks the services module
    When user clicks the ideas module
    When user clicks new ideas button
    When user enters title as "MY_TEST_IDEA"
    When user enters description as "MY_TEST_DESCRIPTION_OF_IDEA"
    When user selects "Holidays" from Category dropdown
    Then user creates new idea by clicking suggest new idea button
@AGLP-1663
  Scenario: Marketing User is able to dislike the idea.
    When user clicks the services module
    When user clicks the ideas module
    When user clicks new ideas button
    When user enters title as "MY_TEST_IDEA"
    When user enters description as "MY_TEST_DESCRIPTION_OF_IDEA"
    When user selects "Holidays" from Category dropdown
    When user creates new idea by clicking suggest new idea button
    Then user dislikes the idea
    #In this Scenario, a new idea is created
@AGLP-1664
  Scenario: Marketing User is able to like the idea.
    When user clicks the services module
    When user clicks the ideas module
    Then user likes the last idea that was already created
@AGLP-1665
  Scenario: Marketing User is able to sort the ideas by date added.
    When user clicks the services module
    When user clicks the ideas module
    Then user sorts the ideas by clicking date added button
@AGLP-1666
  Scenario: Marketing User can sort the ideas by rating.
    When user clicks the services module
    When user clicks the ideas module
    Then user sorts the ideas by clicking rating button


