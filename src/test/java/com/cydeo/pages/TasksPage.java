package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {


    public TasksPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='login-inp']")
    public static WebElement inputUsername;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public static WebElement inputPassword;

    @FindBy(xpath = "//input[contains(@class,'login-btn')]")
    public static WebElement loginBtn;

   // @FindBy(xpath = "//input[@class='login-btn']")
   // public static WebElement loginButton;

    @FindBy(xpath = "//span[normalize-space()='Tasks']")
    public WebElement tasksBtn;

    @FindBy(xpath = "//span[text()='All']")
    public WebElement allTasksBtn;

    @FindBy(xpath = "//span[text()='Ongoing']")
    public WebElement ongoingTasksTab;

    @FindBy(xpath = "//span[text()='In progress']")
    public WebElement inProgressTasks;

    //@FindBy(xpath = "(//*[contains(text(),'Role: Ongoing')])")
    //public WebElement OngoingTasksTab;

    public static void loginWithConfig() {
             inputUsername.sendKeys(ConfigurationReader.getProperty("un"));
             inputPassword.sendKeys(ConfigurationReader.getProperty("pw"));
             loginBtn.click();
          }

    /*

     * This method will read arguments from the configuration.properties file.


     */






}
