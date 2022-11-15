package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.x500.X500Principal;

public class AnnouncementPage {
    public AnnouncementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[text()='More'])[1]")
    public WebElement moreButton;
// span[@class='feed-add-post-more-icon']

    @FindBy(xpath = "(// span[@class='menu-popup-item-text'])[3]")
    public WebElement announcementButton;


    @FindBy(xpath = " (// span[@class='feed-add-post-form-but feed-add-file'])[1]")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "(// input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[1]/..")
    //(// input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[1]/..
    //(//span[text()='Upload files and images'])[3]
    public WebElement uploadFilesAndImageModule;


    @FindBy(xpath = "(//span[text()='Download from external drive'])[1]")
    public WebElement downloadFromExternalDrive;


    @FindBy(xpath = "//*[text()='Box']")
    public WebElement boxButton;

    @FindBy(xpath = "//div[text()='The social networking service Google Docs is not configured. Please contact your Bitrix24 administrator.']")
    public WebElement verfyingMessageForDownload;


    @FindBy(xpath = "(//span[@class='popup-window-close-icon popup-window-titlebar-close-icon'])[2]")
    public WebElement cross;

    @FindBy(xpath = "(//span[text()='Select document from Bitrix24'][1])")
    public WebElement selectDocumentFromBitrix24;


    @FindBy(xpath = "//*[text()='flower.jpg']")
    public WebElement flower;

    @FindBy(xpath = "//*[text()='Select document']")
    public WebElement selectDocument;


    @FindBy(xpath = "//span[contains(text(),'flower.jpg')]")
    public WebElement attachedFilesAndImages;


    @FindBy(xpath = "//*[text()='Add more'][1]")
    public WebElement addMore;


    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public WebElement recent;


    @FindBy(xpath = "//*[text()='Asiya'][1]")
    public WebElement asia;


    @FindBy(xpath = "//*[@id='destGroupTab_destination8028399']")
    public WebElement myGroup;


    @FindBy(xpath = "//*[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepartments;


    @FindBy(xpath = "(//*[text()='HR'])[2]")
    public WebElement HR;


    @FindBy(xpath = "(//div[text()='All department and subdepartment employees'])[26]")
    public WebElement allDepartmentAndSubdepartmentEmployees;


    @FindBy(xpath = "//span[text()='Asiya']")
    public WebElement addAsiya;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeRecentPage;


    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[3]")
    public WebElement addHR;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeThePage;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link bxhtmled-top-bar-btn-active']/i")
    public WebElement linkIcon;




    }

