package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // search box which leads to conversations
    @FindBy(xpath = "//div[@class='bx-im-search bx-im-border-b']")
    public WebElement searchBox;

    // conversationSearchBox
    @FindBy(xpath = "//div[@title='Search employees and chats']")
    public WebElement conversationSearchBox;

    // message window
    @FindBy(xpath = "//div[@class='bx-messenger-body-bg']")
    public WebElement messageBody;

    //ItemSearch
    @FindBy(xpath = "//input[@name='q']")
    public WebElement itemSearch;

    // search item assersion
    @FindBy(xpath = "(//div[@class='search-title-top-subtitle-text'])[2]")
    public WebElement itemPageAssertion;


    @FindBy(xpath = "(//div[.='Groups'])[2]")
    public WebElement groupSearchAssertion;


}
