package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadDownloadPage extends BasePage {
    private static final String URL = "https://demoqa.com/upload-download";

    private final By uploadInput = By.id("uploadFile");
    private final By uploadedPath = By.id("uploadedFilePath");

    public UploadDownloadPage(WebDriver driver) { super(driver); }

    public void open() { driver.get(URL); }

    public void uploadFile(String absolutePath) {
        driver.findElement(uploadInput).sendKeys(absolutePath);
    }

    public String getUploadedPathText() { return driver.findElement(uploadedPath).getText(); }
}


