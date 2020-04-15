package com.automation.activitystream.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

import javax.swing.text.html.CSS;

import static org.testng.Assert.assertEquals;


public class JeanHidalgoStory3 {

    private WebDriver driver;
    private String url = "https://login1.nextbasecrm.com";
    private String username = "helpdesk47@cybertekschool.com";
    private String password = "UserUser";
    private By userLog = By.name("USER_LOGIN");
    private By userPass = By.name("USER_PASSWORD");

    @Test(description = "Login as helpdesk47")
    public void testNumber3(){


    }
}