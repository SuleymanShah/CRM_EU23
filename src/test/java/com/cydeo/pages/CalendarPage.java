package com.cydeo.pages;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.cydeo.utilities.Driver.getDriver;

public class CalendarPage {

        private final static WebDriver WEB_DRIVER = getDriver();

        public CalendarPage(){
            PageFactory.initElements(WEB_DRIVER, this);
        }

        @FindBy(xpath = "//span[contains(text(), 'Activity Stream')]")
        public WebElement activityStreamPageTitle;

        @FindBy(xpath = "//span[contains(text(), 'Calendar')]")
        public WebElement calendarButton;

        @FindBy(xpath = "//span[contains(text(), 'Calendar') and @id='pagetitle']")
        public WebElement calendarPageTitle;

        @FindBy(xpath = "//button[contains(text(),'Add')]")
        public WebElement addButton;

        @FindBy(xpath = "//span[.='New Event' and @class=\"calendar-head-area-title-name\"]")
        public WebElement newEventPageTitle;

        @FindBy(xpath = "//input[@name=\"importance\"]")
        public WebElement thisEventIsImportantCheckBox;

        @FindBy(xpath = "//input[@name=\"date_from\"]")
        public WebElement startDateInput;

        @FindBy(xpath = "//a[@class=\"bx-calendar-left-arrow\"]")
        public WebElement startDateBackButton;

        @FindBy(xpath = "//a[@data-date=\"1661385600000\"]")
        public WebElement startDate25August;

        @FindBy(xpath = "//input[@class=\"calendar-field calendar-field-datetime-menu\" and @name=\"time_from\"]")
        public WebElement setTimeInput;

        @FindBy(xpath = "//div[.='Time']")
        public WebElement afterSetTimeInputClickHere;

        @FindBy(xpath = "(//input[@class=\"calendar-field calendar-field-datetime\"])[2]")
        public WebElement endDateInput;

        @FindBy(xpath = "//a[@data-date=\"1661817600000\"]")
        public WebElement endDate30August;

        @FindBy(xpath = "//span[.='Time zone']")
        public WebElement timeZoneButton;

        @FindBy(name = "tz_from")
        public WebElement timeZoneDropDown;

        @FindBy(name = "EVENT_RRULE[FREQ]")
        public WebElement repeatDropdown;

        @FindBy(xpath = "//input[@name=\"rrule_endson\" and @value=\"count\"]")
        public WebElement repeatDropdownAfterCheckBox;

        @FindBy(xpath = "//div[contains(text(),'daily')]")
        public WebElement dailyRepeatAssertion;

        @FindBy(xpath = "//input[@name=\"lo_cation\"]")
        public WebElement locationDropdown;

        @FindBy(xpath = "//span[.='Central Meeting Room' and @class=\"menu-popup-item-text\"]")
        public WebElement centralMeetingRoom;

        @FindBy(xpath = "//span[contains(@id,'slider-destination-link')]")
        public WebElement attendeesAddMoreButton;

        @FindBy(xpath = "//a[.=\"Employees and departments\"]")
        public WebElement employeesAndDepartmentsLink;

        @FindBy(xpath = "//div[.=\"marketing3@cybertekschool.com\" and @class=\"bx-finder-company-department-employee-name\"]")
        public WebElement marketing3;

        @FindBy(xpath = "//div[.=\"helpdesk3@cybertekschool.com\" and @class=\"bx-finder-company-department-employee-name\"]")
        public WebElement helpdesk3;

        @FindBy(xpath = "//div[.='Attendees']")
        public WebElement afterAddAttendeesClick;

        @FindBy(xpath = "//span[@data-id=\"U493\"]")
        public WebElement helpdesk3IsDisplayed;

        @FindBy(xpath = "//span[@data-id=\"U594\"]")
        public WebElement marketing3IsDisplayed;

        @FindBy(xpath = "//div[.='hr11@cybertekschool.com']")
        public WebElement helpdesk11;

        @FindBy(xpath = "//span[.='hr11@cybertekschool.com' and @bx-tooltip-user-id=\"703\"]")
        public WebElement helpdesk11IsDisplayed;

        @FindBy(xpath = "//div[@class=\"calendar-additional-alt-more\"]")
        public WebElement moreButton;

        @FindBy(className = "bx-editor-iframe")
        public WebElement descriptionIframe;

        @FindBy(xpath = "//body[@contenteditable=\"true\"]")
        public WebElement descriptionInput;

        @FindBy(xpath = "//body[.='MY_FIRST_DESCRIPTION_OF_BIRTHDAY']")
        public WebElement afterDescriptionInputEnter;

