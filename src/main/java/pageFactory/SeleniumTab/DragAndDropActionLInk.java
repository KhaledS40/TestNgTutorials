package pageFactory.SeleniumTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DragAndDropActionLInk {

    public WebDriver driver;

    public DragAndDropActionLInk(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[normalize-space()='Selenium']")
    WebElement seleniumTab;

    @FindBy(xpath = "//a[normalize-space()='Drag and Drop Action']")
    WebElement dragAndDropLink;

    @FindBy(xpath = "//section[@id='g-container-main']//li[2]//a[1]")
    WebElement draggable;

    @FindBy(css = "ol[id='amt7'] li[class='placeholder']")
    WebElement droppable;

    @FindBy(xpath = "//td[normalize-space()='Debit Movement']")
    WebElement droppedText;



    public void clickSeleniumTab(){

        seleniumTab.click();
    }

    public void hoverAndClickDragAndDropLink(){

        dragAndDropLink.click();
    }

    public void dragAndDropElement(){

        Actions act = new Actions(driver);
        act.dragAndDrop(draggable, droppable).build().perform();
    }

    public void getDroppedText(){

        String dropText = droppedText.getText();
        System.out.println(dropText);
    }
}
