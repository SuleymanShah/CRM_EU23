Feature: As a user, I should be able to send announcement from Announcement subheading from "More" under Activity Stream.
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



  description

  AC1 : user should be able to have a permission  for the download from external driver

  AC4 : for youtube bug ticket ac url"" should be selected and youtube doesnt work

  AC6 and AC9: report as a bug ticket cucumber select but make as manuel with gherkim language

  AC10 : positive scenario (#) and negative (@ or without) intellij pass, but in Jira bug ticket for negative . user cannot tag without # icon,


 # Background: User is already logged in the app and clicked the 'More' button on the Activity Stream page
  #User  clicked the "Announcement" under the "More"dropdown
   # Given user "hr1" is already logged in


  Scenario:1. User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24

    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When user clicks upload the files icon
    When user clicks Download from external drive button
    When user click Box button
    When user verify notification on the screen
    When user click select document
    When user clicks Select document from Bitrix24 button
    When user select the document
    When user click select document
    When user verify the message attached file
    #Then user close the boxpage


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
    Then user close the open page


  Scenario: 3. User should be able to attach link by clicking on the link icon.
    When user clicks Link icon
    Given user enter the text on Link text button
    Then user enter the link link URL button
    Then user clicks the  save button

  Scenario: 4. User should be able to insert videos by clicking on the video icon and entering the video URL.// bug, youtube icin bug ticket ac, ama vimeo ile calisiyor

    When user clicks Insert video icon
    Then user add URL on the Video source button for Vimeo
    Then user clicks save  button



  Scenario: 5. User should be able to create a quote by clicking on the Comma icon.

    When user clicks comma icon
    #Then quote area is displayed on the page
    #Then user add the quote on the quote button
    #Then user click  Send Button
    #Then user verify the quote

  Scenario:6.  User should be able to add mention by clicking on the Add mention icon
  and select contacts from the lists provided in dropdown.
  (There is no mention icon seen on the page and also user can chooses same person several times,
  there are several bugs, so no need to make automation)


  Scenario:  7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.

    When user clicks on  Visual editor icon
    Then user sees  editor text bar display on top of the message box

  Scenario: 8. User should be able to click on the Topic icon to see the announcement Topic text box displays on top of
  the message box.

    When user clicks on Topic icon
    Then user sees announcement Topic text box displays on top of the message box.

  Scenario: 9.  User should be able to click on "Record Video" tab to record a video and attach it
  with the message. (There is no access to the microphone and camera, there is a bug,
  so no need to make automation)
    When user clicks on  Record Video tab
    Then user sees popup message about  access permission
    Then user can not record video

  Scenario: 10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.

    When user clicks on  # icon
    Then user sees the  Tags bar is displayed
    Then user writes  tag without #
    Then user clicks  Add button
    Then user sees tag are display on  Tag box