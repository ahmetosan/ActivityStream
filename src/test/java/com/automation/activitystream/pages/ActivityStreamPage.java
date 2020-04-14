package com.automation.activitystream.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ActivityStreamPage extends PageBase{



    @FindBy(css = "[id='feed-add-post-form-link-text']")
    private WebElement moreButton;

    @FindBy(xpath = "//span[@class='menu-popup-item-text' and text()='Announcement']")
    private WebElement announcement;

    @FindBy(css = "[class='bx-editor-iframe']")
    private WebElement announcementIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    private WebElement announcementTextBox;

    private String sendingText = "Announcement was sent";

    @FindBy(css = "[id='blog-submit-button-save']")
    private WebElement sendButton;



public String getAnnounceMessage(){
    String result = enteringText();
    String messageXpath = "//div[@class='feed-post-text-block feed-info-block']//div[text()='"+result+"']";

    WebElement msg = driver.findElement(By.xpath(messageXpath));

    return msg.getText();
}


    public void clickMoreButton(){
        BrowserUtils.waitForPageToLoad(12);
        moreButton.click();
    }

    public void clickAnnouncement(){
        BrowserUtils.waitForPageToLoad(12);
        Actions actions = new Actions(driver);
        BrowserUtils.wait(1);
        actions.moveToElement(announcement).perform();
        BrowserUtils.wait(1);
        announcement.click();

    }

    public String enteringText(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        String sendWord = "Hasan"+dtf.format(now);

        return sendWord;
    }

    public void sendTextAnnouncement(){
        driver.switchTo().frame(announcementIframe);
        BrowserUtils.waitForPageToLoad(12);
        announcementTextBox.sendKeys(enteringText());

        BrowserUtils.waitForPageToLoad(12);

        driver.switchTo().defaultContent();
        BrowserUtils.waitForPageToLoad(12);

    }

    public void clickSendBtnAnnouncement(){
        sendButton.click();
        BrowserUtils.wait(2);
    }


}
