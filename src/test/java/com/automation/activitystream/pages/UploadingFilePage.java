package com.automation.activitystream.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadingFilePage extends PageBase {

    @FindBy(xpath = "//span[@class='feed-add-post-more-icon']")
    private WebElement moreClick;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    private WebElement fileClick;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title'])[1]")
    private WebElement uploadClick;


    public void moreClickMetod() {
        moreClick.click();
    }

    public void fileClickMethod() {
        fileClick.click();
    }

    public void uploadClickMethod() {
        uploadClick.sendKeys("C:\\Users\\Ayah\\Documents\\First Project.xlsx");
    }


}
