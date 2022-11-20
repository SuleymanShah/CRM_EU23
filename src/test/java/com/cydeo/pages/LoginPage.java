package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.*;


public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='login-inp']") //login-inp
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    /**
     * This method will read arguments from the configuration.properties file.
     */



    private static final Map<String,String> users = Map.of("hr1","hr1@cybertekschool.com","hr2",

            "hr50@cybertekschool.com","helpdesk1", "helpdesk3@cybertekschool.com", "helpdesk2",
            "helpdesk50@cybertekschool.com","marketing1", "marketing3@cybertekschool.com",
            "marketing2","marketing50@cybertekschool.com");


    public void loginWithValid(String userShortName) {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        inputUsername.sendKeys(users.get(userShortName));
        inputPassword.sendKeys(ConfigurationReader.getProperty("pw"));
        loginButton.click();

    }

    private void userLogin(String userName) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        inputUsername.sendKeys(ConfigurationReader.getProperty(userName));
        inputPassword.sendKeys(ConfigurationReader.getProperty("pw"));
        loginButton.click();
    }
    public void HR_Login1(String username) {
        userLogin("hr1");
    }
    public void helpdesk_Login1() {
        userLogin("helpdesk1");
    }

    public void marketing_Login1() {
        userLogin("marketing1");
    }

    public void HR_Login2(String username) {
        userLogin("hr2");
    }

    public void helpdesk_Login2() {
        userLogin("helpdesk2");
    }

    public void marketing_Login2() {
        userLogin("marketing2");
    }


}