package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.AccessingLink;

public class AccessingLinkTest extends BaseTest {

    AccessingLink accessing;

    @Test(testName = "AccessLink")
    public void testAccessingLink(){

        accessing = new AccessingLink(driver);

        accessing.clickSeleniumTab();
        accessing.clickAccessingLink();
        accessing.clickGoogleLink();
        accessing.insertTextInSearchField();
    }
}
