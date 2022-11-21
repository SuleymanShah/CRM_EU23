package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchPage_StepDefinitions {

    SearchPage searchPage=new SearchPage();

    LoginPage loginPage=new LoginPage();
    @Given("user {string} is already logged in")
    public void userIsAlreadyLoggedIn(String userShortName) {
        loginPage.loginWithValid(userShortName);
        System.out.println("trying to get github to work");
    }

    @When("user clicks on search icon")
    public void user_clicks_on_search_icon() {
        searchPage.conversationSearchBox.click();
    }
    @Then("user sees conversations")
    public void user_sees_conversations() {
        Assert.assertTrue(searchPage.messageBody.isDisplayed());
    }

    @When("user clicks on item search bar")
    public void user_clicks_on_item_search_bar() {
        searchPage.itemSearch.click();
    }
    @Then("user sees intended search items")
    public void user_sees_intended_search_items() {
      Assert.assertTrue(searchPage.itemPageAssertion.isDisplayed());
    }

    @Then("user sees intended search groups")
    public void user_sees_intended_search_groups() {
       Assert.assertTrue(searchPage.groupSearchAssertion.isDisplayed());
    }

}
