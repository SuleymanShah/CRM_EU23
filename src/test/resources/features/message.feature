
Feature:
  User story:
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Accounts are: HR, Marketing, Helpdesk

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario Outline: login with valid credentials
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should launch to the home page

    Examples:
      | username                      | password |
      | hr8@cybertekschool.com        | UserUser |
      | marketing8@cybertekschool.com | UserUser |
      | helpdesk9@cybertekschool.com  | UserUser |

  Scenario Outline: 1.User should be able to click on upload files icon to upload files and pictures from local disks.
    When user clicks the message option
    Then user clicks on the upload files icon
    Then user clicks upload files and images option
    Then user selects an image
    And user clicks send button

    Examples:
      | username                      | password |
      | hr8@cybertekschool.com        | UserUser |
      | marketing8@cybertekschool.com | UserUser |
      | helpdesk9@cybertekschool.com  | UserUser |

  Scenario Outline: 2.User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
    When user clicks the message option
    Then user user clicks add more option
    Then user clicks Employees and Departments
    Then user selects multiple employees
    And user clicks send button

    Examples:
      | username                      | password |
      | hr8@cybertekschool.com        | UserUser |
      | marketing8@cybertekschool.com | UserUser |
      | helpdesk9@cybertekschool.com  | UserUser |

    Scenario Outline: 3.User should be able to attach link by clicking on the link icon.
      When user clicks message option
      Then user clicks clicks link icon
      Then user should attach link url and link text
      Then user clicks save option
      And user clicks send button

      Examples:
        | username                      | password |
        | hr8@cybertekschool.com        | UserUser |
        | marketing8@cybertekschool.com | UserUser |
        | helpdesk9@cybertekschool.com  | UserUser |


      Scenario Outline: 4.User should be able to insert videos by clicking on the video icon and entering the video URL.
        When user clicks message option
        Then user clicks insert video icon
        Then user should attach video url
        Then user clicks save button
        And user clicks send button

        Examples:
          | username                      | password |
          | hr8@cybertekschool.com        | UserUser |
          | marketing8@cybertekschool.com | UserUser |
          | helpdesk9@cybertekschool.com  | UserUser |

        Scenario Outline: 5. User should be able to create a quote by clicking on the Comma icon.
          When user clicks message option
          Then user user clicks on the comma icon
          Then user writes a message
          And user clicks send button

          Examples:
            | username                      | password |
            | hr8@cybertekschool.com        | UserUser |
            | marketing8@cybertekschool.com | UserUser |
            | helpdesk9@cybertekschool.com  | UserUser |

          Scenario Outline: 6. User should be able to add mention by clicking on the Add mention icon.
            When user clicks message option
            Then user clicks add mention icon
            Then user selects an employee
            Then user clicks send button

            Examples:
              | username                      | password |
              | hr8@cybertekschool.com        | UserUser |
              | marketing8@cybertekschool.com | UserUser |
              | helpdesk9@cybertekschool.com  | UserUser |

            Scenario Outline: 7. User should be able to send a message.
              When user clicks message option
              Then user writes a message
              And user clicks send button

              Examples:
                | username                      | password |
                | hr8@cybertekschool.com        | UserUser |
                | marketing8@cybertekschool.com | UserUser |
                | helpdesk9@cybertekschool.com  | UserUser |








