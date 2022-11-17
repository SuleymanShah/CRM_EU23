@Onder
Feature: As a user, I should be able to use Tasks functions on Tasks Page
  User Story:
  As a user, I should be able to display tasks "In Progress" by clicking "All Tasks" tab.
  As a user, I should be able to display tasks "Ongoing Tasks" by clicking "Ongoing Tasks" tab.

  Background: For the scenarios in the feature file, user is expected to be logged in and landed on the homepage
    Given user is already logged in


  @TasksInProgress
  Scenario: User should be able to display tasks In Progress by clicking "All Tasks" tab
    When user is already logged in
    When user clicks Tasks function button
    When user clicks All Tasks tab
    Then user sees tasks In Progress

  @OngoingTasks
  Scenario: User should be able to display Ongoing Tasks by clicking Ongoing Tasks tab
    When user clicks Ongoing Tasks tab
    Then user sees Ongoing Tasks






#this is how we add comments in feature file