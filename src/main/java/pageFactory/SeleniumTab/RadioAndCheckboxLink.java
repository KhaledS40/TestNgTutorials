package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioAndCheckboxLink {

    public WebDriver driver;

    public RadioAndCheckboxLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Radio & Checkbox Demo']")
    WebElement radioCheckBoxDemo;

    @FindBy(css = "#vfb-7-1")
    WebElement options1;

    @FindBy(css = "#vfb-7-3")
    WebElement options3;

    @FindBy(css = "#vfb-7-1")
    WebElement checkBox1;

    @FindBy(css = "#vfb-7-1")
    WebElement checkBox3;

    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAnClickRadioCheckBoxLink(){

        radioCheckBoxDemo.click();
    }

    public void checkOption1(){

        options1.isSelected();

        System.out.println("this is to confirm option is selected");
    }

    public void checkOption3(){

        options3.isSelected();

        System.out.println("this is to confirm option is selected");
    }

    public void clickCheckBox1(){

        checkBox1.isSelected();

        System.out.println("this is to confirm checkbox is selected");
    }


    public void clickCheckBox3(){

        checkBox3.isSelected();

        System.out.println("this is to confirm checkbox is selected");
    }

}
