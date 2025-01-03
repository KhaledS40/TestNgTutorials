package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.FileUploadUsingSikuliDemoLink;

public class FileUploadDemo extends BaseTest {

    FileUploadUsingSikuliDemoLink file;

    @Test
    public void UploadFIle(){

        file = new FileUploadUsingSikuliDemoLink(driver);

        file.clickSeleniumTab();
        file.hoverAndClickFileUploadDemo();
        file.chooseFile();
    }
}
