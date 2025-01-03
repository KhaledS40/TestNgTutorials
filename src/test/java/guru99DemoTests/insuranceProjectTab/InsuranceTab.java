package guru99DemoTests.insuranceProjectTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.InsuranceProjectTab.InsuranceProjectTab;

public class InsuranceTab extends BaseTest {

    InsuranceProjectTab insurance;

    @Test
    public void InsuranceProject(){

        insurance = new InsuranceProjectTab(driver);

        insurance.clickInsuranceProject();
        insurance.clickRegisterLink();
        insurance.selectNameTitle();
        insurance.enterFirstName();
        insurance.enterLastName();
        insurance.enterPhoneNumber();
        insurance.selectBirthYear();
        insurance.selectBirthMonth();
        insurance.enterBirthDay();
        insurance.selectLicenseType();
        insurance.selectLicenseDuration();
        insurance.selectOccupation();
        insurance.enterStreetAddress();
        insurance.enterCity();
        insurance.enterCountry();
        insurance.enterPostalCode();
        insurance.enterEmail();
        insurance.enterPassword();
        insurance.confirmPassword();
        insurance.clickCreateButton();
    }
}
