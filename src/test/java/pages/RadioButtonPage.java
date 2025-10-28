package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage {
    private static final String URL = "https://demoqa.com/radio-button";

    private final By yesLabel = By.cssSelector("label[for='yesRadio']");
    private final By impressiveLabel = By.cssSelector("label[for='impressiveRadio']");
    private final By result = By.className("text-success");

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void selectYes() {
        driver.findElement(yesLabel).click();
    }

    public void selectImpressive() {
        driver.findElement(impressiveLabel).click();
    }

    public String getResultText() {
        return driver.findElement(result).getText();
    }
}


