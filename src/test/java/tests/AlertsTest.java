package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {

    @Test
    public void testConfirmAccept() {
        AlertsPage p = new AlertsPage(driver);
        p.open();
        p.clickConfirmAndAccept();
        Assert.assertTrue(p.getConfirmResult().contains("Ok"), "Сообщение должно содержать 'Ok'");
    }

    @Test
    public void testConfirmDismiss() {
        AlertsPage p = new AlertsPage(driver);
        p.open();
        p.clickConfirmAndDismiss();
        Assert.assertTrue(p.getConfirmResult().contains("Cancel"), "Сообщение должно содержать 'Cancel'");
    }
}


