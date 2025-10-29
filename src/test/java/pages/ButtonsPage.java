package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends BasePage {
    private static final String URL = "https://demoqa.com/buttons";

    private final By doubleClickBtn = By.id("doubleClickBtn");
    private final By rightClickBtn = By.id("rightClickBtn");
    private final By doubleClickMessage = By.id("doubleClickMessage");
    private final By rightClickMessage = By.id("rightClickMessage");

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void doubleClickButton() {
        WebElement button = driver.findElement(doubleClickBtn);
        new Actions(driver).doubleClick(button).perform();
    }

    public void rightClickButton() {
        WebElement button = driver.findElement(rightClickBtn);
        new Actions(driver).contextClick(button).perform();
    }

    public String getDoubleClickMessage() {
        return driver.findElement(doubleClickMessage).getText();
    }

    public String getRightClickMessage() {
        return driver.findElement(rightClickMessage).getText();
    }
}


