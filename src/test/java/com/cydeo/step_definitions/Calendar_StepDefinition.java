package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Calendar_StepDefinition {

    LoginPage loginPage = new LoginPage();

    CalendarPage calendarPage = new CalendarPage();

    @Given("{string} user is on the home page")
    public void user_is_on_the_home_page(String userShortName) {
        loginPage.loginWithValid(userShortName);
        calendarPage.assertActivityStreamPage();
    }
    @When("user clicks -Calendar- button on the left side of the page")
    public void user_clicks_calendar_button_on_the_left_side_of_the_page() {
        calendarPage.calendarButton.click();
        calendarPage.assertCalendarPage();
    }
    @When("user clicks blue -Add- button on the right side of the page")
    public void user_clicks_blue_add_button_on_the_right_side_of_the_page() {
        calendarPage.addButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(calendarPage.newEventPageTitle));
        String expectedTitle = "New Event";
        String actualTitle = calendarPage.newEventPageTitle.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @When("user clicks the -This event is important- checkbox")
    public void user_clicks_the_this_event_is_important_checkbox() {
        if (!calendarPage.thisEventIsImportantCheckBox.isSelected()){
            calendarPage.thisEventIsImportantCheckBox.click();
        }
        Assert.assertTrue(calendarPage.thisEventIsImportantCheckBox.isSelected());
    }
    @When("user sets the event start date and time")
    public void user_sets_the_event_start_date_and_time() {
        calendarPage.startDateInput.click();

        for (int i = 0; i < 3; i++) {
            calendarPage.startDateBackButton.click();
        }

        BrowserUtils.sleep(2);

        calendarPage.startDate25August.click();

        for (int i = 0; i < 8; i++) {
            calendarPage.setTimeInput.sendKeys(Keys.BACK_SPACE);
        }

        calendarPage.setTimeInput.sendKeys("1.40 pm");
        calendarPage.afterSetTimeInputClickHere.click();

    }
    @When("user sets event end date")
    public void user_sets_event_end_date() {
        calendarPage.endDateInput.click();

        calendarPage.endDate30August.click();


    }
    @When("user sets the -Time zone- as {string}")
    public void user_sets_the_time_zone_as(String timeZone) {
        calendarPage.timeZoneButton.click();
        Select select = new Select(calendarPage.timeZoneDropDown);
        List<WebElement> timeZoneOptionsAsWebElement = select.getOptions();

        for (WebElement each : timeZoneOptionsAsWebElement) {
            if (each.getText().equals(timeZone)){
                select.selectByVisibleText(each.getText());
                Assert.assertTrue(each.isSelected());
            }
        }


    }
    @When("user sets -Repeat- as {string}")
    public void user_sets_repeat_as(String repeatTime) {
        Select select = new Select(calendarPage.repeatDropdown);

            if (!select.getFirstSelectedOption().getText().equals(repeatTime)){
                select.selectByVisibleText(repeatTime);
                Assert.assertEquals(select.getFirstSelectedOption().getText(), repeatTime);
            }

        if (!calendarPage.repeatDropdownAfterCheckBox.isSelected()){
            calendarPage.repeatDropdownAfterCheckBox.click();
            Assert.assertTrue(calendarPage.repeatDropdownAfterCheckBox.isSelected());
        }

    }
    @When("user sets -Location- as -Main Meeting Room-")
    public void user_sets_location_as_main_meeting_room() {

    }
    @When("user adds {string} and {string} as attendees")
    public void user_adds_and_as_attendees(String marketing, String helpdesk) {
        calendarPage.attendeesAddMoreButton.click();
        calendarPage.employeesAndDepartmentsLink.click();
        BrowserUtils.clickWithJS(calendarPage.marketing3);
        BrowserUtils.clickWithJS(calendarPage.helpdesk3);
        BrowserUtils.sleep(2);
        calendarPage.afterAddAttendeesClick.click();
        Assert.assertTrue(calendarPage.helpdesk3IsDisplayed.isDisplayed());
        Assert.assertTrue(calendarPage.marketing3IsDisplayed.isDisplayed());
    }
    @When("user clicks -More- button,at the bottom of the -New Event- page")
    public void user_clicks_more_button_at_the_bottom_of_the_new_event_page() {
        calendarPage.moreButton.click();
    }
    @When("user enters description as {string}")
    public void user_enters_description_as(String description) {
        Driver.getDriver().switchTo().frame(calendarPage.descriptionIframe);
        BrowserUtils.scrollToElement(calendarPage.descriptionInput);
        calendarPage.descriptionInput.sendKeys(description);
        Assert.assertEquals(description, calendarPage.afterDescriptionInputEnter.getText());
        Driver.getDriver().switchTo().parentFrame();
    }
    @When("user sets task color as {string}")
    public void user_sets_task_color_as(String string) {
        calendarPage.eventColorPink.click();
        Assert.assertTrue(calendarPage.afterSelectColorPink.isDisplayed());
    }
    @When("user sets -Availability- as {string}")
    public void user_sets_availability_as(String string) {
        Select select = new Select(calendarPage.availability);

        if (!select.getFirstSelectedOption().equals(calendarPage.occupiedOption)){
            select.selectByVisibleText(string);
        }

        Assert.assertTrue(calendarPage.occupiedOption.isSelected());

    }

    @Then("user clicks -Save- button and set the event on Calendar")
    public void user_clicks_save_button_and_set_the_event_on_calendar() {
        calendarPage.saveButton.click();
        for (int i = 0; i < 3; i++) {
            calendarPage.calendarNavigationPreviousMonth.click();
        }
        Assert.assertTrue(calendarPage.newEvent25AugustButton.isDisplayed());
    }

    @When("user goes to 25 August on Calendar and clicks New Event")
    public void user_goes_to_25_august_on_calendar_and_clicks_new_event() {
        for (int i = 0; i < 3; i++) {
            calendarPage.calendarNavigationPreviousMonth.click();
        }
        BrowserUtils.clickWithJS(calendarPage.newEvent25AugustButton);
    }
    @When("user clicks -Edit- button")
    public void user_clicks_edit_button() {
        calendarPage.newEventEditButton.click();
    }
    @When("user clicks -other color-")
    public void user_clicks_other_color() {
        BrowserUtils.scrollToElement(calendarPage.otherColorButton);
        calendarPage.otherColorButton.click();
    }
    @Then("user edits task color as {string}")
    public void user_edits_task_color_as(String string) {
        calendarPage.eventColorNavyBlue.click();
        Assert.assertTrue(calendarPage.afterSelectColorNavyBlue.isDisplayed());
        calendarPage.saveButton.click();
    }

    @When("user clicks -Private Event- checkbox")
    public void user_clicks_private_event_checkbox() {
        BrowserUtils.clickWithJS(calendarPage.privateEventCheckBox);
        if (!calendarPage.privateEventCheckBox.isSelected()){
            calendarPage.privateEventCheckBox.click();
        }
        Assert.assertTrue(calendarPage.privateEventCheckBox.isSelected());
    }
    @Then("user clicks -Save- button and edit the event as private")
    public void user_clicks_save_button_and_edit_the_event_as_private() {
        calendarPage.saveButton.click();
        for (int i = 0; i < 3; i++) {
            calendarPage.calendarNavigationPreviousMonth.click();
        }
        BrowserUtils.clickWithJS(calendarPage.newEvent25AugustButton);
        calendarPage.newEventOpenButton.click();
        Assert.assertTrue(calendarPage.privateEventAssertion.isDisplayed());
    }

    @When("user goes to 25 August on Calendar")
    public void user_goes_to_25_august_on_calendar() {
        for (int i = 0; i < 3; i++) {
            calendarPage.calendarNavigationPreviousMonth.click();
        }
        BrowserUtils.scrollToElement(calendarPage.marketing25AugustDisplay);
    }
    @Then("user should not see the private event")
    public void user_should_not_see_the_private_event() {

        Assert.assertFalse(calendarPage.isElementDisplayed("//span[.='1:40 pm']"));

    }

    @When("user changes their availability from Occupied to {string}")
    public void user_changes_their_availability_from_occupied_to(String string) {
        Select select = new Select(calendarPage.availability);

        if (select.getFirstSelectedOption().equals(calendarPage.occupiedOption)){
            select.selectByVisibleText(string);
        }

        Assert.assertTrue(calendarPage.unsureOption.isSelected());
    }
    @Then("user clicks the -Save- button and edit the event as availability is Unsure")
    public void user_clicks_the_save_button_and_edit_the_event_as_availability_is_unsure() {
        calendarPage.saveButton.click();
        for (int i = 0; i < 3; i++) {
            calendarPage.calendarNavigationPreviousMonth.click();
        }
        BrowserUtils.clickWithJS(calendarPage.newEvent25AugustButton);
        calendarPage.newEventOpenButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(calendarPage.newEventPageTitle));
        Assert.assertTrue(calendarPage.unsureOptionAssertion.isDisplayed());
    }

    @Then("user clicks the -Save- button and edit the event repeats daily")
    public void user_clicks_the_save_button_and_edit_the_event_repeats_daily() {
        calendarPage.saveButton.click();
        BrowserUtils.clickWithJS(calendarPage.newEvent25AugustButton);
        calendarPage.newEventOpenButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(calendarPage.newEventPageTitle));
        Assert.assertTrue(calendarPage.dailyRepeatAssertion.isDisplayed());
    }

    @When("user deletes attendees")
    public void user_deletes_attendees() {
        BrowserUtils.sleep(15);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(calendarPage.repeatDropdown));
        BrowserUtils.scrollToElement(calendarPage.attendeesAddMoreButton);
        calendarPage.marketing3DeleteButton.click();
        calendarPage.helpdesk3DeleteButton.click();
    }
    @Then("user clicks the -Save- button and edit the event")
    public void user_clicks_the_save_button_and_edit_the_event() {
        calendarPage.saveButton.click();
        BrowserUtils.clickWithJS(calendarPage.newEvent25AugustButton);
        calendarPage.newEventOpenButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(calendarPage.newEventPageTitle));
        Assert.assertFalse(calendarPage.isElementDisplayed("//span[.='helpdesk3@cybertekschool.com' and @bx-tooltip-classname=\"calendar-planner-user-tooltip\"]"));
        Assert.assertFalse(calendarPage.isElementDisplayed("//span[.='marketing3@cybertekschool.com' and @bx-tooltip-classname=\"calendar-planner-user-tooltip\"]"));

    }

    @When("user adds {string} as attendee")
    public void user_adds_as_attendee(String string) {
        calendarPage.attendeesAddMoreButton.click();
        calendarPage.employeesAndDepartmentsLink.click();
        BrowserUtils.clickWithJS(calendarPage.helpdesk11);
        BrowserUtils.sleep(2);
        calendarPage.afterAddAttendeesClick.click();
    }
    @Then("user clicks the -Save- button and edit the event with one more attendee")
    public void user_clicks_the_save_button_and_edit_the_event_with_one_more_attendee() {
        calendarPage.saveButton.click();
        BrowserUtils.clickWithJS(calendarPage.newEvent25AugustButton);
        calendarPage.newEventOpenButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(calendarPage.newEventPageTitle));
        Assert.assertTrue(calendarPage.helpdesk11IsDisplayed.isDisplayed());
    }

    @When("user clicks -Filter and search- box")
    public void user_clicks_filter_and_search_box() {
        calendarPage.filterAndSearchInput.click();
    }
    @When("user clicks -Invitations- button")
    public void user_clicks_invitations_button() {
        calendarPage.invitationButton.click();
    }
    @Then("user should display the invitations")
    public void user_should_display_the_invitations() {
        Assert.assertTrue(calendarPage.invitationDisplay.isDisplayed());
    }

    @When("user clicks -I'M AN ORGANISER- button")
    public void user_clicks_i_m_an_organiser_button() {
        calendarPage.ImAnOrganiserButton.click();
    }


    @Then("user should events and task")
    public void user_should_events_and_task() {
        Assert.assertTrue(calendarPage.ImAnOrganiserDisplay.isDisplayed());
    }

}
