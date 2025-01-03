package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsideOutSideBlockLevelTag {

    public WebDriver driver;

    public InsideOutSideBlockLevelTag(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Inside & Outside Block Level Tag']")
    WebElement insideOutsideLink;

    @FindBy(css = "a[href='http://www.google.com']")
    WebElement insideBlockLevelLink;

    @FindBy(xpath = "//span[normalize-space()='Outside a block-level tag.']")
    WebElement outsideBlockLevelLink;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickInsideOutsideBlockLink(){

        insideOutsideLink.click();
    }

    public void clickInsideBlockLevel(){

        insideBlockLevelLink.click();
        driver.navigate().back();
    }

    public void clickOutsideBlockLevel(){

        outsideBlockLevelLink.click();
        driver.navigate().back();
    }
}
