@WIP
Feature:

  Scenario:1. User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24

    Given user "hr1" is already logged in
    When user click the More dropdown
    Then user click the Announcement module

    When user clicks upload files icon
#Given user clicks " Upload files and images" button
#And user upload the file
#Then user verify uploaded file

    Then user clicks Download from external drive button
    Then user click Box button
    Then user verify notification on the screen
    #And user close the page

    Then user clicks Select document from Bitrix24 button
    Then user select the document
    And user click select document
    And user verify the message attached file
   # And user close the page


  Scenario:2. User should be able to add users and recipients from selecting a contact from Employees and Departments
  and Recent contact lists.

    #When user click the More dropdown
    #Then user click the Announcement module


    When user clicks Add more icon
    Then user choose user from the list
    Then user close the Recent page
    Then user clicks Employees and departments button
    Then user clicks HR select button
    Then user clicks All department and subdepartment employees checkbox


  Scenario: 3. User should be able to attach link by clicking on the link icon.
    When user clicks Link icon
   Given user enter the text on Link text button
   Then user enter the link link URL button



