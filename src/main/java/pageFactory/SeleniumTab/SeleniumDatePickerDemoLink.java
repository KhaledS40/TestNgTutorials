package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumDatePickerDemoLink {

    public WebDriver driver;

    public SeleniumDatePickerDemoLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Selenium DatePicker Demo']")
    WebElement seleniumDatePicker;

    @FindBy(css = "input[name='bdaytime']")
    WebElement birthDayTimeDate;

    @FindBy(css = "input[type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//div[normalize-space()='Your Birth Date is Your Birth Time is']")
    WebElement confirmText;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickSeleniumDatePickerDemo(){

        seleniumDatePicker.click();
    }

    public void clickBirthDateAndTime(){

        birthDayTimeDate.click();
    }
    public void clickSubmitButton(){

        submitButton.click();
    }
    public void getConfirmText(){

        String text = confirmText.getText();
        System.out.println(text);
    }
}
