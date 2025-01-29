package testNG.Regression;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.AccessingLink;
import pageFactory.SeleniumTab.FlashMovieDemoLink;
import pageFactory.SeleniumTab.RadioAndCheckboxLink;
import pageFactory.SeleniumTab.TableDemoLink;

public class SeleniumTabLinksTests extends BaseTest {

    // Groups with Example
    /*
        . We don’t want to define test methods separately in different classes (depending upon functionality) and
        . At the same time want to ignore (not execute) some test cases as if they do not exist in the code.
        . So to carry out this we have to Group them. This is done by using the “include” and “exclude” mechanisms supported in testNG.
        . Here we are using 2 group names i.e. “bonding” and “strong_ties” (these are the logical names that can be altered as per your wish).
        . <groups> tag defines the starting of groups in XML.
        . Customize your XML to pick the mentioned group from the test classes. Below mentioned is the syntax of how to declare groups in an XML file e.g.
        . So, let us assume that there are 10 test methods in a class.
     */


    AccessingLink accessing;
    FlashMovieDemoLink flash;
    RadioAndCheckboxLink radio;
    TableDemoLink table;

    @Test()
    public void AccessingLinkTests(){

        accessing = new AccessingLink(driver);
        accessing.clickSeleniumTab();
        accessing.clickAccessingLink();
        accessing.clickGoogleLink();
        accessing.insertTextInSearchField();
    }

    @Test()
    public void FlashDemoLinkTests(){

        flash = new FlashMovieDemoLink(driver);

        flash.clickSeleniumTab();
        flash.hoverAndClickFlashDemoLink();
        flash.clickPlay();
        flash.clickStop();
        flash.clickZoomIn();
        flash.clickZoomOut();
    }

    @Test()
    public void RadioCheckBoxLinkTests() {

        radio = new RadioAndCheckboxLink(driver);
        radio.clickSeleniumTab();
        radio.hoverAnClickRadioCheckBoxLink();
        radio.checkOption1();
        radio.checkOption3();
        radio.clickCheckBox1();
        radio.clickCheckBox3();
    }

    @Test()
    public void TableDemoLinkTests(){

        table = new TableDemoLink(driver);
        table.clickSeleniumTab();
        table.clickTableDemoLink();
        table.countRows();
        table.countColumns();
    }
}
