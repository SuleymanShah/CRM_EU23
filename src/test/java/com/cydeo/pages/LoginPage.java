package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public void loginWithConfig() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("un"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("pw"));
        loginButton.click();
    }


}
