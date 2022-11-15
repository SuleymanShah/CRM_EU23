Feature: As a user, I should be able to send appreciation by clicking
  on Appreciation subheading from "More" tab under Activity Stream.

  ACs:
  1. User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bitrix24.
  2. User should be able to add users and recipients from selecting contact from Employees and Departments
  and Recent contact lists.
  3. User should be able to attach link by clicking on the link icon.
  4. User should be able to insert videos by clicking on the video icon and entering the video URL.
  5. User should be able to add mention by clicking on the Add mention icon and select contacts from
  the lists provided in dropdown.
  6. User should be able to click on Visual Editor and see the editor text-bar displays on top of the
  message box.
  7. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on
  top of the message box.
  8. User should be able to click on "Record Video" tab to record a video and attach it with the message.
  9. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
  10. User should be able to see all types of appreciation illustration/emojis by clicking on the existing
  illustration/emojis.


  Background: User is login the application and reach on the main page
    Given user "hr3" is on the main page
    Then user clicks More dropdown button
    Then user clicks Appreciation button

@bug
  Scenario: User should be able to click on upload files icon to upload files and pictures
  from local disks, download from external drive, and select documents from bitrix24.
    Then user clicks the upload files icon
    Then user clicks upload files and images option
    Then user uploads file and image from local disk
    Then user clicks Select document from Bitrix24
    Then user clicks Sales and marketing option
    Then user clicks "Java_Interview_Questions_ALL.docx" option
    Then user clicks download from external drive option
    Then user clicks GoogleDrive on the list
    Then user should be able to have a permission message for the download from external driver


@AGLP-1681
  Scenario:  User should be able to add users and recipients from selecting contact
  from Employees and Departments and Recent contact lists.
  (All Employee is shown as default, it was already declared as a bug in last Sprint)
  (E-mail user option doesn't work, it brings us empty page, there is a bug)
  (When user clicks second time on the name of employee, the name is deleted automatically, there is a bug)

    When user clicks on the Add more
    Then user clicks the Employees and departments option
    Then user chooses the employee hr1 and clicks on it
    Then user clicks the Recent option
    Then user chooses the all employee and clicks on it

@AGLP-1680
  Scenario: User should be able to attach link by clicking on the link icon.
    When user clicks on the link icon
    Then user provides link URL into linkURL box
    Then user writes the link text into link text box
    Then user clicks the save button

@AGLP-1671
  Scenario: User should be able to insert videos by clicking on the video icon and entering the video URL.
    (Vimeo is working but YouTube doesn't work, there is a bug here)
    When user clicks on the Insert video icon
    Then user provides video URL from Vimeo or YouTube to the video source box
    Then user clicks the save button

@bug
  Scenario: User should be able to add mention by clicking on the Add mention icon
  and select contacts from the lists provided in dropdown.
  (There is no mention icon seen on the page and also user can chooses same person several times,
  there are several bugs, so no need to make automation)

    When user clicks on the add mention icon
    Then user clicks the Employees and departments option
    Then user chooses the employee hr1 and clicks on it


@AGLP-1679
  Scenario: User should be able to click on Visual Editor and see the editor text-bar displays
  on top of the message box.
    When user clicks on the Visual editor icon
    Then user sees the editor text bar display on top of the message box

@AGLP-1678
  Scenario: User should be able to click on the Topic icon to see the Appreciation Topic text box
  displays on top of the message box.
    When user clicks on the Topic icon
    Then user sees appreciation Topic text box displays on top of the message box.


@bug
  Scenario: User should be able to click on "Record Video" tab to record a video and attach it
  with the message. (There is no access to the microphone and camera, there is a bug,
  so no need to make automation)
  When user clicks on the Record Video tab
  Then user sees popup message about the access permission
  Then user clicks on Allow button
  Then user gets Error message


@AGLP-1675
  Scenario: User should be able to add tags by selecting existing tags or creating new tags
  by clicking on the # icon. (positive scenario with #)

    When user clicks on the # icon
    Then user sees Tags bar is displayed
    Then user writes the #tag
    Then user clicks the Add button
    Then user sees tag are display on the Tag box


  @AGLP-1676
  Scenario: User should be able to add tags by selecting existing tags or creating new tags
  by clicking on the # icon. (Negative test, user can tag without # icon, there is a bug.
  Bug ticket for negative tests in Jira.)

    When user clicks on the # icon
    Then user sees Tags bar is displayed
    Then user writes the tag without #
    Then user clicks the Add button
    Then user sees tag are display on the Tag box


  @AGLP-1674
  Scenario: User should be able to see all types of appreciation illustration/emojis by clicking
  on the existing illustration/emojis.
    When user clicks on the illustration emojis
    Then user sees the all types of appreciation illustration emojis



