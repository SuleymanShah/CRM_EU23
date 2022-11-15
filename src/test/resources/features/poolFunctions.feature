@AGLP-1627


Feature: Testing different functionalities of POLL feature in CRM app
  ACs:
  1. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
  2. User should be able to attach link by clicking on the link icon.
  3. User should be able to add mention by clicking on the add mention icon.
  4. User should be able to add questions and multiple answers.
  5. User should be able to delete questions and multiple answers.
  6. User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
  7. User should be able to send a poll.

  Background: User is already logged in the app and clicked the 'Pool' button on the Activity Stream page
    Given user "hr2" is already logged in



  Background: User is already logged in the app and clicked the 'Poll' button on the Activity Stream page
    Given user "marketing2" is already logged in
    When user clicks Poll button

  @Sce1
  Scenario: User should be able to add multiple users from Employees and Departments contact lists.
    Then user clicks Add More button
    Then clicks on Employees and departments button
    Then clicks on HR department

    Then clicks on All department and sub department employees check box
    And user sees added HR employees in the To box

  @Sce2
  Scenario: User should be able to attach link by clicking on the link icon
    Then user clicks link button
    Then user sees a popup message containing link and link-name boxes
    Then user inserts link_name "Ahmet Ozhan" and link_URL "https://www.youtube.com/watch?v=3yBVmnPZwSU"
    And user sees link formed in messaging area

  @Sce3
  Scenario: User should be able to add mention by clicking on the add mention icon
    Then user clicks add mention icon
    Then user sees a popup box message containing a link to Employees and departments
    Then user clicks on it
    Then user sees a list of employees and clicks on one of the employees email address
    And user sees email address is inserted in messaging area

  @Sce4
  Scenario: User should be able to add questions and multiple answers
    Then user inserts a question "What is the distance between the Earth and the Sun?"
    Then user adds an answer into AnswerOne box "140 Million km"
    Then user adds an answer into AnswerTwo box "150 M km"
    And user adds an answer into AnswerThree box "170 M km"

    When user goes back to question text box and deletes the question
    Then user deletes all answers
    And user sees empty question box

    Then user inserts a question "What is your favorite colour?"
    Then user adds an answer into AnswerOne box "Red"
    Then user adds an answer into AnswerTwo box "Blue"
    And user adds an answer into AnswerThree box "Magenta"

    When user checks multiple choice checkbox
    And user see checkbox checked

    Then user enters a message into message area
    And user clicks Send button


