package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RadioButtonPage;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testSelectYesRadio() {
        RadioButtonPage p = new RadioButtonPage(driver);
        p.open();
        p.selectYes();
        Assert.assertEquals(p.getResultText(), "Yes", "Должно отобразиться 'Yes'");
    }

    @Test
    public void testSelectImpressiveRadio() {
        RadioButtonPage p = new RadioButtonPage(driver);
        p.open();
        p.selectImpressive();
        Assert.assertEquals(p.getResultText(), "Impressive", "Должно отобразиться 'Impressive'");
    }
}


