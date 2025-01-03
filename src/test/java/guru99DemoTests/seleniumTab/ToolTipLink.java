package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.TooltipLink;

public class ToolTipLink extends BaseTest {

    TooltipLink tool;

    @Test
    public void testToolTip(){

        tool = new TooltipLink(driver);

        tool.clickSeleniumTab();
        tool.hoverAndClickTooltipLink();
        tool.clickStandAloneText();
    }
}
