package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.FlashMovieDemoLink;

public class FlashMovieDemo extends BaseTest {

    FlashMovieDemoLink flash;

    @Test
    public void testFlashDemo(){

        flash = new FlashMovieDemoLink(driver);

        flash.clickSeleniumTab();
        flash.hoverAndClickFlashDemoLink();
        flash.clickPlay();
        flash.clickStop();
        flash.clickZoomIn();
        flash.clickZoomOut();
    }
}
