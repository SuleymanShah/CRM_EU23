package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pool_StepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("user is already POOL area")
    public void user_is_already_pool_area() {
        String url= ConfigurationReader.getProperty("env");
        Driver.getDriver().get(url);
        loginPage.loginWithConfig();
        loginPage.poolButton.click();

    }
    @When("user clicks Add More button")
    public void user_clicks_add_more_button() {

    }
    @Then("clicks on Employees and departments button")
    public void clicks_on_employees_and_departments_button() {

    }
    @Then("clicks on HR department")
    public void clicks_on_hr_department() {

    }
    @Then("clicks on All department and sub department employees check box")
    public void clicks_on_all_department_and_sub_department_employees_check_box() {

    }



}
