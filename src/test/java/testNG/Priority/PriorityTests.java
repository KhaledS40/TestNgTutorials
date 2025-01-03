package testNG.Priority;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.AjaxDemoLink;
import pageFactory.SeleniumTab.DeleteCustomerFormLink;
import pageFactory.SeleniumTab.InsideOutSideBlockLevelTag;
import pageFactory.SeleniumTab.TooltipLink;

public class PriorityTests extends BaseTest {

    /*
        . Prioritization helps you to run the tests based on priority, if there are multiple test cases and you
        you wanna run them in a prioritized way, you wan use priority. as shown below
     */

    AjaxDemoLink ajax;
    InsideOutSideBlockLevelTag inside;
    TooltipLink tool;
    DeleteCustomerFormLink customer;

    @Test (priority = 0)
    public void testAjaxLink(){

        ajax = new AjaxDemoLink(driver);
        ajax.clickSeleniumTab();
        ajax.hoverAndClickAjaxDemo();
        ajax.clickYesBox();
        ajax.clickNoBox();
        ajax.clickCheckButton();
        ajax.clickResetButton();
    }

    @Test(priority = 1)
    public void testInsideBlockLevel(){

        inside = new InsideOutSideBlockLevelTag(driver);
        inside.clickSeleniumTab();
        inside.hoverAndClickInsideOutsideBlockLink();
        inside.clickInsideBlockLevel();
        inside.clickOutsideBlockLevel();
    }

    @Test(priority = 3)
    public void testTooltip(){

        tool = new TooltipLink(driver);
        tool.clickSeleniumTab();
        tool.hoverAndClickTooltipLink();
        tool.clickStandAloneText();
    }

    @Test(priority = 2)
    public void testCustomerForm() throws InterruptedException {

        customer = new DeleteCustomerFormLink(driver);
        customer.clickSeleniumTab();
        customer.hoverAndClickCustomerForm();
        customer.sendTextInCustomerField();
        customer.clickResetButton();
        customer.clickSubmitButton();
    }
}
