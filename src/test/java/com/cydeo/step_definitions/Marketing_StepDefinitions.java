package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Marketing_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks the ideas module")
    public void user_clicks_the_ideas_module() {
        dashboardPage.ideasModule.click();
    }

    @When("user clicks new ideas button")
    public void user_clicks_new_ideas_button() {
        dashboardPage.newIdeaButton.click();
    }

    @When("user enters title as {string}")
    public void user_enters_title_as(String string) {
        dashboardPage.titleInputForIdeas.sendKeys(string);
    }

    @When("user enters description as {string}")
    public void user_enters_description_as(String string) {
        Driver.getDriver().switchTo().frame(1);
        dashboardPage.ideaDescription.sendKeys(string);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user selects {string} from Category dropdown")
    public void user_selects_from_category_dropdown(String string) {
        //dashboardPage.categoryDropdown.click();
        Select dropdown = new Select(dashboardPage.categoryDropdown);
        dropdown.selectByVisibleText("Holidays");
    }

    @Then("user creates new idea by clicking suggest new idea button")
    public void user_creates_new_idea_by_clicking_suggest_new_idea_button() {
        dashboardPage.suggestNewIdeaButton.click();
    }

    @Then("user dislikes the idea")
    public void userDislikesTheIdea() {
        dashboardPage.unlikeButton.click();
    }

    @Then("user likes the last idea that was already created")
    public void userLikesTheLastIdeaThatWasAlreadyCreated() {
        dashboardPage.likeButton.click();
    }

    @Then("user sorts the ideas by clicking date added button")
    public void userSortsTheIdeasByClickingDateAddedButton() {
        dashboardPage.dateAddedButton.click();
    }

    @Then("user sorts the ideas by clicking rating button")
    public void userSortsTheIdeasByClickingRatingButton() {
        dashboardPage.ratingButton.click();
    }
}
