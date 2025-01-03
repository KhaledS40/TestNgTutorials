package pageFactory.SeleniumTab;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadLink {

    public WebDriver driver;

    public FileUploadLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(css = "a[href='../../test/upload/']")
    WebElement fileUploadLink;

    @FindBy(id = "uploadfile_0")
    WebElement chooseFIleLink;

    @FindBy(css = "#terms")
    WebElement termsCheckBox;

    @FindBy(css = "#submitbutton")
    WebElement submitButton;

    @FindBy(xpath = "//center[normalize-space()='1 file has been successfully uploaded.']")
    WebElement confirmationText;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickFileUploadLink(){

        fileUploadLink.click();
    }

    public void clickChooseFile(){

        String filePath = "C:\\Users\\Khaled\\Downloads";
        chooseFIleLink.sendKeys(filePath);
    }

    public void selectTermsCheckBox(){

        termsCheckBox.click();
    }

    public void clickSubmitButton(){

        submitButton.click();
    }

    public void getConfirmationText(){


        String expectedText = "has been successfully uploaded.";
        String actual = confirmationText.getText();
        Assert.assertEquals(actual,expectedText, "has been successfully uploaded.");
    }
}
