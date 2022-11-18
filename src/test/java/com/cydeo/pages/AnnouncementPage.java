package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
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


    @FindBy(xpath = "(//a[contains(text(),'png')])[1]")
    public WebElement flower;

    @FindBy(xpath = "//*[text()='Select document']")
    public WebElement selectDocument;


    @FindBy(xpath = "//span[contains(text(),'png')]")
    public WebElement attachedFilesAndImages;


    @FindBy(xpath = "//*[text()='Add more'][1]")
    public WebElement addMore;


    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public WebElement recent;


    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-info'])[2]/div")
    public WebElement helpdesk;


    @FindBy(xpath = "(//*[text()='helpdesk9@cybertekschool.com'])[2]")
    public WebElement findHelpdesk;


    @FindBy(xpath = "//*[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepartments;


    @FindBy(xpath = "(//div[@class='bx-finder-company-department']/a/div)[2]")
    public WebElement anything;


    @FindBy(xpath = "//div[@class='bx-finder-company-department-check-arrow'][1]")
    public WebElement allDepartmentAndSubdepartmentEmployees;


    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[3]")
    public WebElement findAnything;


    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeRecentPage;


    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[3]")
    public WebElement addHR;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeThePage;

    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm']")
    public WebElement theLinkIcon;


    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement UrlBox;


    @FindBy(xpath = "(//input[@class='adm-btn-save'])[1]")
    public WebElement clickSaveBtn;
    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']\n")
    public WebElement UrlTextBox;


    @FindBy(xpath = "(//div[@class='bx-core-adm-dialog-buttons']/input)[1]")
    public WebElement amazonSaveBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendbtn;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-title']")
    public WebElement verfyVideoFromVimeo;


    @FindBy(id = "bx-b-video-blogPostForm")
    public WebElement insertVideoIc;


    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement insertVideoText;

    @FindBy(xpath = "(//span[@class='bx-core-adm-icon-close'])[2]")
    public WebElement videoCross;


    @FindBy(xpath = "//span[@id='bx-b-quote-blogPostForm']")

    public WebElement commaIcon;


    @FindBy(xpath = "//iframe[@class=\"bx-editor-iframe\"]")

    public WebElement writeQuote;


    @FindBy(xpath = "(//*[@class='blogquote']/tbody/tr)[1]")

    public WebElement writeQuoteActual;


    @FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-primary']")
    public WebElement clickSendBtn;


    @FindBy(xpath = "//span[@id='lhe_button_editor_blogPostForm']")
    public WebElement visualEditor;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMentionIcon;

    @FindBy(xpath = "//div[@id='bx-html-editor-tlbr-idPostFormLHE_blogPostForm']")
    public WebElement visualToolBar;

    @FindBy(xpath = "//span[@id='lhe_button_title_blogPostForm']")
    public WebElement topicIcon;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement topicTitle;


    @FindBy(xpath = "(//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")
    public WebElement recordVideoIcon;


    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-link popup-window-button-decline']")
    public WebElement closebtn;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-blue']")
    public WebElement popupPermission;

    @FindBy(xpath = "//*[@class='popup-window-button popup-window-button-blue']")
    public WebElement clickAllowBtn;


    @FindBy(xpath = "//div[@id='popup-window-titlebar-bx-popup-videomessage-popup']")
    public WebElement errorMsg;


    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-blue']")
    public WebElement close;


    @FindBy(xpath = "//span[@class='feed-add-post-form-but feed-add-tag']")
    public WebElement clicktag;


    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public WebElement displaytag;

    @FindBy(xpath = " //span[@class='popup-window-button']")
    public WebElement addTag;

    @FindBy(xpath = " //span[@class='feed-add-post-tags']")
    public WebElement seeTag;


    @FindBy(xpath = "(//*[text()='Asiya'])[2]")
    public WebElement addAsia;



    @FindBy(xpath = "//*[text()='wang']")
    public WebElement addWang;


    @FindBy(xpath = " (//span[@class='bxhtmled-metion'])[1]")
    public WebElement addedAsiya;


    @FindBy(xpath = "(//span[@class='bxhtmled-metion'])[2]")
    public WebElement addedWang;


    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-link popup-window-button-decline']")
    public WebElement closePopup;

}

