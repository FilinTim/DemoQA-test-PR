package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage {
    private static final String URL = "https://demoqa.com/alerts";

    private final By confirmButton = By.id("confirmButton");
    private final By confirmResult = By.id("confirmResult");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void clickConfirmAndAccept() {
        driver.findElement(confirmButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.switchTo().defaultContent();
    }

    public void clickConfirmAndDismiss() {
        driver.findElement(confirmButton).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        driver.switchTo().defaultContent();
    }

    public String getConfirmResult() {
        return driver.findElement(confirmResult).getText();
    }
}


