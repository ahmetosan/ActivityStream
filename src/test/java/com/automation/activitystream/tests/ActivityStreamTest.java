package com.automation.activitystream.tests;

import com.automation.activitystream.pages.ActivityStreamPage;
import com.automation.activitystream.pages.LoginPage;
import org.testng.annotations.Test;

public class ActivityStreamTest extends TestBase{

    @Test
    public void ClickMoreUnderActivityStreamAnnouncement(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.clickMoreButton();
        activityStreamPage.clickAnnouncement();


    }
}
