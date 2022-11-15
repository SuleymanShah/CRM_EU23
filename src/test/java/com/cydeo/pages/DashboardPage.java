package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Services']")
    public WebElement servicesModule;

    @FindBy(xpath = "//a[.='Meeting Room Booking Calendar View']")
    public WebElement meetingRoomBookingCalendarView;

    @FindBy(xpath = "//td[.='Event Calendar']")
    public WebElement eventCalendar;

    @FindBy(xpath = "//a[.='Book meeting room']")
    public WebElement bookMeetingRoom;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement newEvent;

    @FindBy(xpath = "//nobr[.='East Meeting Room']")
    public WebElement eastMeetingRoom;

    @FindBy(xpath = "//span[.='Ideas']")
    public WebElement ideasModule;

    @FindBy(xpath = "//span[.='New idea']")
    public WebElement newIdeaButton;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement titleInputForIdeas;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement ideaDescription;

    @FindBy(xpath = "//select[@name='UF_CATEGORY_CODE']")
    public WebElement categoryDropdown;

    @FindBy(xpath = "//span[@class='t']")
    public WebElement suggestNewIdeaButton;

    @FindBy(xpath = "//a[@title='Unlike']")
    public WebElement unlikeButton;

    @FindBy(xpath = "//a[@title='Like']")
    public WebElement likeButton;

    @FindBy(xpath = "//a[.='date added']")
    public WebElement dateAddedButton;

    @FindBy(xpath = "//a[.='rating']")
    public WebElement ratingButton;

    @FindBy(xpath = "//span[.='Lists']")
    public WebElement listsPage;

    @FindBy(xpath = "//span[.='Print']")
    public WebElement printButton;

}
