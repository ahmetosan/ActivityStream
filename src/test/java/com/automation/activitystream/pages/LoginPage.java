package com.automation.activitystream.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        //to connect our webdriver, page class and page factory
        //PageFactory - used to use @FindBy annotations
        //PageFactory - helps to find elements easier
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[name='USER_LOGIN']")
    private WebElement userEmail;

    @FindBy(css = "[name='USER_PASSWORD']")
    private  WebElement password;

    @FindBy(css = "[value='Log In']")
    public WebElement logInButton;

    /**
     * Method to login, version #1
     * Login as a default user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login(){
        userEmail.sendKeys(ConfigurationReader.getProperty("help1"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.waitForPageToLoad(12);

        logInButton.click();

    }
    /**
     * Method to login, version #2
     * Login as a specific user
     *
     * @param userEmailValue
     * @param passwordValue
     */
    public void login(String userEmailValue, String passwordValue){
        userEmail.sendKeys(userEmailValue);
        password.sendKeys(passwordValue);
        logInButton.click();


    }



}
