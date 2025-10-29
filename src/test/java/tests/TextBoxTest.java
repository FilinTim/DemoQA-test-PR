package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    @Test
    public void testSubmitTextBoxForm() {
        TextBoxPage p = new TextBoxPage(driver);
        p.open();
        p.fillForm("Ivan Ivanov", "ivan@example.com", "City Street 1", "Perm Street 2");
        p.submit();

        Assert.assertTrue(p.getOutputName().contains("Ivan Ivanov"), "Имя должно содержаться в выводе");
        Assert.assertTrue(p.getOutputEmail().contains("ivan@example.com"), "Email должен содержаться в выводе");
        Assert.assertTrue(p.getOutputCurrentAddress().contains("City Street 1"), "Адрес должен содержаться в выводе");
        Assert.assertTrue(p.getOutputPermanentAddress().contains("Perm Street 2"), "Постоянный адрес должен содержаться в выводе");
    }
}


