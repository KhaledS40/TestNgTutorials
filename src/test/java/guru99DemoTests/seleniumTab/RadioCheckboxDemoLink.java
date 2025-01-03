package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.RadioAndCheckboxLink;

public class RadioCheckboxDemoLink extends BaseTest {

    RadioAndCheckboxLink radio;

    @Test
    public void testRadioCheckBoxDemo(){

        radio = new RadioAndCheckboxLink(driver);

        radio.clickSeleniumTab();
        radio.hoverAnClickRadioCheckBoxLink();
        radio.checkOption1();
        radio.checkOption3();
        radio.clickCheckBox1();
        radio.clickCheckBox3();
    }
}
