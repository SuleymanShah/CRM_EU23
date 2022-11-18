package com.cydeo.step_definitions;

import com.cydeo.pages.AnnouncementPage;
import com.cydeo.pages.AppreciationPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.BrowserUtils.waitFor;

public class announcement_stepdefinitions {
    LoginPage loginPage = new LoginPage();
    AnnouncementPage announcementPage = new AnnouncementPage();


    @When("user click the More dropdown")
    public void user_click_the_more_dropdown() {
        waitFor(2);
        announcementPage.moreButton.click();
        //BrowserUtils.clickWithJS(announcementPage.moreButton);
        waitFor(2);

    }

    @Then("user click the Announcement module")
    public void user_click_the_announcement_module() {
        announcementPage.announcementButton.click();

        waitFor(2);
    }

    @When("user clicks upload the files icon")
    public void userClicksUploadTheFilesIcon() {

        announcementPage.uploadFilesIcon.click();
        waitFor(2);

    }


    @Then("user clicks Download from external drive button")
    public void userClicksDownloadFromExternalDriveButton() {

        announcementPage.downloadFromExternalDrive.click();


    }

    //@And("user upload the file")
    // public void userUploadTheFile() {
    //  BrowserUtils.waitFor(2);


    //2. Find some small file from your computer, and get the path of it.
    //String path = "/Users/aktan/Desktop/Papatya.png";


    //3. Upload the file.
    // WebElement fileUpload = announcementPage.uploadFilesAndImageModule;
    //  BrowserUtils.waitFor(2);


    //fileUpload.click();
    //BrowserUtils.sleep(2);


    //  BrowserUtils.clickWithJS(announcementPage.uploadFilesAndImageModule);


    // BrowserUtils.sleep(2);
    //announcementPage.uploadFilesAndImageModule.click();

    //announcementPage.uploadFilesAndImageModule.sendKeys("/Users/aktan/Desktop/locetors.txt");


    // WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
    //uploadButton.click();

    //4. Assert:
    //-File uploaded text is displayed on the page
    // WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
    //Assert.assertTrue(fileUploadedHeader.isDisplayed());
    //driver.get("http://practice.cybertekschool.com/upload");
    //locating  choose file button
    //WebElement chooseFile=driver.findElement(By.name("file"));

    //sending file with sendKeys method
    //chooseFile.sendKeys("/Users/ilhanaltan/Desktop/file.txt");
    // System.out.println(System.getProperty("user.dir"));

    //  String projectPath = System.getProperty("user.dir");
    //  String filePath = "src/test/resources/locetors.txt";
    //  String fullPath = projectPath + "/" + filePath;
    //  fileUpload.sendKeys(fullPath);

    ///Users/aktan/IdeaProjects/CRM_EU23/src/test/resources

    //clicking uopload button
    //driver.findElement(By.id("file-submit")).click();
    //getting the file name from browser
    //String actualFileName=driver.findElement(By.id("uploaded-files")).getText();

    //verify file name is file.txt
    // Assert.assertEquals(actualFileName,"textfile.txt");


    // }

    @Then("user click Box button")
    public void userClickBoxButton() {

        announcementPage.boxButton.click();
    }

    // @Then("user verify uploaded file")
    // public void userVerifyUploadedFile() {
    //  }

    @Then("user verify notification on the screen")
    public void userVerifyNotificationOnTheScreen() {
        String expectedResult = "The social networking service Google Docs is not configured. Please contact your Bitrix24 administrator.";

        String actualResult = announcementPage.verfyingMessageForDownload.getText();

        Assert.assertEquals(expectedResult, actualResult);

        System.out.println(announcementPage.verfyingMessageForDownload.getText());
        waitFor(2);


    }

    @And("user close the page")
    public void userCloseThePage() {
        waitFor(3);
    }

    @And("user close the boxpage")
    public void userCloseTheBoxpage() {

        waitFor(2);
        announcementPage.cross.click();
        // announcementPage.selectDocument.click();
    }


    // }


    @Then("user clicks Select document from Bitrix{int} button")
    public void userClicksSelectDocumentFromBitrixButton(int arg0) {
        announcementPage.selectDocumentFromBitrix24.click();
        waitFor(2);
    }


