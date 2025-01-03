package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.DragAndDropActionLInk;

public class DragAndDrop extends BaseTest {

    DragAndDropActionLInk drag;

    @Test
    public void dragAndDropText(){

        drag = new DragAndDropActionLInk(driver);

        drag.clickSeleniumTab();
        drag.hoverAndClickDragAndDropLink();
        drag.dragAndDropElement();
        drag.getDroppedText();
    }
}
