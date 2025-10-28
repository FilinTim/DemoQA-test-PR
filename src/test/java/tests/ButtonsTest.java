package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ButtonsPage;

public class ButtonsTest extends BaseTest {

    @Test
    public void testDoubleClickButton() {
        ButtonsPage p = new ButtonsPage(driver);
        p.open();
        p.doubleClickButton();

        String message = p.getDoubleClickMessage();
        Assert.assertEquals(message, "You have done a double click",
                "Сообщение должно быть 'You have done a double click'");
    }

    @Test
    public void testRightClickButton() {
        ButtonsPage p = new ButtonsPage(driver);
        p.open();
        p.rightClickButton();

        String message = p.getRightClickMessage();
        Assert.assertEquals(message, "You have done a right click",
                "Сообщение должно быть 'You have done a right click'");
    }
}


