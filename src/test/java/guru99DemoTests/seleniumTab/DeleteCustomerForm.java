package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.DeleteCustomerFormLink;

public class DeleteCustomerForm extends BaseTest {

    DeleteCustomerFormLink customer;

    @Test
    public void testCustomerForm() throws InterruptedException {

        customer = new DeleteCustomerFormLink(driver);

        customer.clickSeleniumTab();
        customer.hoverAndClickCustomerForm();
        customer.sendTextInCustomerField();
        customer.clickResetButton();
        customer.clickSubmitButton();
    }
}
