package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPropertiesPage;

public class DynamicPropertiesTest extends BaseTest {

    @Test
    public void testEnableAfterBecomesEnabled() {
        DynamicPropertiesPage p = new DynamicPropertiesPage(driver);
        p.open();
        boolean enabled = p.waitUntilEnableAfterEnabled();
        Assert.assertTrue(enabled, "Кнопка должна стать активной спустя 5 сек");
    }

    @Test
    public void testVisibleAfterAppears() {
        DynamicPropertiesPage p = new DynamicPropertiesPage(driver);
        p.open();
        boolean visible = p.waitUntilVisibleAfterVisible();
        Assert.assertTrue(visible, "Кнопка должна появиться спустя 5 сек");
    }
}


