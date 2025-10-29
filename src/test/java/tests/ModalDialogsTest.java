package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ModalDialogsPage;

public class ModalDialogsTest extends BaseTest {

    @Test
    public void testSmallModalOpenAndClose() {
        ModalDialogsPage p = new ModalDialogsPage(driver);
        p.open();
        p.openSmallModal();
        Assert.assertEquals(p.getSmallModalTitle(), "Small Modal", "Ожидался заголовок Small Modal");
        p.closeSmallModal();
    }
}


