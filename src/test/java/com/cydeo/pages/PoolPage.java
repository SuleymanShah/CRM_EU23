package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoolPage {
    public PoolPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Poll']")
    public WebElement poolButton;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")  ////a[.='Add more']
    public WebElement addMoreButton;

    @FindBy(xpath = "//a[starts-with(@id, 'destDepartmentTab_')]")  // This is a dynamic webelement
    public WebElement employeeAndDepartmentBtn;

    @FindBy(xpath = "(//a[@href='#DR132'])[1]")
    public WebElement hrButton;


    @FindBy(xpath = "(//a[@href='#DR132'])[2]")
    public WebElement hrSubCheckBox;

    @FindBy(xpath = "//span[@data-id='DR132']")
    public WebElement hrDisplayCheck;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkIcon;

    @FindBy(xpath = "//div[@class='bx-core-adm-dialog-head']")
    public WebElement linkDialogBox;

    @FindBy(xpath = "//input[@placeholder='Link text']")
    public WebElement linkText;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement linkURL;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//body[@contenteditable='true']//a[1]")
    public WebElement displaiedText;


    @FindBy(xpath = "//a[@href='#U768']")
    public WebElement mentionedName;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement mentionIcon;

    @FindBy(xpath = "//div[@class='bx-finder-box bx-finder-box-vertical bx-lm-box bx-lm-mention']")
    public WebElement popUpDialogBox;

    @FindBy(xpath ="//div[.='helpdesk22@cybertekschool.com']")
    public WebElement mentionedEmployee;

    @FindBy(xpath = "//span[@data-id='U512']")
    public WebElement mentionedEmpAssert;

    @FindBy(xpath = "//input[@placeholder='Question ']")
    public WebElement multipleChoiceQuestionBox;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement multipleChoiceAnswerBox1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement multipleChoiceAnswerBox2;

    @FindBy(xpath = "//input[@placeholder='Answer  3']")
    public WebElement multipleChoiceAnswerBox3;

    @FindBy(xpath = "//input [@id='multi_0']")
    public WebElement mChoicecheckBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMsgForMsgTitle;

    @FindBy(className = "bx-editor-iframe")
    public WebElement messageBox;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBoxInside;

    /**
     * This method will accept two arguments and longin
     */
    public void link(String link_name, String link_URL) {
        linkText.sendKeys(link_name);
        linkURL.sendKeys(link_URL);
        saveBtn.click();
    }


}
