package pageFactory.SeleniumTab;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessingLink {

    public WebDriver driver;

    public AccessingLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Accessing Link']")
    WebElement accessingLink;

    @FindBy(css = "a[href='http://www.google.com']")
    WebElement googleLink;

    @FindBy(css = "#APjFqb")
    WebElement searchBox;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void clickAccessingLink(){

        accessingLink.click();
    }

    public void clickGoogleLink(){

        googleLink.click();
    }

    public void insertTextInSearchField(){

        searchBox.clear();
        searchBox.sendKeys("Starbucks");
        searchBox.sendKeys(Keys.TAB);
    }
}
