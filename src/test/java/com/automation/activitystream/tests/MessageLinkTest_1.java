package com.automation.activitystream.tests;

import com.automation.activitystream.pages.LoginPage;
import com.automation.activitystream.pages.MessageLinkPage_1;
import org.testng.annotations.Test;

public class MessageLinkTest_1 extends TestBase{


    @Test
    public  void MohTest(){
        test = report.createTest("More appreciation Test");
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        MessageLinkPage_1 mohammed1 = new MessageLinkPage_1();
        mohammed1.goToMessage();
        mohammed1.clickLink();
        mohammed1.textInputUrlLink();
        mohammed1.clickSave();





    }

}
