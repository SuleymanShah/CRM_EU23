package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.PoolPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Pool_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    PoolPage poolPage = new PoolPage();


    @Given("user {string} is already logged in")
    public void userIsAlreadyLoggedIn(String userShortName) {
        loginPage.loginWithValid(userShortName);
    }


    @When("user clicks Poll button")
    public void userClicksPollButton() {
        poolPage.poolButton.click();
    }

    @When("user clicks Add More button")
    public void user_clicks_add_more_button() {
        poolPage.addMoreButton.click();

    }

    @Then("clicks on Employees and departments button")
    public void clicks_on_employees_and_departments_button() {
        poolPage.employeeAndDepartmentBtn.click();
    }

    @Then("clicks on HR department")
    public void clicks_on_hr_department() {
        poolPage.hrButton.click();
    }

    @Then("clicks on All department and sub department employees check box")
    public void clicks_on_all_department_and_sub_department_employees_check_box() {
        poolPage.hrSubCheckBox.click();
    }


    @When("user clicks link button")
    public void userClicksLinkButton() {
        poolPage.linkIcon.click();
    }

    @Then("user sees a popup message containing link and link-name boxes")
    public void userSeesAPopupMessageContainingLinkAndLinkNameBoxes() {
        Assert.assertTrue(poolPage.linkDialogBox.isDisplayed());
    }

    @Then("user inserts link_name {string} and link_URL {string}")
    public void userInsertsLink_nameAndLink_URL(String arg0, String arg1) {
         poolPage.link(arg0, arg1);
    }

    @And("user sees link formed in messaging area")
    public void userSeesLinkFormedInMessagingArea() {
        Driver.getDriver().switchTo().frame(poolPage.messageBox);
        String link_Name = poolPage.messageBoxInside.getText();
        Assert.assertTrue(link_Name, true);

        Driver.getDriver().switchTo().parentFrame();
    }


    @Then("user clicks add mention icon")
    public void userClicksAddMentionIcon() {
        poolPage.mentionIcon.click();
    }

    @Then("user sees a popup box message containing a link to Employees and departments")
    public void userSeesAPopupBoxMessageContainingALinkToEmployeesAndDepartments() {
        Assert.assertTrue(poolPage.popUpDialogBox.isDisplayed());

    }

    @Then("user clicks on it")
    public void userClicksOnIt() {
        poolPage.employeeAndDepartmentBtn.click();
    }

    @Then("user sees a list of employees and clicks on one of the employees email address")
    public void userSeesAListOfEmployeesAndClicksOnOneOfTheEmployeesEmailAddress() {
        poolPage.mentionedEmployee.click();
    }

    @And("user sees email address is inserted in messaging area")
    public void userSeesEmailAddressIsInsertedInMessagingArea() {
        Assert.assertTrue(poolPage.mentionedEmpAssert.isDisplayed());
    }


    @Then("user inserts a question {string}")
    public void userInsertsAQuestion(String question) {
        poolPage.multipleChoiceQuestionBox.sendKeys(question);
    }


    @Then("user adds an answer into AnswerOne box {string}")
    public void userAddsAnAnswerIntoAnswerOneBox(String arg0) {
        poolPage.multipleChoiceAnswerBox1.sendKeys(arg0);

    }

    @Then("user adds an answer into AnswerTwo box {string}")
    public void userAddsAnAnswerIntoAnswerTwoBox(String ans2) {
        poolPage.multipleChoiceAnswerBox2.sendKeys(ans2);
    }


    @And("user adds an answer into AnswerThree box {string}")
    public void userAddsAnAnswerIntoAnswerThreeBox(String ans3) {
        poolPage.multipleChoiceAnswerBox3.sendKeys(ans3);
    }

    @When("user goes back to question text box and deletes the question")
    public void userGoesBackToQuestionTextBoxAndDeletesTheQuestion() {
        poolPage.multipleChoiceQuestionBox.clear();
    }

    @Then("user deletes all answers")
    public void userDeletesAllAnswers() {
        poolPage.multipleChoiceAnswerBox1.clear();
        poolPage.multipleChoiceAnswerBox2.clear();
        poolPage.multipleChoiceAnswerBox3.clear();
    }

    @And("user sees empty question box")
    public void userSeesEmptyQuestionBox() {
        String textInsideInputBox = poolPage.multipleChoiceQuestionBox.getAttribute("value");
        Assert.assertTrue(textInsideInputBox.isEmpty());
    }

    @When("user checks multiple choice checkbox")
    public void userChecksMultipleChoiceCheckbox() {
        if (!poolPage.mChoicecheckBox.isSelected()) {
            poolPage.mChoicecheckBox.click();
        }
    }

    @And("user see checkbox checked")
    public void userSeeCheckboxChecked() {
        Assert.assertTrue(poolPage.mChoicecheckBox.isSelected());
    }

    @Then("user enters a message into message area")
    public void userEntersAMessageIntoMessageArea() {
        Driver.getDriver().switchTo().frame(poolPage.messageBox);
        poolPage.messageBoxInside.sendKeys("This is the pool question");
        Driver.getDriver().switchTo().parentFrame();
    }
    @Then("user clicks Send button")
    public void userClicksSendButton() {
        BrowserUtils.sleep(2);
         poolPage.sendBtn.click();
    }

    @And("user sees added HR employees in the To box")
    public void userSeesAddedHREmployeesInTheToBox() {
        BrowserUtils.verifyElementDisplayed(poolPage.hrDisplayCheck);

    }

}

