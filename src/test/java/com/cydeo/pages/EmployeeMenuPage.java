package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class EmployeeMenuPage {

    public EmployeeMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public static void loginWithConfig() {

        inputUsername.sendKeys(ConfigurationReader.getProperty("un"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("pw"));
        loginButton.click();

    }

    @FindBy(xpath = "//input[@class='login-inp']") //login-inp
    public static WebElement inputUsername;


    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public static WebElement inputPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public static WebElement loginButton;


    @FindBy(xpath = "//span[contains(text(),'Employees')]")
    public WebElement employeeBtn;


    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public WebElement companyStructure;


    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartment;


    @FindBy(xpath = "//span[contains(text(),'Find Employee')]")
    public WebElement findEmployee;

    //@FindBy(xpath = "//input[@id='user-fio']")
   // public WebElement searchBox;


   // @FindBy(xpath = "//span[@class='filter-but-text']")
    //public WebElement findEmployeeByAZ;


    @FindBy(xpath = "(//span[@class='filter-but-text-block'])[4]")
    public WebElement moreButton;

    @FindBy(xpath = "//span[text()='Export to Excel']")
    public WebElement exportButton;

    @FindBy(xpath = "//span[text()='Telephone Directory']")
    public WebElement telephoneDirectory;


    @FindBy(xpath = "//table[@class='bx-users-table data-table']//td[.='E-Mail']")
    public WebElement emailButton;


    @FindBy(xpath = "(//a[text()='Arben Istrefi'])[1]")
    public WebElement chosenEmployeeToSendMsg;

    @FindBy(xpath = "//span[contains(text(),'Send message')]")
    public WebElement sendMsgBtn;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentName;

    @FindBy(xpath = "//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepDropDown;

    @FindBy(xpath = "(//select[@id='IBLOCK_SECTION_ID'])/option[1]")
    public WebElement parentDepName;

    @FindBy(xpath = "//div[@class='popup-window-buttons']//span[text()='Add']")
    public WebElement depAddBtn;







}