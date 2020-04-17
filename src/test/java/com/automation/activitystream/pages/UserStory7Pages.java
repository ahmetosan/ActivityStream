package com.automation.activitystream.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserUtils;
import utilities.Driver;

public class UserStory7Pages extends PageBase {
    ////span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote bxhtmled-top-bar-btn-active']/i
    public UserStory7Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='feed-add-post-form-link-text']")
    private WebElement More;
    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[3]")
    private WebElement Announcement;
    @FindBy(xpath = "//*[@id='bx-b-quote-blogPostForm']/span/i")
    private WebElement Quote;

    @FindBy(xpath = "/html/body/blockquote/blockquote/blockquote/blockquote")
    private WebElement InputQuote;


    public void ClickOnMore() {
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.visibilityOf(More));
        More.click();
    }

    public void Announcement() {
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.visibilityOf(Announcement));
        Announcement.click();
    }

    public void Quote() {
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.visibilityOf(Quote));
        Quote.click();

    }

    public void InputQuote() {
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.visibilityOf(InputQuote));
        BrowserUtils.wait(5);
        InputQuote.sendKeys("all is well");
    }
}