package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.FileUploadLink;

public class UpLoadFIle extends BaseTest {

    FileUploadLink file;

    @Test
    public void uploadFile(){

        file = new FileUploadLink(driver);

        file.clickSeleniumTab();
        file.hoverAndClickFileUploadLink();
        file.clickChooseFile();
        file.selectTermsCheckBox();
        file.clickSubmitButton();
        file.getConfirmationText();
    }
}
