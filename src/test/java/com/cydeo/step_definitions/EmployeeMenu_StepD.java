

package com.cydeo.step_definitions;

import com.cydeo.pages.EmployeeMenuPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.cydeo.pages.EmployeeMenuPage.*;

public class EmployeeMenu_StepD {


    EmployeeMenuPage employeeMenuPage = new EmployeeMenuPage();




    @Given(": user is already logged in")
    public void userIsAlreadyLoggedIn() {
        String url= com.cydeo.utilities.ConfigurationReader.getProperty("env");
        com.cydeo.utilities.Driver.getDriver().get(url);
        employeeMenuPage.loginWithConfig();
    }




    @When("user clicks Employee button")
    public void userClicksEmployeeButton() {
       employeeMenuPage.employeeBtn.click();

    }

    @Then("user should be able to display Employee page")
    public void userShouldBeAbleToDisplayEmployeePage() {
       Assert.assertTrue(employeeMenuPage.employeeBtn.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    @When("user clicks Company Structure")
    public void userClicksCompanyStructure() {
       employeeMenuPage.companyStructure.click();
    }

    @Then("User should be able to display Company Structure")
    public void userShouldBeAbleToDisplayCompanyStructure() {
        Assert.assertTrue(employeeMenuPage.companyStructure.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    @When("user clicks Add Department")
    public void userClicksAddDepartment() {
       employeeMenuPage.addDepartment.click();
    }

    @Then("User should be able to Add a department")
    public void userShouldBeAbleToAddADepartment() {
     employeeMenuPage.addDepartment.click();
     employeeMenuPage.departmentName.sendKeys(Keys.ENTER, "karayollari");
     BrowserUtils.waitFor(2);
     WebElement dropdown = Driver.getDriver().findElement(By.id("IBLOCK_SECTION_ID"));
     Select select = new Select(dropdown);
     String expectedOption = "Cyber Vet";
     select.selectByValue("129");
     BrowserUtils.waitFor(2);
     employeeMenuPage.depAddBtn.click();

    }

    @When("user clicks Find Employee")
    public void userClicksFindEmployee() {
    employeeMenuPage.findEmployee.click();
    }

    @Then("User should be able to find Employees")
    public void userShouldBeAbleToFindEmployees() {
    Assert.assertTrue(employeeMenuPage.findEmployee.isDisplayed());
    BrowserUtils.waitFor(2);
    }

    @When("user clicks More button")
    public void userClicksMoreButton() {
    employeeMenuPage.moreButton.click();
    }

    @Then("User should be able to export the Employee list")
    public void userShouldBeAbleToExportTheEmployeeList() {
    employeeMenuPage.exportButton.click();
    //Assert.assertTrue(employeeMenuPage.exportButton.isSelected());
    BrowserUtils.waitFor(2);
    }

    @When("user clicks Telephone Directory")
    public void userClicksTelephoneDirectory() {
    employeeMenuPage.telephoneDirectory.click();
    }

    @Then("User should be able to display Telephone Directory")
    public void userShouldBeAbleToDisplayTelephoneDirectory() {
     Assert.assertTrue(employeeMenuPage.telephoneDirectory.isDisplayed());
     BrowserUtils.waitFor(2);
    }

    @When("user clicks an email")
    public void userClicksAnEmail() {
    employeeMenuPage.chosenEmployeeToSendMsg.click();
     BrowserUtils.waitFor(2);

    }

    @Then("User should be able to send a message to an employee from the telephone directory")
    public void userShouldBeAbleToSendAMessageToAnEmployeeFromTheTelephoneDirectory() {
     employeeMenuPage.sendMsgBtn.click();
     Assert.assertTrue(employeeMenuPage.sendMsgBtn.isEnabled());
     BrowserUtils.waitFor(2);
     Driver.closeDriver();
    }



}

/*

    @When("user should be able to display Employee page")
    public void userShouldBeAbleToDisplayEmployeePage() {
        employeeMenuPage.employeeBtn.click();
        String employeePage = employeeMenuPage.employeeBtn.getText();
        Assert.assertTrue(employeeMenuPage.employeeBtn.isDisplayed());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        }



    @When("User should be able to display company structure.")
    public void userShouldBeAbleToDisplayCompanyStructure() {
        employeeMenuPage.companyStructure.click();

    }

    @Then("User should be able to add a department.")
    public void user_should_be_able_to_add_a_department() {
        employeeMenuPage.addDepartment.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
    }

    @Then("User should be able to find employees.")
    public void userShouldBeAbleToFindEmployees() {
        employeeMenuPage.findEmployee.sendKeys(Keys.ENTER,"employees");


    }


    @Then("User should be able to export the employee list.")
    public void user_should_be_able_to_export_the_employee_list() {
        employeeMenuPage.moreButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        employeeMenuPage.exportButton.click();


    }


    @Then("User should be able to display telephone directory")
    public void user_should_be_able_to_display_telephone_directory() {
        employeeMenuPage.telephoneDirectory.click();
        String telephoneDirectory = employeeMenuPage.telephoneDirectory.getText();
        Assert.assertTrue(employeeMenuPage.telephoneDirectory.isDisplayed());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        System.out.println(telephoneDirectory + ": Telephone Directory is displayed. ");


    }


    @Then("User should be able to send message to employee from the telephone directory")
    public void user_should_be_able_to_send_message_to_employee_from_the_telephone_directory() {
        employeeMenuPage.sendMesage.click();
        String sendMsg = employeeMenuPage.sendMesage.getText();
        Assert.assertTrue(employeeMenuPage.sendMesage.isEnabled());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        System.out.println("sendMsg is enable  = " + sendMsg);

    }
 */