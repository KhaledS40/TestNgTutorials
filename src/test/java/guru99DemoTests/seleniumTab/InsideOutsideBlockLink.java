package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.InsideOutSideBlockLevelTag;

public class InsideOutsideBlockLink extends BaseTest {

    InsideOutSideBlockLevelTag inside;

    @Test
    public void testInsideOutsideBlock(){

        inside = new InsideOutSideBlockLevelTag(driver);

        inside.clickSeleniumTab();
        inside.hoverAndClickInsideOutsideBlockLink();
        inside.clickInsideBlockLevel();
        inside.clickOutsideBlockLevel();
    }
}
