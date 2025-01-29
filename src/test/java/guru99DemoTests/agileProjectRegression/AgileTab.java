package guru99DemoTests.agileProjectRegression;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.AgileProjectTab.AgileProjectTab;

public class AgileTab extends BaseTest {

    AgileProjectTab agile;

    @Test
    public void testAgileProject(){

        agile = new AgileProjectTab(driver);
        agile.clickAgileProject();
        agile.enterUserID();
        agile.enterUserPassword();
        agile.clickLogin();
        agile.clickCustomerTab();
        agile.clickMiniStatementTab();
        agile.selectUserAccount();
        agile.clickHomeButton();
        agile.clickLogout();
    }
}
