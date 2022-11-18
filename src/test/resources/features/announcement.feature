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

  #Background: User is login the application and reach on the main page
    #Given user "hr1" is already logged in
    #When user click the More dropdown
    #Then user click the Announcement module

  @AGLP-1723
  Scenario:1. User should be able to click on upload files icon to download from external drive, select documents from bixtrix24.
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
    Then user verify the message attached file

  @AGLP-1725
  Scenario:2. User should be able to add users and recipients from selecting a contact from Employees and Departments
  and Recent contact lists.
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    Given user clicks Add more icon
    When user choose user from the list
    When user close the Recent page
    When user clicks Employees and departments button
    When user clicks anything select button
    When user clicks All department and subdepartment employees checkbox
    Then user close the opened page

  @AGLP-1727
  Scenario: 3. User should be able to attach link by clicking on the link icon.
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When user clicks Link icon
    When user enter the text on Link text button
    When user enter the link link URL button
    When user clicks the  save button

  @AGLP-1728
  Scenario: 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
  (User able to add videos from Vimeo but not able to add videos from YouTube.)
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When user clicks  Insert video icon
    When user add URL on the Video source button for Vimeo
    Then user clicks save  button

  @AGLP-1729
  Scenario: 5. User should be able to create a quote by clicking on the Comma icon.
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When user clicks comma icon
    When quote area is displayed on the page
    Then user add the quote on the quote button

  @AGLP-1730
  Scenario:6.  User should be able to add mention by clicking on the Add mention icon
  and select contacts from the lists provided in dropdown.
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When   user click the add mention icon
    When user click Asiya
    When user click the add mention icon
    Then user click wang

  @AGLP-1731
  Scenario:  7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When user clicks on  Visual editor icon
    Then user sees  editor text bar display on top of the message box

  @AGLP-1732
  Scenario: 8. User should be able to click on the Topic icon to see the announcement Topic text box displays on top of
  the message box.
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When user clicks on Topic icon
    Then user sees announcement Topic text box displays on top of the message box.

  @AGLP-1733
  Scenario: 9.  User should be able to click on "Record Video" tab to record a video and attach it
  with the message. (There is no access to the microphone and camera, there is a bug,
  so no need to make automation)
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When user clicks on  Record Video tab
    When user sees popup message about  access permission
    When user clicks  CLOSE button
    Then user can not record video

  @AGLP-1734
  Scenario: 10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
    Given user "hr1" is already logged in
    When user click the More dropdown
    When user click the Announcement module
    When user clicks on  # icon
    When user sees the  Tags bar is displayed
    When user writes  tag without #
    When user clicks  Add button
    Then user sees tag are display on  Tag box







