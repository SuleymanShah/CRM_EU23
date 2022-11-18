@AGLP-1624
Feature: Services Functionality
  Agile story: As a Helpdesk user, I should be able to use "Services" functionality
  so that I can take advantage of company's services.

  Background: user is on the login page
    Given user "helpdesk1" is already logged in
 @AGLP-1659
  Scenario: Helpdesk User sees "Event Calendar" is displayed after switching view from table view
  to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
    When user clicks the services module
    When user clicks Meeting Room Booking Calendar View module
    Then user sees Event Calendar is displayed
  @AGLP-1660
  Scenario: Helpdesk User is redirected to "New Event" page for booking a meeting room
  after clicking "Book meeting room".
    When user clicks the services module
    When user clicks Meeting Room Booking Calendar View module
    When user clicks Book meeting room module
    Then user is redirected to New Event page
    #Last step asserts New Event text to verify that the user is redirected to New Event Page
  @AGLP-1661
  Scenario: Helpdesk User unchecks the "East Meeting Room" under "Calendars"
  section on "Meeting Room Booking" page.
    When user clicks the services module
    When user clicks Meeting Room Booking Calendar View module
    Then user unchecks East Meeting Room