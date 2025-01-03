package testNG.Asserts;

import guru99DemoTests.mainTest.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {


    /*
        .   ssertions in TestNG are a way to verify that the expected result and the actual result matched or not.
        .   Soft asserts are just the opposite of hard asserts. In soft asserts, the subsequent assertions keep on running
        .   even though one assert validation fails, i.e., the test execution does not stop
        .   Soft assert does not include by default in TestNG. For this, you need to include the package org.testng.asserts.Softassert.

        When should we use Soft Assert?
            .   We use soft asserts when we do not care about the failure of specific validations
            .   and want the test execution to proceed and also want to see the exception errors.
     */

    public WebDriver driver ;



    @Test()
    public void OpenBrowser() {

        WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.toolsqa.com/");

        // Creating soft assert class and its object
        SoftAssert softassert = new SoftAssert();

        String expectedTitle = "Tools QA";
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle);

        //Using soft assert
        softassert.assertEquals(originalTitle, expectedTitle);
        System.out.println("*** Checking For The Second Title ***");

// Checking title for ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation
        softassert.assertEquals(originalTitle, "ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation" );
        softassert.assertAll();
    }
}
