package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testSelectHomeCheckbox() {
        CheckBoxPage p = new CheckBoxPage(driver);
        p.open();
        p.expandAll();
        p.toggleHome();

        String result = p.getResultText();
        Assert.assertTrue(result.toLowerCase().contains("home"), "Результат должен содержать 'home'");
    }

    @Test
    public void testSelectDesktopCheckbox() {
        CheckBoxPage p = new CheckBoxPage(driver);
        p.open();
        p.expandAll();
        p.toggleByTitle("Desktop");
        String result = p.getResultText().toLowerCase();
        Assert.assertTrue(result.contains("desktop"), "Результат должен содержать 'desktop'");
    }

    @Test
    public void testSelectDocumentsCheckbox() {
        CheckBoxPage p = new CheckBoxPage(driver);
        p.open();
        p.expandAll();
        p.toggleByTitle("Documents");
        String result = p.getResultText().toLowerCase();
        Assert.assertTrue(result.contains("documents"), "Результат должен содержать 'documents'");
    }
}


