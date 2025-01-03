package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlashMovieDemoLink {

    private WebDriver driver;

    public FlashMovieDemoLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Flash Movie Demo']")
    WebElement flashMovieDemoLink;

    @FindBy(css = "input[value='Play']")
    WebElement playLink;

    @FindBy(css = "input[value='Stop']")
    WebElement stopLink;

    @FindBy(css = "input[value='Zoomin']")
    WebElement zoomInLink;

    @FindBy(css = "input[value='Zoomout']")
    WebElement zoomOutLink;

    public void goTo(){

        driver.get("https://demo.guru99.com/test/flash-testing.html");
    }

    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickFlashDemoLink(){

        Actions action = new Actions(driver);
        action.moveToElement(flashMovieDemoLink).build().perform();
        flashMovieDemoLink.click();
    }

    public void clickPlay(){

        playLink.click();
    }

    public void clickStop(){

        stopLink.click();
    }

    public void clickZoomIn(){

        zoomInLink.click();
    }

    public void clickZoomOut(){

        zoomOutLink.click();
    }
}
