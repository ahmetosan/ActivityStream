package com.automation.activitystream.tests;

import com.automation.activitystream.pages.LoginPage;
import com.automation.activitystream.pages.TaskPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskTests extends TestBase{


/**
 * Neslihan
 * User Story:
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

    /**
     * Neslihan
     * 2. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
     */

    @Test
    public void textBarIsDisplayed(){
        test=report.createTest("Verify if editor text-bar is displayed");
        LoginPage loginPage=new LoginPage();
        loginPage.login();

        TaskPage taskPage=new TaskPage();
        taskPage.navigateTo("Task");
        taskPage.clickOnVisualEditor();
        Assert.assertTrue(taskPage.getTextBar().isDisplayed());
        test.pass("User succesfully clicked on visual editor and system displayed editor text-bar");
    }

//    @Test
//    public void getCurrentDeadLine(){
//        LoginPage loginPage=new LoginPage();
//        loginPage.login();
//        TaskPage taskPage=new TaskPage();
//        taskPage.navigateTo("Task");
//        taskPage.clickOnDeadLine();
//        System.out.println( taskPage.getCurrentDate("MMMM,d yyyy"));
//
//
//    }
}
