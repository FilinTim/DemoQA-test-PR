package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends BasePage {
    private static final String URL = "https://demoqa.com/text-box";

    private final By userName = By.id("userName");
    private final By userEmail = By.id("userEmail");
    private final By currentAddress = By.id("currentAddress");
    private final By permanentAddress = By.id("permanentAddress");
    private final By submit = By.id("submit");

    private final By outputName = By.id("name");
    private final By outputEmail = By.id("email");
    private final By outputAddress = By.cssSelector("#output #currentAddress");
    private final By outputPermanent = By.cssSelector("#output #permanentAddress");

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void fillForm(String name, String email, String addr, String permAddr) {
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys(name);
        driver.findElement(userEmail).clear();
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(currentAddress).clear();
        driver.findElement(currentAddress).sendKeys(addr);
        driver.findElement(permanentAddress).clear();
        driver.findElement(permanentAddress).sendKeys(permAddr);
    }

    public void submit() {
        driver.findElement(submit).click();
    }

    public String getOutputName() {
        return driver.findElement(outputName).getText();
    }

    public String getOutputEmail() {
        return driver.findElement(outputEmail).getText();
    }

    public String getOutputCurrentAddress() {
        return driver.findElement(outputAddress).getText();
    }

    public String getOutputPermanentAddress() {
        return driver.findElement(outputPermanent).getText();
    }
}


