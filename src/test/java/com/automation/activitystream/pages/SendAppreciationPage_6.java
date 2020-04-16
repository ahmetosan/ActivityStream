package com.automation.activitystream.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserUtils;
import utilities.Driver;

public class SendAppreciationPage_6 extends PageBase {

    public SendAppreciationPage_6(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='feed-add-post-form-link-text']")
    private WebElement More;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    private WebElement Appreciation;

    @FindBy(xpath = "(//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link'])[1]")//span[@id='bx-b-link-blogPostForm']//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    private WebElement Link;

    @FindBy(css = "#linkidPostFormLHE_blogPostForm-href")
    private WebElement urlLing;

    @FindBy(css = ".adm-btn-save")
    private WebElement saveBtn;

    @FindBy(xpath = "/html/body/a")    //"//a[@title='true']")  //"//iframe[@class='bx-editor-iframe']") //"body:nth-child(2) > a:nth-child(1)"      )   //"//body[@contenteditable='true']/a") //"//div[@class='workarea-content-paddings']")        //"//body[contains(text(),'https:')]")
    private WebElement textMessage;





    public  void goToMore(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(More));
        More.click();

    }
    public void seeAppreciation(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(Appreciation));
        Appreciation.click();

    }
    public void clickLink(){
        BrowserUtils.waitForPageToLoad(30);
        wait.until(ExpectedConditions.elementToBeClickable(Link));
        BrowserUtils.wait(5);
        Link.click();


    }
    public  void typeLetter(){
        BrowserUtils.waitForPageToLoad(30);
        wait.until(ExpectedConditions.visibilityOf(urlLing));
        BrowserUtils.wait(5);
         urlLing.sendKeys("https:// google.com");

    }
    public void lastStage(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
        BrowserUtils.wait(5);
        saveBtn.click();


    }

    public boolean verifyTest(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(textMessage));
        textMessage.isDisplayed();

        return true;



    }

}

