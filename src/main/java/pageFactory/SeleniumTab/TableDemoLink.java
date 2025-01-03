package pageFactory.SeleniumTab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TableDemoLink {

    public WebDriver driver;

    public TableDemoLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(css = "tbody")
    WebElement tableElement;

    @FindBy(xpath = "//a[normalize-space()='Table Demo']")
    WebElement tableDemoLink;

    @FindBy(css = "col[align='center']")
    WebElement columnCount;

    @FindBy(css = "tbody tr:nth-child(1)")
    WebElement rowCount;


    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void clickTableDemoLink(){

        tableDemoLink.click();
    }

    public void countRows(){

        List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
        int rowCount = rows.size();
        System.out.println("Number of rows: " + rowCount);
    }

    public void countColumns(){

        List<WebElement> columns = tableElement.findElements(By.tagName("td"));
        int columnCount = columns.size();
        System.out.println("Number of columns: " + columnCount);
    }
}
