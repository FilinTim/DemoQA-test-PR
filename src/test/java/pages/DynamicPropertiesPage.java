package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPropertiesPage extends BasePage {
    private static final String URL = "https://demoqa.com/dynamic-properties";

    private final By enableAfter = By.id("enableAfter");
    private final By colorChange = By.id("colorChange");
    private final By visibleAfter = By.id("visibleAfter");

    public DynamicPropertiesPage(WebDriver driver) {
        super(driver);
    }

    public void open() { driver.get(URL); }

    public boolean waitUntilEnableAfterEnabled() {
        return new WebDriverWait(driver, Duration.ofSeconds(6))
                .until(d -> driver.findElement(enableAfter).isEnabled());
    }

    public boolean waitUntilVisibleAfterVisible() {
        return new WebDriverWait(driver, Duration.ofSeconds(6))
                .until(ExpectedConditions.visibilityOfElementLocated(visibleAfter)) != null;
    }
}