        @FindBy(xpath = "//li[@data-bx-calendar-color=\"#F87396\"]")
        public WebElement eventColorPink;

        @FindBy(xpath = "//li[@class=\"calendar-field-colorpicker-color-item active\" and @data-bx-calendar-color=\"#F87396\"]")
        public WebElement afterSelectColorPink;

        @FindBy(xpath = "//li[@style=\"background-color: rgb(46, 45, 147);\" and @class=\"calendar-field-colorpicker-color-item active\"]")
        public WebElement afterSelectColorNavyBlue;

        @FindBy(xpath = "//span[.=\"Other color\"]")
        public WebElement otherColorButton;

        @FindBy(xpath = "//div[@data-color=\"#2e2d93\"]")
        public WebElement eventColorNavyBlue;

        @FindBy(xpath = "//select[@name=\"accessibility\"]")
        public WebElement availability;

        @FindBy(xpath = "//option[.=\"Occupied\"]")
        public WebElement occupiedOption;

        @FindBy(xpath = "//option[.=\"Unsure\"]")
        public WebElement unsureOption;

        @FindBy(xpath = "//div[.='Undecided']")
        public WebElement unsureOptionAssertion;

        @FindBy(xpath = "//span[.='(Ctrl+Enter)']")
        public WebElement saveButton;

        @FindBy(xpath = "//input[@name=\"private_event\"]")
        public WebElement privateEventCheckBox;

        @FindBy(xpath = "//div[.='Private Event']")
        public WebElement privateEventAssertion;

        @FindBy(xpath = "//span[.='All event instances']")
        public WebElement allEventInstancesButton;

        @FindBy(xpath = "//span[.='25']")
        public WebElement marketing25AugustDisplay;

        @FindBy(xpath = "//span[@data-item-id=\"U594\"]")
        public WebElement marketing3DeleteButton;

        @FindBy(xpath = "//span[@data-item-id=\"U493\"]")
        public WebElement helpdesk3DeleteButton;

        @FindBy(className = "calendar-navigation-previous")
        public WebElement calendarNavigationPreviousMonth;

        @FindBy(xpath = "//span[.='1:40 pm']")
        public WebElement newEvent25AugustButton;

        @FindBy(xpath = "//span[.='Open']")
        public WebElement newEventOpenButton;

        @FindBy(xpath = "//span[.=\"Edit\"]")
        public WebElement newEventEditButton;

        @FindBy(xpath = "//span[.='Edit Event']")
        public WebElement editEventTitle;

        @FindBy(id = "calendar-filter-personal_search")
        public WebElement filterAndSearchInput;

        @FindBy(xpath = "//span[.=\"Invitations\"]")
        public WebElement invitationButton;

        @FindBy(xpath = "//div[.='Invitations']")
        public WebElement invitationDisplay;

        @FindBy(xpath = "//span[.=\"I'm an organiser\"]")
        public WebElement ImAnOrganiserButton;

        @FindBy(xpath = "//div[.=\"I'm an organiser\"]")
        public WebElement ImAnOrganiserDisplay;

        @FindBy(xpath = "//div[@data-name='IS_MEETING' and @data-params='{\"isMulti\":false}']")
        public WebElement eventWithParticipantsMenu;

        @FindBy(xpath = "//div[@data-item='{\"NAME\":\"Yes\",\"VALUE\":\"Y\"}']")
        public WebElement eventWithParticipantYesButton;

        @FindBy(xpath = "//span[@class=\"ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset\"]")
        public WebElement resetButton;

        @FindBy(xpath = "//input[@placeholder=\"Filter and search\"]")
        public WebElement eventWithParticipantsAssert;



        public void assertActivityStreamPage(){
                WebDriverWait wait = new WebDriverWait(WEB_DRIVER, 10);
                wait.until(ExpectedConditions.visibilityOf(activityStreamPageTitle));
                String actualTitle = getDriver().getTitle();
                Assert.assertTrue(actualTitle.contains("Portal")||actualTitle.contains("EULA"));
        }

        public void assertCalendarPage(){
                WebDriverWait wait = new WebDriverWait(WEB_DRIVER, 10);
                wait.until(ExpectedConditions.visibilityOf(calendarPageTitle));
                String actualTitle = getDriver().getTitle();
                Assert.assertTrue(actualTitle.contains("Calendar"));
        }

        public boolean isElementDisplayed(String xpath)
        {
               return !CollectionUtils.isEmpty(WEB_DRIVER.findElements(By.xpath(xpath)));
        }

}