    @Then("user select the document")
    public void userSelectTheDocument() {
        waitFor(2);
        announcementPage.flower.click();
    }

    @And("user click select document")
    public void userClickSelectDocument() {
        announcementPage.selectDocument.click();
    }


    @And("user verify the message attached file")
    public void userVerifyTheMessageAttachedFile() {
        String expectedResul = "Papatya (2).png";
        String actualResult = announcementPage.attachedFilesAndImages.getText();

        Assert.assertEquals(expectedResul, actualResult);

        System.out.println("announcementPage.attachedFilesAndImages = " + announcementPage.attachedFilesAndImages.getText());
    }

    @When("user clicks Add more icon")
    public void userClicksAddMoreIcon() {
        // BrowserUtils.waitFor(2);
        announcementPage.addMore.click();
    }




    @Then("user choose user from the list")
    public void userChooseUserFromTheList() {
        announcementPage.helpdesk.click();
        waitFor(2);

        String expectedResul = "helpdesk9@cybertekschool.com";
        String actualResult = announcementPage.findHelpdesk.getText();
        Assert.assertEquals(expectedResul, actualResult);
        System.out.println("announcementPage.helpdesk = " + announcementPage.findHelpdesk.getText());
    }


    @Then("user close the Recent page")
    public void userCloseTheRecentPage() {
        announcementPage.closeRecentPage.click();


        waitFor(2);
        announcementPage.addMore.click();
    }

    @Then("user clicks Employees and departments button")
    public void userClicksEmployeesAndDepartmentsButton() {

        //BrowserUtils.clickWithJS(announcementPage.employeesAndDepartments);
        announcementPage.employeesAndDepartments.click();

    }

    @When("user clicks anything select button")
    public void userClicksAnythingSelectButton() {

        waitFor(2);
        announcementPage.anything.click();
    }

    @Then("user clicks All department and subdepartment employees checkbox")
    public void userClicksAllDepartmentAndSubdepartmentEmployeesCheckbox() {
        announcementPage.allDepartmentAndSubdepartmentEmployees.click();


        String expectedResul = "anything";
        String actualResult = announcementPage.findAnything.getText();
        Assert.assertEquals(expectedResul, actualResult);
        System.out.println("announcementPage.findAnyting = " + announcementPage.findAnything.getText());

    }

    @Then("user close the opened page")
    public void userCloseTheOpenedPage() {

        announcementPage.closeThePage.click();
    }

    @When("user clicks Link icon")
    public void userClicksLinkIcon() {
        waitFor(2);
        announcementPage.theLinkIcon.click();
        waitFor(2);
        // BrowserUtils.clickWithJS(announcementPage.linkIcon);
    }


    @Given("user enter the text on Link text button")
    public void userEnterTheTextOnLinkTextButton() {
        waitFor(2);
        announcementPage.UrlTextBox.sendKeys("Amazon");

    }

    @Then("user enter the link link URL button")
    public void userEnterTheLinkLinkURLButton() {

        announcementPage.UrlBox.sendKeys("https://www.amazon.co.uk/");
    }






















    @Given("user clicks  Insert video icon")
    public void userClicksInsertVideoIcon() { announcementPage.insertVideoIc.click();
    }


    @Then("user add URL on the Video source button for Vimeo")
    public void userAddURLOnTheVideoSourceButtonForVimeo() {


            waitFor(2);
            announcementPage.insertVideoText.sendKeys("https://vimeo.com/768009877");
            waitFor(2);


    }


    @Then("user clicks save  button")
    public void userClicksSaveButton() {
        waitFor(2);

        announcementPage.clickSaveBtn.click();


    }
    @When("user click SEND button")
    public void userClickSENDButton() {

        announcementPage.sendbtn.click();
    }


    ////@And("user click the video cross")
   // public void userClickTheVideoCross() {
   //
          //  waitFor(2);
           // announcementPage.videoCross.click();
           // waitFor(2);


