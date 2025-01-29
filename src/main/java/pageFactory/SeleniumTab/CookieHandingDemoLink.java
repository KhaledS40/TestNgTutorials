package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookieHandingDemoLink {

    public WebDriver driver;

    public CookieHandingDemoLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Cookie Handling Demo']")
    WebElement cookieHandlingDemo;

    @FindBy(name = "username")
    WebElement userUserName;

    @FindBy(name = "password")
    WebElement userPassword;

    @FindBy(name = "submit")
    WebElement loginButton;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void clickCookieHandlingDemo(){

        cookieHandlingDemo.click();
    }

    public void enterUsername(String userName){

        userUserName.sendKeys("Hello");
    }

    public void enterPassword(String password){

        userPassword.sendKeys("Baby123");
    }

    public void clickLoginButton(){

        loginButton.click();
    }
}
