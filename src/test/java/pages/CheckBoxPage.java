package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends BasePage {
    private static final String URL = "https://demoqa.com/checkbox";

    private final By expandAll = By.cssSelector("button[title='Expand all']");
    private final By homeTitle = By.xpath("//span[@class='rct-title' and text()='Home']");
    private final By result = By.id("result");

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void expandAll() {
        driver.findElement(expandAll).click();
    }

    public void toggleHome() {
        driver.findElement(homeTitle).click();
    }

    public void toggleByTitle(String title) {
        By titleLocator = By.xpath("//span[@class='rct-title' and text()='" + title + "']");
        driver.findElement(titleLocator).click();
    }

    public String getResultText() {
        return driver.findElement(result).getText();
    }
}


