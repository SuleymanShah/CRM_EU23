

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



  Zuleyhanin desdcriptionlari

  AC1 : user should be able to have a permission  for the download from external driver

  AC4 : for youtube bug ticket ac url"" should be selected and youtube doesnt work

  AC6 and AC9: report as a bug ticket cucumber select but make as manuel with gherkim language

  AC10 : positive scenario (#) and negative (@ or without) intellij pass, but in Jira bug ticket for negative . user cannot tag without # icon,


 # Background: User is already logged in the app and clicked the 'More' button on the Activity Stream page
  #User  clicked the "Announcement" under the "More"dropdown
   # Given user "hr1" is already logged in


  #Scenario:1. User should be able to click on upload files icon to upload files and pictures from local disks,
  #download from external drive, select documents from bixtrix24
   # When user click the More dropdown
    #Then user click the Announcement module

   # When user clicks upload files icon
   #Given user clicks " Upload files and images" button
    #And user upload the file
   # Then user verify uploaded file


   # Then user clicks "Download from external drive" button
   # Then user sees notification on the screen
   # Then user clicks "Select document from Bitrix24" button
   # Then user choose a "document" from the select document section


  #Scenario:2. User should be able to add users and recipients from selecting a contact from Employees and Departments
 # and Recent contact lists.

   # When user click the More dropdown
    #Then user click the Announcement module


    #When user clicks "Add more" icon
    #Then user clicks "Recent" button
    #Then user choose "user" from the list
    #Then user clicks "Employees and departments" button
    #Then user choose a "Employees and department" from the list, bunu degistirdim




  Scenario: 3. User should be able to attach link by clicking on the link icon.
   # When user clicks "Link" icon
    #Then user paste the text on "Link text" button
   # Then user paste "link URL" button
   # Then user clicks  the save button






  Scenario: 4. User should be able to insert videos by clicking on the video icon and entering the video URL.// bug, youtube icin bug ticket ac, ama vimeo ile calisiyor

    When user clicks "Inser video" icon
    Then user add the "URL" on the Video source button for YouTube
    Then user click "save"button
    Then user add "URL" on the Video source button for Vimeo

  Scenario: 5. User should be able to create a quote by clicking on the Comma icon.

    When user clicks "comma" icon
    Then user add the "quote" on the quote button
    Then user click send button

  Scenario: ???? 6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided
  in dropdown.// bug yapma

    When user clicks "Add mention" icon


  Scenario: 7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    When user clicks "Visual Editor" icon
    Then user sees text-bar on top of the message box


  Scenario: 8. User should be able to click on the Topic icon to see the announcement Topic text box displays on top of
  the message box.

    When user clicks "Topic" icon
    Then user sees Topic text box on top of the message box

  Scenario: ???? 9. User should be able to click on "Record Video" tab to record a video and attach it with the message.// bug yapma


    Scenario: 10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.

      When user clicks "Add tag" icon
      Then user able to create tags
