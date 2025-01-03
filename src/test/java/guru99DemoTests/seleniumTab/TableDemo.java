package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.TableDemoLink;

public class TableDemo extends BaseTest {

    TableDemoLink table;

    @Test
    public void testTableDemoLink(){

        table = new TableDemoLink(driver);

        table.clickSeleniumTab();
        table.clickTableDemoLink();
        table.countRows();
        table.countColumns();
    }
}
