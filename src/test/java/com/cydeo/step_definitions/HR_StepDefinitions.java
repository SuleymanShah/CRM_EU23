package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HR_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks Lists page")
    public void user_clicks_lists_page() {
        dashboardPage.listsPage.click();
    }
    @Then("user is able to print by clicking the print element")
    public void user_is_able_to_print_by_clicking_the_print_element() {
        dashboardPage.printButton.click();
    }

}
