package com.automation.activitystream.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtils;
import utilities.Driver;

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
        BrowserUtils.waitForPageToLoad(10);
        String tabNameXpath = "//span[contains(@class,'feed-add-post-form-')]/span[text()='"+tabName+"']";
        if(tabName.equals("File")|| tabName.equals("Appreciation") || tabName.equals("Announcement") || tabName.equals("Workflow")){
            WebElement moreTab = driver.findElement(By.cssSelector("[id=\"feed-add-post-form-link-more\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(moreTab)).click();
        }
        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        wait.until(ExpectedConditions.elementToBeClickable(tabElement)).click();
        BrowserUtils.wait(4);
    }

    /**
     * This method will run search function based on provided String value
     * @param value accepts String value
     */
    public void search(String value){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(value, Keys.ENTER);
    }
    /**
     * This method returns Current User Name
     * @return user name as String value
     */
    public String getCurrentUSerName(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return currentUser.getText().trim();
    }
}
