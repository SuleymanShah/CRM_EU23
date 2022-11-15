package com.cydeo.step_definitions;

import com.cydeo.pages.AnnouncementPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class announcement_stepdefinitions {
    LoginPage loginPage = new LoginPage();
    AnnouncementPage announcementPage = new AnnouncementPage();


    @When("user click the More dropdown")
    public void user_click_the_more_dropdown() {
        BrowserUtils.waitFor(2);
        announcementPage.moreButton.click();
        //BrowserUtils.clickWithJS(announcementPage.moreButton);
        BrowserUtils.waitFor(2);

    }

    @Then("user click the Announcement module")
    public void user_click_the_announcement_module() {
        announcementPage.announcementButton.click();

        BrowserUtils.waitFor(2);
    }

    @When("user clicks upload files icon")
    public void userClicksUploadFilesIcon() {
        announcementPage.uploadFilesIcon.click();
        BrowserUtils.waitFor(2);

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
    // }

    @Then("user verify notification on the screen")
    public void userVerifyNotificationOnTheScreen() {
        String expectedResult = "The social networking service Google Docs is not configured. Please contact your Bitrix24 administrator.";

        String actualResult = announcementPage.verfyingMessageForDownload.getText();

        //Assert.assertEquals(expectedResult, actualResult);

        System.out.println(announcementPage.verfyingMessageForDownload.getText());
        BrowserUtils.waitFor(2);


        //@And("user close the page")
        // public void userCloseThePage() {
        //  BrowserUtils.waitFor(3);

        // announcementPage.cross.click();
        announcementPage.selectDocument.click();
    }


    // }


    @Then("user clicks Select document from Bitrix{int} button")
    public void userClicksSelectDocumentFromBitrixButton(int arg0) {
        announcementPage.selectDocumentFromBitrix24.click();
        BrowserUtils.waitFor(2);
    }


    @Then("user select the document")
    public void userSelectTheDocument() {
        announcementPage.flower.click();
    }

    @And("user click select document")
    public void userClickSelectDocument() {
        announcementPage.selectDocument.click();
    }


    @And("user verify the message attached file")
    public void userVerifyTheMessageAttachedFile() {
        String expectedResul = "flower.jpg";
        String actualResult = announcementPage.attachedFilesAndImages.getText();

        Assert.assertEquals(expectedResul, actualResult);

        System.out.println("announcementPage.attachedFilesAndImages = " + announcementPage.attachedFilesAndImages.getText());
    }

    @When("user clicks Add more icon")
    public void userClicksAddMoreIcon() {
        // BrowserUtils.waitFor(2);
        announcementPage.addMore.click();
    }

    // @Then("user clicks Recent button")
    // public void userClicksRecentButton() {
    //   BrowserUtils.waitFor(2);
    // announcementPage.recent.click();
//
    //}


    @Then("user choose user from the list")
    public void userChooseUserFromTheList() {
        announcementPage.asia.click();
        BrowserUtils.waitFor(2);

        String expectedResul = "Asiya";
        String actualResult = announcementPage.addAsiya.getText();
        Assert.assertEquals(expectedResul, actualResult);
        System.out.println("announcementPage.Asiya = " + announcementPage.addAsiya.getText());
    }


    @Then("user close the Recent page")
    public void userCloseTheRecentPage() {
        announcementPage.closeRecentPage.click();


        BrowserUtils.waitFor(2);
        announcementPage.addMore.click();
    }

    @Then("user clicks Employees and departments button")
    public void userClicksEmployeesAndDepartmentsButton() {

        //BrowserUtils.clickWithJS(announcementPage.employeesAndDepartments);
        announcementPage.employeesAndDepartments.click();

    }

    @Then("user clicks HR select button")
    public void userClicksHRSelectButton() {
        announcementPage.HR.click();
    }

    @Then("user clicks All department and subdepartment employees checkbox")
    public void userClicksAllDepartmentAndSubdepartmentEmployeesCheckbox() {
        announcementPage.allDepartmentAndSubdepartmentEmployees.click();


        String expectedResul = "HR";
        String actualResult = announcementPage.addHR.getText();
        Assert.assertEquals(expectedResul, actualResult);
        System.out.println("announcementPage.HR = " + announcementPage.addHR.getText());

    }

    @When("user clicks Link icon")
    public void userClicksLinkIcon() {
        BrowserUtils.waitFor(2);
       // announcementPage.linkIcon.click();

       BrowserUtils.clickWithJS(announcementPage.linkIcon);
    }


    @Given("user enter the text on Link text button")
    public void userEnterTheTextOnLinkTextButton() {


    }

    @Then("user enter the link link URL button")
    public void userEnterTheLinkLinkURLButton() {
    }
}

