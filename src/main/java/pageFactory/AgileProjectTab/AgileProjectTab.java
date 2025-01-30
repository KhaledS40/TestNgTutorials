package pageFactory.AgileProjectTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AgileProjectTab {

    public static WebDriver driver;

    public AgileProjectTab(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[normalize-space()='Agile Project']") WebElement agileProject;

    @FindBy(css = "input[name='uid']") WebElement userID;

    @FindBy(css = "input[name='password']") WebElement userPassword;

    @FindBy(css = "input[value='LOGIN']") WebElement login;

    @FindBy(css = "a[href='Customerhomepage.php']") WebElement customerLink;

    @FindBy(css = "a[href='MiniStatementInput.php']") WebElement miniStatementLink;

    @FindBy(css = "select[name='accountno']") WebElement selectAccount; // 3309

    @FindBy(css = "input[value='Reset']") WebElement resetButton;

    @FindBy(xpath = "//a[normalize-space()='Home']") WebElement homeLink;

    @FindBy(css = "a[href='Logout.php']") WebElement logoutLink;



    public void clickAgileProject(){

        agileProject.click();
    }
    public void enterUserID(){

        userID.sendKeys("1303");
    }
    public void enterUserPassword(){

        userPassword.sendKeys("Guru99");
    }
    public void clickLogin(){

        login.click();
    }
    public void clickCustomerTab(){
        //driver.switchTo().alert().accept();
        customerLink.click();
    }
    public void clickMiniStatementTab(){

        miniStatementLink.click();
    }
    public void selectUserAccount(){

        selectAccount.click();
        Select se = new Select(selectAccount);
        se.selectByVisibleText("3309");
        resetButton.click();
    }
    public void clickHomeButton(){

        homeLink.click();
    }
    public void clickLogout(){

        logoutLink.click();
    }
}
