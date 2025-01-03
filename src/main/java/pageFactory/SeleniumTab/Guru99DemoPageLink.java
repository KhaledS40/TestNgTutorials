package pageFactory.SeleniumTab;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Guru99DemoPageLink {

    public WebDriver driver;

    public Guru99DemoPageLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(css = "a[href='../../test/guru99home/']")
    WebElement guru99Link;

    @FindBy(xpath= "//button[@title='Play']")
    WebElement playVideo;

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

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div")
    WebElement seleniumLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div")
    WebElement javaLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div")
    WebElement qtpLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[2]/div[4]/div/div/div/div/div[1]/div/div")
    WebElement sapBeginnersLink;

    @FindBy(xpath = "//*[@id='rt-feature']/div/div[1]/div/div/div/div[2]/div[5]/div/div/div/div/div[1]/div/div")
    WebElement linuxLink;

    @FindBy(css = "#philadelphia-field-email")
    WebElement emailBox;

    @FindBy(css = "#philadelphia-field-submit")
    WebElement submitButton;

    @FindBy(css = "#awf_field-91977689")
    WebElement courseSelection;


    

    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickGuru99(){

        guru99Link.click();
    }

    public void clickVideo() throws InterruptedException {

        playVideo.click();
        Thread.sleep(5000);
        playVideo.click();
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

    public void clickSeleniumLink(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", seleniumLink);
        seleniumLink.click();
        driver.navigate().back();
        System.out.println("this is inside Selenium method");
    }

    public void clickJAVALink(){

        javaLink.click();
        driver.navigate().back();
    }

    public void clickQTPlink(){

        qtpLink.click();
        driver.navigate().back();
    }

    public void clickSAPBeginnerLink(){

        sapBeginnersLink.click();
        driver.navigate().back();
    }

    public void clickLinuxLink(){

        linuxLink.click();
        driver.navigate().back();
    }

    public void enterEmail(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", emailBox);
        emailBox.sendKeys("mike.bob@gmail.com");
    }

    public void clickCourseSelection(){

        courseSelection.click();
        Select s = new Select(courseSelection);
        s.selectByVisibleText("SAP Basis");
    }

    public void clickSubmit(){

        submitButton.click();
        driver.switchTo().alert().accept();
    }
}
