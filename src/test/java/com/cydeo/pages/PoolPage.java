package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoolPage {
    public PoolPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Poll']")
    public WebElement poolButton;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMoreButton;



}
