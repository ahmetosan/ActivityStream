package com.automation.activitystream.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class UserStory3 {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);



    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    protected WebElement commentBoxClicked;



}
