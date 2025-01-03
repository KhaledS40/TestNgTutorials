package testNG.ParallelExcution;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTest {

    WebDriver driver;

    /**
     * This function will execute before each Test tag in testng.xml
     * @param browser
     * @throws Exception
     */

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception{
        //Check if parameter passed from TestNG is 'firefox'
        if(browser.equalsIgnoreCase("firefox")){
            //create firefox instance
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        //Check if parameter passed as 'chrome'
        else if(browser.equalsIgnoreCase("chrome")){
            //Using WebDriverManager that replaces  path to chromedriver.exe
            WebDriverManager.chromedriver().setup();
            //create chrome instance
            driver = new ChromeDriver();
        }
        //Check if parameter passed as 'Edge'
        else if(browser.equalsIgnoreCase("Edge")){
            //Using WebDriverManager that replaces path to Edge.exe
            WebDriverManager.edgedriver().setup();
            //create Edge instance
            driver = new EdgeDriver();
        }
        else{
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testParameterWithXML() throws InterruptedException{

        driver.get("https://demo.guru99.com/test/flash-testing.html");

        WebElement seleniumTab = driver.findElement(By.xpath("//a[normalize-space()='Selenium']"));
        seleniumTab.click();

        WebElement socialLink = driver.findElement(By.xpath("//a[normalize-space()='Social Icon']"));
        socialLink.click();

        WebElement emailIconLink = driver.findElement(By.cssSelector(".fa.fa-lg.fa-envelope"));
        emailIconLink.click();
        driver.navigate().back();

        WebElement googleIconLink = driver.findElement(By.cssSelector(".fa.fa-lg.fa-google"));
        googleIconLink.click();
        driver.switchTo().defaultContent();

        WebElement youtubeIconLink = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']"));
        youtubeIconLink.click();
        driver.switchTo().defaultContent();

        WebElement gitLabIconLink = driver.findElement(By.cssSelector("div[class='socialbtns'] div a[title='Github']"));
        gitLabIconLink.click();
        driver.navigate().back();

        WebElement faceBookIconLink = driver.findElement(By.cssSelector(".fa.fa-lg.fa-facebook"));
        faceBookIconLink.click();
        driver.switchTo().defaultContent();

        WebElement wifiIconLink = driver.findElement(By.cssSelector(".fa.fa-lg.fa-rss"));
        wifiIconLink.click();
        driver.switchTo().defaultContent();

        driver.quit();
    }
}
