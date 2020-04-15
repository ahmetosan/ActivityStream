package com.automation.activitystream.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserUtils;

public class TaskPage extends PageBase {

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement periorityCheckBox;

    @FindBy(id="feed-add-post-form-tab-tasks")
    protected WebElement task;

    public void clickOnCheckBox(){
        BrowserUtils.waitForPageToLoad(15);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("feed-add-post-form-tab-tasks")));
       wait.until(ExpectedConditions.elementToBeClickable(periorityCheckBox)).click();
    }
    public void taskDeadLine(){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("feed-add-post-form-tab-tasks")));

    }
    public WebElement checkBox(){
        return periorityCheckBox;
    }

}
