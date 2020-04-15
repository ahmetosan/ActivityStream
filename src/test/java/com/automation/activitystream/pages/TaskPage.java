package com.automation.activitystream.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class TaskPage extends PageBase {

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement periorityCheckBox;

    @FindBy(id="feed-add-post-form-tab-tasks")
    protected WebElement task;

    @FindBy(css = "[class='task-options-destination-wrap date']")
    protected WebElement deadLine;

    @FindBy(css = "[class='bx-calendar-month-content']")
    protected WebElement months;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    protected WebElement visualEditor;

    @FindBy(id="bx-html-editor-tlbr-lifefeed_task_form")
    protected WebElement textBar;

    public void clickOnCheckBox(){
        BrowserUtils.waitForPageToLoad(15);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("feed-add-post-form-tab-tasks")));
       wait.until(ExpectedConditions.elementToBeClickable(periorityCheckBox)).click();
    }

    public void clickOnVisualEditor(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("feed-add-post-form-tab-tasks")));
        wait.until(ExpectedConditions.elementToBeClickable(visualEditor)).click();
    }
    public WebElement getTextBar() {
        return textBar;
    }


        public void clickOnDeadLine(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("feed-add-post-form-tab-tasks")));
        wait.until(ExpectedConditions.elementToBeClickable(deadLine)).click();
        List<WebElement>months=driver.findElements(By.cssSelector("[class='bx-calendar-month-content']"));
        months.get(3).click();

//        Random random=new Random();
//        int randomMonth=random.nextInt(11);
//        months.get(randomMonth).click();


    }
    public WebElement deadLineBox(){
        return deadLine;
    }
    public String getCurrentDate(String format) {
        return LocalDate.now().format(DateTimeFormatter.ofPattern(format));
    }

    public void enterADate(){
        List<WebElement>months=driver.findElements(By.cssSelector("[class='bx-calendar-month-content']"));
        months.get(3).click();
    }
    public WebElement checkBox(){
        return periorityCheckBox;
    }


}
