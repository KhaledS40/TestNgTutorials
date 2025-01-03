package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumIDETestLink {

    public WebDriver driver;

    public SeleniumIDETestLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Selenium IDE Test']")
    WebElement seleniumIDETest;



    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickSeleniumIDELink(){

        seleniumIDETest.click();
    }
}
