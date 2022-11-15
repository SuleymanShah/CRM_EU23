package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Helpdesk_StepDefinitions {
    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks the services module")
    public void user_clicks_the_services_module() {
        dashboardPage.servicesModule.click();
    }

    @When("user clicks Meeting Room Booking Calendar View module")
    public void user_clicks_meeting_room_booking_calendar_view_module() {
        dashboardPage.meetingRoomBookingCalendarView.click();
    }

    @Then("user sees Event Calendar is displayed")
    public void user_sees_event_calendar_is_displayed() {
        dashboardPage.eventCalendar.isDisplayed();
    }


    @When("user clicks Book meeting room module")
    public void userClicksBookMeetingRoomModule() {
        dashboardPage.bookMeetingRoom.click();
    }

    @Then("user is redirected to New Event page")
    public void userIsRedirectedToNewEventPage() {
        String expectedPage = "New Event";
        String actualPage = dashboardPage.newEvent.getText();
    }

    @Then("user unchecks East Meeting Room")
    public void userUnchecksEastMeetingRoom() throws InterruptedException {
        dashboardPage.eastMeetingRoom.click();
        Thread.sleep(1500);
        Assert.assertFalse(dashboardPage.eastMeetingRoom.isSelected());
    }
}
