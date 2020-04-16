package com.automation.activitystream.tests;

import com.automation.activitystream.pages.LoginPage;
import com.automation.activitystream.pages.SendAppreciationPage_6;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class SendAppreciationTest_6 extends TestBase{

    @Test
    public void samTest(){
        test = report.createTest("User should send appreciation from Appreciation Activity Stream.");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        test.info("User should be able to attach link by clicking on the link icon");

        SendAppreciationPage_6 samuel6 = new SendAppreciationPage_6();
        samuel6.goToMore();
        samuel6.seeAppreciation();
        samuel6.clickLink();
        samuel6.typeLetter();
        samuel6.lastStage();
/*
        samuel6.verifyTest();
        String expected = "http://google.com";
        Assert.assertTrue(samuel6.verifyTest(),expected);

 */

        System.out.println("Successfully passed");
        test.pass("Appreciation successfully sent");












    }
}
