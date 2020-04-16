package com.automation.activitystream.tests;

import com.automation.activitystream.pages.UploadingFilePage;
import org.testng.annotations.Test;

public class UploadingFileTest extends TestBase {

    @Test
    public void uplFile(){
        test=report.createTest("File Uploader");
    UploadingFilePage file = new UploadingFilePage();
    file.moreClickMetod();
    file.fileClickMethod();
    file.uploadClickMethod();

    test.pass("File uploaded successfully");
}

}
