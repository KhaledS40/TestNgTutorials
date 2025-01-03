package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerFormLink {

    public WebDriver driver;

    public DeleteCustomerFormLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Delete Customer Form']")
    WebElement deleteCustomerFormLink;

    @FindBy(name = "cusid")
    WebElement customerIDTextBox;

    @FindBy(name = "res")
    WebElement resetButton;

    @FindBy(name = "submit")
    WebElement submitButton;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickCustomerForm(){

        deleteCustomerFormLink.click();
    }

    public void sendTextInCustomerField(){

        customerIDTextBox.sendKeys("1234");
    }

    public void clickResetButton(){

        resetButton.click();
        System.out.println("this is inside the toolTip block");
    }

    public void clickSubmitButton() throws InterruptedException {

        submitButton.click();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }
}
