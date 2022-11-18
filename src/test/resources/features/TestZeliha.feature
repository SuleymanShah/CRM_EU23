@WIP
Feature:As a user, I should be able to send announcement from Announcement subheading from "More" under Activity Stream.
  1. User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24.
  2. User should be able to add users and recipients from selecting a contact from Employees and Departments and
  Recent contact lists.
  3. User should be able to attach link by clicking on the link icon.
  4. User should be able to insert videos by clicking on the video icon and entering the video URL.// bug, youtube icin bug ticket ac, ama vimeo ile calisiyor
  5. User should be able to create a quote by clicking on the Comma icon.
  6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided
  in dropdown.// bug yapma
  7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  8. User should be able to click on the Topic icon to see the announcement Topic text box displays on top of
  the message box.
  9. User should be able to click on "Record Video" tab to record a video and attach it with the message.// bug yapma
  10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.



  Scenario:1. User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24

    Given user "hr1" is already logged in
    When user click the More dropdown
    Then user click the Announcement module

    When user clicks upload the files icon
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
   And user close the boxpage


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
    And user close the open page


  Scenario: 3. User should be able to attach link by clicking on the link icon.
    When user clicks Link icon
   Given user enter the text on Link text button
   Then user enter the link link URL button
    Then user clicks the  save button

    Scenario: Scenario: 4. User should be able to insert videos by clicking on the video icon and entering the video URL.// bug, youtube icin bug ticket ac, ama vimeo ile calisiyor

      When user clicks Insert video icon
      Then user add the URL on the Video source button for YouTube
      Then user click save button
      Then user clicks Insert the video icon
      Then user add URL on the Video source button for Vimeo
      Then user clicks save  button




