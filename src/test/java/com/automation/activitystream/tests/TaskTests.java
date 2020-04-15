package com.automation.activitystream.tests;

import com.automation.activitystream.pages.LoginPage;
import com.automation.activitystream.pages.TaskPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskTests extends TestBase{
/**
 *  "2. As a user, I should be able to assignn tasks by clicking on Task tab under Active Stream."
 *  AC "1. User should be able to click on ""High Priority"" checkbox to set the current task to a top priority task.
 */

    @Test
    public void periorityCheckBox(){
    test=report.createTest("Click on high periority checkbox");
        LoginPage loginPage=new LoginPage();
        loginPage.login();

        TaskPage taskPage=new TaskPage();
        taskPage.navigateTo("Task");
        taskPage.clickOnCheckBox();
        Assert.assertTrue(taskPage.checkBox().isSelected());
        test.pass("User succesfully clicked periority checkbox");

    }
}
