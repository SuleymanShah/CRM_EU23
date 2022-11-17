package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.TasksPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Tasks_StepDefinitions {

    TasksPage tasksPage = new TasksPage();

    @Given("user is already logged in")
    public void userIsAlreadyLoggedIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        TasksPage.loginWithConfig();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 8);
    }

    @When("user clicks Tasks function button")
    public void user_clicks_tasks_function_button() {
        tasksPage.tasksBtn.click();
    }


    @When("user clicks All Tasks tab")
    public void user_clicks_all_tasks_tab() {
        tasksPage.allTasksBtn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 8);
    }


    @Then("user sees tasks In Progress")
    public void user_sees_tasks_in_progress() {
        String inProgressTasks = tasksPage.inProgressTasks.getText();
        Assert.assertEquals(inProgressTasks, "In progress");
        Assert.assertTrue(tasksPage.inProgressTasks.isDisplayed());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 8);

        System.out.println(inProgressTasks + ": In progress tasks are visible! ");

    }


    @When("user clicks Ongoing Tasks tab")
    public void user_clicks_ongoing_tasks_tab() {
        tasksPage.ongoingTasksTab.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3);


    }
    @Then("user sees Ongoing Tasks")
    public void user_sees_ongoing_tasks() {
        String OngoingTasksTab = tasksPage.ongoingTasksTab.getText();
        Assert.assertTrue(tasksPage.ongoingTasksTab.isDisplayed());
        //Assert.assertEquals(OngoingTasksTab, "Ongoing");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

        System.out.println(OngoingTasksTab + ": Ongoing tasks are visible! ");


    }


}
