package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.SocialIconLink;

public class SocialIcon extends BaseTest {

    SocialIconLink social;

    @Test
    public void testSocialIcon() {
        social = new SocialIconLink(driver);

        social.clickSeleniumTab();
        social.hoverAndClickSocialIcon();
        social.clickEmailLink();
        social.clickGoogleLink();
        social.clickYoutubeLink();
        social.clickGitlabLink();
        social.clickFaceBookLink();
        social.clickWifiLink();
    }
}
