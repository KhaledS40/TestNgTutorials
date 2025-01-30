package pageFactory.InsuranceProjectTab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.HashMap;

public class InsuranceProjectTab {

    public WebDriver driver;

    public InsuranceProjectTab(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Insurance Project']")
    WebElement insuranceTab;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @FindBy(name = "title")
    WebElement nameTitle;

    @FindBy(id = "user_firstname")
    WebElement firstName;

    @FindBy(name = "lastname")
    WebElement lastName;

    @FindBy(name = "phone")
    WebElement phone;

    @FindBy(id = "user_dateofbirth_1i")
    WebElement birthYear;

    @FindBy(id = "user_dateofbirth_2i")
    WebElement birthMonth;

    @FindBy(id = "user_dateofbirth_3i")
    WebElement birthDay;

    @FindBy(id = "licencetype_f")
    WebElement licenseType;

    @FindBy(id = "user_licenceperiod")
    WebElement licensePeriod;

    @FindBy(id = "user_occupation_id")
    WebElement occupation;

    @FindBy(id = "user_address_attributes_street")
    WebElement streetAddress;

    @FindBy(id = "user_address_attributes_city")
    WebElement city;

    @FindBy(id = "user_address_attributes_county")
    WebElement country;

    @FindBy(id = "user_address_attributes_postcode")
    WebElement zipCode;

    @FindBy(id = "user_user_detail_attributes_email")
    WebElement emailAddress;

    @FindBy(id = "user_user_detail_attributes_password")
    WebElement password;

    @FindBy(id = "user_user_detail_attributes_password_confirmation")
    WebElement confirmPassword;

    @FindBy(name = "submit")
    WebElement create;


    public void clickInsuranceProject() {

        insuranceTab.click();
    }

    public void clickRegisterLink() {

        registerLink.click();
    }

    public void selectNameTitle() {

        nameTitle.click();
        Select s = new Select(nameTitle);
        s.selectByVisibleText("Doctor");
    }

    public void enterFirstName() {

        firstName.sendKeys("Bob");
    }

    public void enterLastName() {

        lastName.sendKeys("Logan");
    }

    public void enterPhoneNumber() {

        phone.sendKeys("5711234567");
    }

    public void selectBirthYear() {

        birthYear.click();
        Select select = new Select(birthYear);
        select.selectByVisibleText("1945");
    }

    public void selectBirthMonth() {
        birthMonth.click();
        Select se = new Select(birthMonth);
        se.selectByVisibleText("March");
    }

    public void enterBirthDay() {
        birthDay.click();
        Select se = new Select(birthDay);
        se.selectByVisibleText("5");
    }

    public void selectLicenseType() {

        licenseType.click();
    }

    public void selectLicenseDuration() {

        licensePeriod.click();
        Select se = new Select(licensePeriod);
        se.selectByVisibleText("8");
    }

    public void selectOccupation() {

        occupation.click();
        Select select1 = new Select(occupation);
        select1.selectByVisibleText("Doctor");
    }

    public void enterStreetAddress() {

        streetAddress.sendKeys("4600 Duke street");
    }

    public void enterCity() {

        city.sendKeys("Alexandria");
    }

    public void enterCountry() {

        country.sendKeys("USA");
    }

    public void enterPostalCode() {

        zipCode.sendKeys("22304");
    }

    public void enterEmail() {

        emailAddress.sendKeys("BOB.MIKE@GMAIL.COM");
    }

    public void enterPassword() {

        password.sendKeys("CHEERS123");
    }

    public void confirmPassword() {

        confirmPassword.sendKeys("CHEERS123");
        System.out.println("this is a test line of code");
    }

    public void clickCreateButton(){
        create.click();
    }
}
