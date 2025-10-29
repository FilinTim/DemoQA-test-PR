package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTipsPage extends BasePage {
    private static final String URL = "https://demoqa.com/tool-tips";

    private final By hoverButton = By.id("toolTipButton");
    private final By tooltip = By.cssSelector(".tooltip-inner");

    public ToolTipsPage(WebDriver driver) { super(driver); }

    public void open() { driver.get(URL); }

    public void hoverButton() {
        WebElement btn = driver.findElement(hoverButton);
        new Actions(driver).moveToElement(btn).perform();
    }

    public String getTooltipText() { return driver.findElement(tooltip).getText(); }
}