    //}
    @Then("user verify the video")
    public void userVerifyTheVideo() {


        String expectedResul = "WWW -A Flammable Planet";
        String actualResult = announcementPage.verfyVideoFromVimeo.getText();
        Assert.assertEquals(expectedResul, actualResult);
        System.out.println("announcementPage.verfyVideoFromVimeo = " + announcementPage.verfyVideoFromVimeo.getText());


    }











    @When("user clicks comma icon")
    public void userClicksCommaIcon() {

        announcementPage.commaIcon.click();

    }

    @Then("quote area is displayed on the page")
    public void quoteAreaIsDisplayedOnThePage() {
        announcementPage.writeQuote.isDisplayed();


    }

   @Then("user add the quote on the quote button")
    public void userAddTheQuoteOnTheQuoteButton() {
        waitFor(3);
        announcementPage.writeQuote.sendKeys("Hi");


   }






    @Then("user click  Send Button")
    public void userClickSendButton() {

        announcementPage.clickSendBtn.click();



    }

    @Given("user click the add mention icon")
    public void userClickTheAddMentionIcon() {
        announcementPage.addMentionIcon.click();
    }

    @When("user click Asiya")
    public void userClickAsiya() {
        announcementPage.addAsia.click();
    }


    @When("user click wang")
    public void userClickWang() {
        announcementPage.addWang.click();
    }


    @When("user clicks on  Visual editor icon")
    public void userClicksOnVisualEditorIcon() {
        announcementPage.visualEditor.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user sees  editor text bar display on top of the message box")
    public void userSeesEditorTextBarDisplayOnTopOfTheMessageBox() {

        announcementPage.visualToolBar.isDisplayed();
    }

    @When("user clicks on Topic icon")
    public void userClicksOnTopicIcon() {
        announcementPage.topicIcon.click();

    }

    @Then("user sees announcement Topic text box displays on top of the message box.")
    public void userSeesAnnouncementTopicTextBoxDisplaysOnTopOfTheMessageBox() {
        announcementPage.topicTitle.isDisplayed();


        BrowserUtils.waitFor(3);
        String expected = announcementPage.topicTitle.getAttribute("placeholder");
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expected,"Topic");
    }

    @When("user clicks on  Record Video tab")
    public void userClicksOnRecordVideoTab() {
        announcementPage.recordVideoIcon.click();
        
    }

    @Then("user sees popup message about  access permission")
    public void userSeesPopupMessageAboutAccessPermission() {
        announcementPage.popupPermission.isDisplayed();
        //announcementPage.popupPermission.click();
    }


    @Then("user close the window")
    public void userCloseTheWindow() {
        announcementPage.closebtn.click();
    }

    /*@Then("user clicks  Allow button")
    public void userClicksAllowButton() {
        announcementPage.clickAllowBtn.click();

        BrowserUtils.waitFor(3);


        //Alert alert=new A


        //To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Driver.getDriver().switchTo().alert().dismiss();




        
    }


*/
    @Then("user can not record video")
    public void userCanNotRecordVideo() {


    }

    @Then("user gets the Error message")
    public void userGetsTheErrorMessage() {

        announcementPage.errorMsg.isDisplayed();
    }

    @Then("user click close button")
    public void userClickCloseButton() {
        announcementPage.close.click();
    }

    @When("user clicks on  # icon")
    public void userClicksOnIcon() {

        announcementPage.clicktag.click();
        
    }

    @Then("user sees the  Tags bar is displayed")
    public void userSeesTheTagsBarIsDisplayed() {

        announcementPage.displaytag.isDisplayed();
        
    }

    @Then("user writes  tag without #")
    public void userWritesTagWithout() {
        BrowserUtils.waitFor(3);
        announcementPage.displaytag.sendKeys("#WIP");
        
    }

    @Then("user clicks  Add button")
    public void userClicksAddButton() {

        announcementPage.addTag.click();
        
    }

    @Then("user sees tag are display on  Tag box")
    public void userSeesTagAreDisplayOnTagBox() {

      announcementPage.seeTag.getTagName();
    }


    @Then("user clicks  CLOSE button")
    public void userClicksCLOSEButton() {

        announcementPage.closePopup.click();
    }

    @When("user clicks the  save button")
    public void userClicksTheSaveButton() {
        announcementPage.amazonSaveBtn.click();
    }
}

