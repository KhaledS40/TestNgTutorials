package pageFactory.SeleniumTab;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollbarDemoLink {

    public WebDriver driver;

    public ScrollbarDemoLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Scrollbar Demo']")
    WebElement scrollBarDemoLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div")
    WebElement sapMMLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div[1]/div/div")
    WebElement accountingLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[1]/div[3]/div/div/div/div/div[1]/div/div")
    WebElement liveTestingLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[1]/div[4]/div/div/div/div/div[1]/div/div")
    WebElement mobileTestingLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[1]/div[5]/div/div/div/div/div[1]/div/div")
    WebElement ethicalHackingLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[1]/div[6]/div/div/div/div/div[1]/div/div")
    WebElement vbScriptLink;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickScrollBarDemo(){

        scrollBarDemoLink.click();
    }

    public void clickSAPMMLink(){

        sapMMLink.click();
        driver.navigate().back();
    }

    public void clickAccountingLink(){

        accountingLink.click();
        driver.navigate().back();
    }

    public void clickLiveTestingLink(){

        liveTestingLink.click();
        driver.navigate().back();
    }

    public void clickMobileTestingLink(){

        // Using java script execute to scroll page horizontal

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'center'});", mobileTestingLink);
        mobileTestingLink.click();
        driver.navigate().back();
    }

    public void clickEthicalLink(){

        ethicalHackingLink.click();
        driver.navigate().back();
    }

    public void clickVBScriptLink(){

        vbScriptLink.click();
        driver.navigate().back();
    }
}
