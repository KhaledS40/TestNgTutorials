package testNG.Asserts;

import guru99DemoTests.mainTest.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HardAsserts {


    /*
        .   Hard Asserts are those asserts that stop the test execution when an assert statement fails,
        .   Hard asserts are the default type of asserts in TestNG,
     */

    public WebDriver driver;

    @Test()
    public void OpenBrowser() {

        WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.toolsqa.com/");

        String expectedTitle = "Tools QA";
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle);

        //Using Hard assert
        Assert.assertEquals(originalTitle, expectedTitle);
        System.out.println("*** Checking For The Second Title ***");
    }
}