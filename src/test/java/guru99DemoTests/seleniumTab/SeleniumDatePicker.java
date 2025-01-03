package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.SeleniumDatePickerDemoLink;

public class SeleniumDatePicker extends BaseTest {

    SeleniumDatePickerDemoLink sel ;

    @Test
    public void seleniumDatePicker(){

        sel = new SeleniumDatePickerDemoLink(driver);

        sel.clickSeleniumTab();
        sel.hoverAndClickSeleniumDatePickerDemo();
        sel.clickBirthDateAndTime();
        sel.clickSubmitButton();
        sel.getConfirmText();
    }
}
