package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToolTipsPage;

public class ToolTipsTest extends BaseTest {

    @Test
    public void testButtonTooltip() throws InterruptedException {
        ToolTipsPage p = new ToolTipsPage(driver);
        p.open();
        p.hoverButton();
        Thread.sleep(500);
        Assert.assertEquals(p.getTooltipText(), "You hovered over the Button", "Неверный текст тултипа");
    }
}


