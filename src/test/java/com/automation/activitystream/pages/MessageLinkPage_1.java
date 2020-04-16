package com.automation.activitystream.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserUtils;
import utilities.Driver;

public  class MessageLinkPage_1 extends PageBase {

public MessageLinkPage_1(){
    PageFactory.initElements(Driver.getDriver(),this);
}


    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement MessageClick;
    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm']//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    private WebElement Link;
    @FindBy(css = "#linkidPostFormLHE_blogPostForm-href")
    private WebElement urlLink;
    @FindBy(css = ".adm-btn-save")
    private WebElement saveBtn;


    public void goToMessage(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(MessageClick));
        MessageClick.click();

    }

    public void clickLink(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(Link));
        Link.click();

    }

    public void textInputUrlLink (){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(urlLink));
        urlLink.sendKeys("http://bcc.com");

    }

    public void  clickSave  (){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
       saveBtn.click();

    }







}
