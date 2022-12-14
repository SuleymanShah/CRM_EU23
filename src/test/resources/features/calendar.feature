@AGLP-1700

Feature:CRM application calendar feature
  Agile story: As a user, I should be able to navigate "Calendar" page,
  so that user can filter and search, display,
  add and track the tasks or events either on "Calendar" page.

  Accounts are: HR, Helpdesk, Marketing

  @AGLP-1689
  Scenario: HR User can add new important repeating event
  with description by specifying the start-end dates in the specific time zones,
  adding certain location, adding attendees, color as "Pink" and availability as "Occupied"
    Given "hr1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user clicks blue -Add- button on the right side of the page
    When user clicks the -This event is important- checkbox
    When user sets the event start date and time
    When user sets event end date
    When user sets the -Time zone- as "(UTC) Europe/London"
    When user sets -Repeat- as "Yearly"
    When user sets -Location- as Main Meeting Room
    When user adds -marketing3@cybertekschool.com- and -helpdesk3@cybertekschool.com- as attendees
    When user clicks -More- button,at the bottom of the -New Event- page
    When user enters description such as "MY_FIRST_DESCRIPTION_OF_BIRTHDAY"
    When user sets task color as Pink
    When user sets -Availability- as "Occupied"
    Then user clicks -Save- button and set the event on Calendar

  @AGLP-1690
  Scenario: HR User can edit the 1st AC's task color as "Navy Blue" by using "other color"
    Given "hr1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user goes to 25 August on Calendar and clicks New Event
    When user clicks -Edit- button
    When user clicks -More- button,at the bottom of the -New Event- page
    When user clicks -other color-
    Then user edits task color as Navy Blue

  @AGLP-1691
  Scenario: HR User can edit the 1st AC's privacy as "Private event"
    Given "hr1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user goes to 25 August on Calendar and clicks New Event
    When user clicks -Edit- button
    When user clicks -More- button,at the bottom of the -New Event- page
    When user clicks -Private Event- checkbox
    Then user clicks -Save- button and edit the event as private

  @AGLP-1692
  Scenario: Marketing user can not display the 3rd AC's private event on his/her calendar
    Given "marketing2" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user goes to 25 August on Calendar
    Then user should not see the private event

  @AGLP-1693
  Scenario: HR User can edit his/her availability from "Occupied" to "Unsure"
    Given "hr1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user goes to 25 August on Calendar and clicks New Event
    When user clicks -Edit- button
    When user clicks -More- button,at the bottom of the -New Event- page
    When user changes their availability from Occupied to "Unsure"
    Then user clicks the -Save- button and edit the event as availability is Unsure

  @AGLP-1694
  Scenario: HR User can edit Repeat section as "Daily"
    Given "hr1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user goes to 25 August on Calendar and clicks New Event
    When user clicks -Edit- button
    When user sets -Repeat- as "Daily"
    Then user clicks the -Save- button and edit the event repeats daily

  @AGLP-1695
  Scenario: HR User can delete attendee by editing the event
    Given "hr1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user goes to 25 August on Calendar and clicks New Event
    When user clicks -Edit- button
    When user deletes attendees
    Then user clicks the -Save- button and edit the event

  @AGLP-1696
  Scenario: HR User can add one more attendee by editing the event
    Given "hr1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user goes to 25 August on Calendar and clicks New Event
    When user clicks -Edit- button
    When user adds -hr11@cybertekschool.com- as attendee
    Then user clicks the -Save- button and can edit the event with one more attendee

  @AGLP-1697
  Scenario: Marketing User can display the invitations by using "Filter and search" box after clicking "Invitations" button
    Given "marketing1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user clicks -Filter and search- box
    When user clicks -Invitations- button
    Then user should display the invitations

  @AGLP-1698
  Scenario: HR User can filter events and/or tasks by using "Filter and search" box after clicking "I'M AN ORGANISER" button
    Given "marketing1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user clicks -Filter and search- box
    When user clicks -I'M AN ORGANISER- button
    Then user should see these events and task

  @AGLP-1699
  Scenario: Helpdesk User can reset after selecting "Yes" under "Event with participants" menu
    Given "helpdesk1" user is on the home page
    When user clicks -Calendar- button on the left side of the page
    When user clicks -Filter and search- box
    When user clicks -Event with participants- menu
    When user click -reset- button
    Then user can reset search preferences
