package com.automation.activitystream.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);



     @FindBy (id = "search-textbox-input")
    protected WebElement searchBox;

    @FindBy(id = "user-block")
    protected WebElement currentUser;

    @FindBy(id = "feed-add-post-form-tab-message")
    protected WebElement message;


    public PageBase(){
        PageFactory.initElements(driver,this);

    }
     public void navigateTo(String tabName) {
           String tabNameXpath = "//span[@class='feed-add-post-form-link' and contains(text(),'" + tabName + "')]";
           wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(tabNameXpath)))).click();
    }
    public void navigateToMessage(String messageTab){
        BrowserUtils.waitForPageLoad(10);
        String messagesTab="//span[@class='feed-add-post-form-link feed-add-post-form-link-active' and contains(text(),'"+messageTab+"')]";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(messageTab)))).click();
    }

    /**
     * This method will run search function based on provided String value
     * @param value accepts String value
     */
    public void search(String value){
        BrowserUtils.waitForPageLoad(10);
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(value, Keys.ENTER);
    }
    /**
     * This method returns Current User Name
     * @return user name as String value
     */
    public String getCurrentUSerName(){
        BrowserUtils.waitForPageLoad(10);
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return currentUser.getText().trim();
    }
}
