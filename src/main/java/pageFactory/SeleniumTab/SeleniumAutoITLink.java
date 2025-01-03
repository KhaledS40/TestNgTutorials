package pageFactory.SeleniumTab;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumAutoITLink {

    public WebDriver driver;

    public SeleniumAutoITLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Selenium Auto IT']")
    WebElement seleniumAutoIT;

    @FindBy(id = "input_3")
    WebElement userName;

    @FindBy(id = "JotFormIFrame-72320244964454")
    WebElement frameID;

    @FindBy(id = "input_4")
    WebElement emailAddress;

    @FindBy(id = "input_5")
    WebElement uploadFile;

    @FindBy(id = "input_6")
    WebElement textArea;

    @FindBy(id = "input_6")
    WebElement submit;



    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickSeleniumAutoLink(){

        seleniumAutoIT.click();
    }
    public void enterUserName(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", userName);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().frame(frameID);
        userName.sendKeys("Bob");
    }
    public void enterEmail(){

        emailAddress.sendKeys("bob.mike@gmail.com");
    }
    public void uploadFile(){

        String filePath = "C:\\Users\\Khaled\\Downloads";
        uploadFile.sendKeys(filePath);
    }
    public void enterText(){

        textArea.sendKeys("This is inside text area");
        System.out.println("This is inside text area");
    }
    public void clickSubmit(){

        submit.click();
    }
}
