package com.cydeo.step_definitions;

import com.cydeo.pages.AppreciationPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Appreciation_StepDefinition {

    LoginPage loginPage = new LoginPage();

    AppreciationPage appreciationPage = new AppreciationPage();

    @Given("user {string} is on the main page")
    public void userIsOnTheMainPage(String userShortName){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.loginWithValid("hr1");
    }



    @Then("user clicks More dropdown button")
    public void user_clicks_more_dropdown_button() {
        BrowserUtils.waitFor(3);
        appreciationPage.moreButton.click();

    }

    @Then("user clicks Appreciation button")
    public void user_clicks_appreciation_button() {
        BrowserUtils.waitFor(3);
        appreciationPage.appreciationOption.click();
       // BrowserUtils.waitFor(3);
       // Assert.assertEquals(appreciationPage.appreciationOption.getText(),"Appreciation");

    }


    @Then("user clicks upload files icon")
    public void user_clicks_upload_files_icon() {
        BrowserUtils.waitFor(3);
        appreciationPage.uploadButton.click();
    }

    @Then("user clicks upload files and images option")
    public void user_clicks_upload_files_and_images_option() {
        appreciationPage.uploadFilesAndImages.click();
    }

    @Then("user uploads file and image from local disk")
    public void user_uploads_file_and_image_from_local_disk() {
        String filePath ="C:\\Users\\zuley\\Desktop\\bebek.jpg";

        appreciationPage.uploadFilesAndImages.sendKeys(filePath); // THERE IS A PROBLEM

    }

 
    @Then("user clicks Select document from Bitrix24")
    public void user_clicks_select_document_from_bitrix24() {
        BrowserUtils.waitFor(3);
        appreciationPage.selectDocumentFromBitrix24.click();
    }

    @Then("user clicks Sales and marketing option")
    public void user_clicks_sales_and_marketing_option() {
        BrowserUtils.waitFor(3);
        appreciationPage.salesAndMarketing.click();
        appreciationPage.selectedDocument.click();
        appreciationPage.selectDocumentBtn.click();
    }

    @Then("user clicks {string} option")
    public void user_clicks_option(String string) {

    }

    @Then("user clicks download from external drive option")
    public void user_clicks_download_from_external_drive_option() {
        appreciationPage.dropboxBtn.click();

    }

    @Then("user clicks GoogleDrive on the list")
    public void userClicksGoogleDriveOnTheList() {
        appreciationPage.googleDriveBtn.click();
    }


    @Then("user should be able to have a permission message for the download from external driver")
    public void user_should_be_able_to_have_a_permission_message_for_the_download_from_external_driver() {

    }


    @When("user clicks on the Visual editor icon")
    public void userClicksOnTheVisualEditorIcon() {
        appreciationPage.visualEditor.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user sees the editor text bar display on top of the message box")
    public void userSeesTheEditorTextBarDisplayOnTopOfTheMessageBox() {
        appreciationPage.visualToolBar.isDisplayed();
    }

    @When("user clicks on the illustration emojis")
    public void userClicksOnTheIllustrationEmojis() {
        appreciationPage.illustrationEmojis.click();
    }

    @Then("user sees the all types of appreciation illustration emojis")
    public void userSeesTheAllTypesOfAppreciationIllustrationEmojis() {
        String actual = appreciationPage.illustrationPopup.getText();
        Assert.assertEquals(actual,"Choose one");
        appreciationPage.illustrationPopup.isDisplayed();
    }

    @When("user clicks on the Topic icon")
    public void userClicksOnTheTopicIcon() {
        appreciationPage.topicIcon.click();
    }

    @Then("user sees appreciation Topic text box displays on top of the message box.")
    public void userSeesAppreciationTopicTextBoxDisplaysOnTopOfTheMessageBox() {
        appreciationPage.topicTitle.isDisplayed();
        BrowserUtils.waitFor(3);
        String expected = appreciationPage.topicTitle.getAttribute("placeholder");
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expected,"Topic");
    }

    @When("user clicks on the link icon")
    public void userClicksOnTheLinkIcon() {
        appreciationPage.linkIcon.click();

    }

    @Then("user provides link URL into linkURL box")
    public void userProvidesLinkURLIntoLinkURLBox() {
        appreciationPage.linkBox.sendKeys("https://www.google.com/");

    }

    @Then("user writes the link text into link text box")
    public void userWritesTheLinkTextIntoLinkTextBox() {
        appreciationPage.linkTextBox.sendKeys("Google");
    }

    @Then("user clicks the save button")
    public void userClicksTheSaveButton() {
        appreciationPage.linkSaveBtn.click();
    }

    @When("user clicks on the Insert video icon")
    public void userClicksOnTheInsertVideoIcon() {
        appreciationPage.insertVideoIcon.click();
    }

    @Then("user provides video URL from Vimeo or YouTube to the video source box")
    public void userProvidesVideoURLFromVimeoOrYouTubeToTheVideoSourceBox() {
        appreciationPage.insertVideoText.sendKeys("https://vimeo.com/565327806");
    }

    @When("user clicks on the Record Video tab")
    public void userClicksOnTheRecordVideoTab() {
        appreciationPage.recordVideoIcon.click();
    }

    @Then("user sees popup message about the access permission")
    public void userSeesPopupMessageAboutTheAccessPermission() {
        appreciationPage.popupPermission.isDisplayed();
    }

    @Then("user clicks on Allow button")
    public void userClicksOnAllowButton() {
        appreciationPage.popupPermission.click();
    }


    @Then("user gets Error message")
    public void userGetsErrorMessage() {
        appreciationPage.errorMsg.isDisplayed();
    }

    @When("user clicks on the # icon")
    public void userClicksOnTheIcon() {
        appreciationPage.tagIcon.click();
    }

    @Then("user sees Tags bar is displayed")
    public void userSeesTagsBarIsDisplayed() {
        appreciationPage.tagBox.isDisplayed();
    }

    @Then("user writes the #tag")
    public void userWritesTheTag() {
        BrowserUtils.waitFor(3);
        appreciationPage.tagPopup.sendKeys("#tag");
    }

    @Then("user clicks the Add button")
    public void userClicksTheAddButton() {
        BrowserUtils.waitFor(3);
        appreciationPage.tagAdd.click();
    }

    @Then("user sees tag are display on the Tag box")
    public void userSeesTagAreDisplayOnTheTagBox() {
        appreciationPage.tag1.getTagName();
    }


    @Then("user writes the tag without #")
    public void userWritesTheTagWithout() {
        BrowserUtils.waitFor(3);
        appreciationPage.tagPopup.sendKeys("tag");
    }


    @When("user clicks on the Add more")
    public void userClicksOnTheAddMore() {
        appreciationPage.addMore.click();
    }

    @Then("user clicks the Employees and departments option")
    public void userClicksTheEmployeesAndDepartmentsOption() {
        BrowserUtils.waitFor(3);
        appreciationPage.employeeDepartment.click();
    }

    @Then("user chooses the employee hr1 and clicks on it")
    public void userChoosesTheEmployeeAndClicksOnIt() {
        BrowserUtils.waitFor(3);
        appreciationPage.hr1.click();
    }

    @Then("user clicks the Recent option")
    public void userClicksTheRecentOption() {
        BrowserUtils.waitFor(3);
        appreciationPage.recentOption.click();
    }

    @Then("user chooses the all employee and clicks on it")
    public void userChoosesTheAllEmployeeAndClicksOnIt() {
        BrowserUtils.waitFor(3);
        appreciationPage.allEmployee.click();
        BrowserUtils.waitFor(3);
        appreciationPage.allEmployee.isDisplayed();
    }

    @When("user clicks on the add mention icon")
    public void userClicksOnTheAddMentionIcon() {
        appreciationPage.addMentionIcon.click();
    }
}
