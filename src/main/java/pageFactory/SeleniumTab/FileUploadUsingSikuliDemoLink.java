package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadUsingSikuliDemoLink {

    public WebDriver driver;

    public FileUploadUsingSikuliDemoLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='File Upload using Sikuli Demo']")
    WebElement fileUploadDemo;

    @FindBy(xpath = "//input[@id='photoimg']")
    WebElement chooseFileLink;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickFileUploadDemo(){

        fileUploadDemo.click();
    }

    public void chooseFile(){

        //chooseFileLink.click();
        String filePath = "C:\\Users\\Khaled\\OneDrive\\Desktop";
        chooseFileLink.sendKeys(filePath);
    }
}
