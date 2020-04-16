package com.automation.activitystream.tests;

import com.automation.activitystream.pages.ActivityStreamPage;
import com.automation.activitystream.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivityStreamTest extends TestBase{

    @Test
    public void ClickMoreUnderActivityStreamAnnouncement(){
        test = report.createTest("send announcement from Announcement Activity Stream.");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        test.info("Login as a helpdesk47");


        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.clickMoreButton();
        activityStreamPage.clickAnnouncement();
        activityStreamPage.sendTextAnnouncement();
        activityStreamPage.clickSendBtnAnnouncement();
        String actual = activityStreamPage.getAnnounceMessage();
        actual=actual.substring(0,actual.indexOf("\n"));

        Assert.assertEquals(actual,activityStreamPage.enteringText());
        test.pass("User successfully sent announcement from Announcement subheading from \"More\" under Activity Stream. ");

    }


}
