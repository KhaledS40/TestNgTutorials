package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooLink {

    public WebDriver driver;

    public YahooLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Yahoo']")
    WebElement yahooLink;

    @FindBy(css = "#pager2")
    WebElement gameHeader;

    @FindBy(css = "#pager3")
    WebElement faceBookHeader;

    @FindBy(css = "#pager4")
    WebElement socialHeader;

    @FindBy(css = "#pager5")
    WebElement mobileHeader;

    @FindBy(css = "#pager6")
    WebElement alwaysOnHeader;

    @FindBy(css = "#pager7")
    WebElement allInOnHeader;

    @FindBy(css = "#pager1")
    WebElement burstingWithFunHeader;

    @FindBy(css = "#messenger-download")
    WebElement downloadLink;



    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickYahooLink(){

        yahooLink.click();
    }

    public void clickGamesHeader(){

        gameHeader.click();
    }

    public void clickFacebookHeader(){

        faceBookHeader.click();
    }

    public void clickSocialHeader(){

        socialHeader.click();
    }

    public void clickMobileHeader(){

        mobileHeader.click();
    }

    public void clickAlwaysOnHeader(){

        alwaysOnHeader.click();
    }

    public void clickAllInOneHeader(){

        allInOnHeader.click();
    }

    public void clickBurstingWithFunHeader(){

        burstingWithFunHeader.click();
    }

    public void clickDownloadHeader(){

        downloadLink.click();
    }
}
