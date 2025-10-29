package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebTablesPage;

public class WebTablesTest extends BaseTest {

    @Test
    public void testAddAndSearchRecord() {
        WebTablesPage p = new WebTablesPage(driver);
        p.open();
        p.addRecord("Pavel", "Petrov", "p.petrov@example.com", "28", "5000", "QA");
        p.search("Pavel");
        Assert.assertTrue(p.getTableText().contains("Pavel"), "Таблица должна содержать добавленную запись");
    }
}


