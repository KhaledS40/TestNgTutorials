package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialIconLink {

    public WebDriver driver;

    public SocialIconLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Social Icon']")
    WebElement socialIconLink;

    @FindBy(css = ".fa.fa-lg.fa-envelope")
    WebElement emailIcon;

    @FindBy(css = ".fa.fa-lg.fa-google")
    WebElement googleIcon;

    @FindBy(xpath = "//a[@class='fa fa-lg fa-youtube']")
    WebElement youtubeLink;

    @FindBy(css = "div[class='socialbtns'] div a[title='Github']")
    WebElement gitLabIcon;

    @FindBy(css = ".fa.fa-lg.fa-facebook")
    WebElement faceBookIcon;

    @FindBy(css = ".fa.fa-lg.fa-rss")
    WebElement wifiIcon;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickSocialIcon(){

        socialIconLink.click();
    }

    public void clickEmailLink(){

        emailIcon.click();
        driver.navigate().back();
    }

    public void clickGoogleLink(){

        googleIcon.click();
        driver.switchTo().defaultContent();
    }

    public void clickYoutubeLink(){

        youtubeLink.click();
        driver.switchTo().defaultContent();
        System.out.println("this is inside youtubeLink");
    }

    public void clickGitlabLink(){

        gitLabIcon.click();
        driver.navigate().back();
    }

    public void clickFaceBookLink(){

        faceBookIcon.click();
        driver.switchTo().defaultContent();
    }

    public void clickWifiLink(){

        wifiIcon.click();
        driver.switchTo().defaultContent();
    }
}
