package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxDemoLink {

    public WebDriver driver;

    public AjaxDemoLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Ajax Demo']")
    WebElement ajaxDemoLink;

    @FindBy(css = "#yes")
    WebElement yesCheckBox;

    @FindBy(css = "#no")
    WebElement noCheckBox;

    @FindBy(css = "#buttoncheck")
    WebElement checkButton;

    @FindBy(css = "input[value='Reset']")
    WebElement resetButton;

    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickAjaxDemo(){

        ajaxDemoLink.click();
    }

    public void clickYesBox(){

        yesCheckBox.isSelected();
    }

    public void clickNoBox(){

        noCheckBox.isSelected();
    }

    public void clickCheckButton(){

        checkButton.click();
    }

    public void clickResetButton(){

        resetButton.click();
    }
}
