package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationOption;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    //@FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadButton;

    @FindBy(xpath = "(//div[@class='diskuf-uploader'])[1]")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light'])[2]")
    public WebElement selectDocumentFromBitrix24;

    @FindBy(xpath = "(//span[@class='bx-file-dialog-tab-item-link-text'])[3]")
    public WebElement salesAndMarketing;

    @FindBy(xpath = "//span[@title='Name: AzulCRM_App_info.pdf']")
    public WebElement selectedDocument;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement selectDocumentBtn;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-editor-link'])[3]")
    public WebElement dropboxBtn;

    @FindBy(xpath = "(//span[@class='bx-file-dialog-tab-item-link-text'])[3]")
    public WebElement googleDriveBtn;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMore;

    @FindBy(xpath = "//a[text()='Employees and departments']")
    public WebElement employeeDepartment;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[2]")
    public WebElement hr1;

    @FindBy(xpath = "//a[text()='Recent']")
    public WebElement recentOption;

    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[1]")
    public WebElement allEmployee;



    @FindBy(xpath = "//span[@id='lhe_button_editor_blogPostForm']")
    public WebElement visualEditor;

    @FindBy(xpath = "//div[@id='bx-html-editor-tlbr-idPostFormLHE_blogPostForm']")
    public WebElement visualToolBar;

    @FindBy(xpath = "//div[@id='feed-add-post-grat-type-selected']")
    public WebElement illustrationEmojis;

    @FindBy(xpath = "//div[@class='feed-add-grat-list-title']")
    public WebElement illustrationPopup;

    @FindBy(xpath = "//span[@id='lhe_button_title_blogPostForm']")
    public WebElement topicIcon;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement topicTitle;

    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm']")
    public WebElement linkIcon;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkBox;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkTextBox;

    @FindBy(id = "undefined")
    public WebElement linkSaveBtn;

    @FindBy(id = "bx-b-video-blogPostForm")
    public WebElement insertVideoIcon;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement insertVideoText;

    @FindBy(xpath = "(//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")
    public WebElement recordVideoIcon;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-blue']")
    public WebElement popupPermission;

    @FindBy(xpath = "//div[@id='popup-window-titlebar-bx-popup-videomessage-popup']")
    public WebElement errorMsg;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement tagIcon;

    @FindBy(id = "post-tags-container-blogPostForm")
    public WebElement tagBox;

    @FindBy(xpath = "//input[@id='TAGS_blogPostForm67abSn']")
    public WebElement tagPopup;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement tagAdd;

    @FindBy(xpath = "//span[@class='feed-add-post-tags']")
    public WebElement tag1;

    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement toBox;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionIcon;




}
