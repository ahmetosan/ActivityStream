package com.automation.activitystream.tests;

import com.automation.activitystream.pages.LoginPage;
import com.automation.activitystream.pages.UserStory7Pages;
import org.testng.annotations.Test;

public class UserStory7Test extends TestBase{

    @Test
    public void UserStory7Test(){
        test = report.createTest("Test More Announcement and Quote");
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        UserStory7Pages georgePage = new UserStory7Pages();
        georgePage.ClickOnMore();
        georgePage.Announcement();
        georgePage.Quote();
        georgePage.InputQuote();

    }

}
