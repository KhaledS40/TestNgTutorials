package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TooltipLink {

    public WebDriver driver;

    public TooltipLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Tooltip']")
    WebElement toolTipLink;

    @FindBy(xpath = "//a[normalize-space()='standalone demo']")
    WebElement standAloneText;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickTooltipLink(){

        toolTipLink.click();
    }

    public void clickStandAloneText(){

        standAloneText.click();
    }
}
