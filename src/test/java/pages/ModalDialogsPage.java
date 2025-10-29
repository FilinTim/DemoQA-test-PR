package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDialogsPage extends BasePage {
    private static final String URL = "https://demoqa.com/modal-dialogs";

    private final By smallModalBtn = By.id("showSmallModal");
    private final By smallModal = By.id("example-modal-sizes-title-sm");
    private final By closeSmall = By.id("closeSmallModal");

    public ModalDialogsPage(WebDriver driver) { super(driver); }

    public void open() { driver.get(URL); }

    public void openSmallModal() { driver.findElement(smallModalBtn).click(); }

    public String getSmallModalTitle() { return driver.findElement(smallModal).getText(); }

    public void closeSmallModal() { driver.findElement(closeSmall).click(); }
}


