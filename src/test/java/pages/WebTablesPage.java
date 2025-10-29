package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablesPage extends BasePage {
    private static final String URL = "https://demoqa.com/webtables";

    private final By addButton = By.id("addNewRecordButton");
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By userEmail = By.id("userEmail");
    private final By age = By.id("age");
    private final By salary = By.id("salary");
    private final By department = By.id("department");
    private final By submit = By.id("submit");
    private final By search = By.id("searchBox");
    private final By table = By.className("rt-table");

    public WebTablesPage(WebDriver driver) { super(driver); }

    public void open() { driver.get(URL); }

    public void addRecord(String fn, String ln, String email, String ageVal, String sal, String dept) {
        driver.findElement(addButton).click();
        driver.findElement(firstName).sendKeys(fn);
        driver.findElement(lastName).sendKeys(ln);
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(age).sendKeys(ageVal);
        driver.findElement(salary).sendKeys(sal);
        driver.findElement(department).sendKeys(dept);
        driver.findElement(submit).click();
    }

    public void search(String text) { driver.findElement(search).clear(); driver.findElement(search).sendKeys(text); }

    public String getTableText() { return driver.findElement(table).getText(); }
}


