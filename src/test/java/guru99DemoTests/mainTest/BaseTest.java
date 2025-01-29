package guru99DemoTests.mainTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pageFactory.SeleniumTab.FlashMovieDemoLink;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;

    // creating a static variable here for date and time
    public static String screenShotSubFolderName;
    public static ExtentReports extentReports ;

    //@BeforeMethod
    public WebDriver initializeBrowser() throws IOException {

        Properties prop = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\resource\\configFIle.properties");

        prop.load(file);
        //This line of code pick any browser we give to mvn test
        String browsername = System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");
        //String browserName = prop.getProperty("browser"); // there is another way to pick any browser we give to mvn test instead of this line

        switch (browsername){
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("no browser is working at the moment");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }


    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void luanchURL(@Optional("chrome") String browser) throws IOException {

        try {
            driver = initializeBrowser();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FlashMovieDemoLink flash= new FlashMovieDemoLink(driver);
        flash.goTo();

        extentReports = new ExtentReports();
        ExtentSparkReporter extentSpark = new ExtentSparkReporter("./Reports/report.html");
        extentReports.attachReporter(extentSpark);

        extentReports.createTest("Test Name", "Inside Block")
                .assignAuthor("Tester" , "Mir")
                .assignCategory("Regression")
                .assignDevice("Edge");
                //.pass("The test is a pass");
        extentReports.createTest("Test Name", "Tooltip")
                .assignAuthor("Tester" , "Mir")
                .assignCategory("Smoke")
                .assignDevice("Edge");
                //.pass("The test is a pass");
        extentReports.createTest("Test Name", "Customer Form")
                .assignAuthor("Tester" , "Mir")
                .assignCategory("Regression")
                .assignDevice("Edge");

    }

    public void getScreenshot(String fileName){

        // the below code is for date and time formating if we wanna avoid overload screenshot
//        LocalDateTime myDateObj = LocalDateTime.now();
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"); // hyfan between data and time
//
//        screenShotSubFolderName = myDateObj.format(myFormatObj);


        TakesScreenshot ts =  (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        // it will create screen shot folders and subfolder with file name after each execution
        //File destFile = new File("./Screenshot/" + screenShotSubFolderName+ "/" +fileName);

        File destFile = new File("./Screenshot/" +fileName);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("screenshot saved successfully");
    }

    // How to capture screenShots for a failed test in TestNg using dependency injection
    // adding a condition
    @AfterMethod
    public void takeScreenshot(ITestResult result){

        if (result.getStatus()== ITestResult.FAILURE){
            getScreenshot(result.getTestContext().getName() + " - " + result.getMethod().getMethodName()+ ".jpg");
        }
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){

        extentReports.flush();
        driver.quit();
    }
}
