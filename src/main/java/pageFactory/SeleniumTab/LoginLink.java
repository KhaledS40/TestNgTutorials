package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLink {

    public WebDriver driver;

    public LoginLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement loginLink;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickLoginLink(){

        loginLink.click();
    }
}
