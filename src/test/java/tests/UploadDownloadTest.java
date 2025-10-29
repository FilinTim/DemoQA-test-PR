package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadDownloadPage;

import java.nio.file.Paths;

public class UploadDownloadTest extends BaseTest {

    @Test
    public void testUploadFile() {
        UploadDownloadPage p = new UploadDownloadPage(driver);
        p.open();
        String path = Paths.get(System.getProperty("user.dir"), "pom.xml").toAbsolutePath().toString();
        p.uploadFile(path);
        Assert.assertTrue(p.getUploadedPathText().contains("pom.xml"), "Должно отобразиться имя загруженного файла");
    }
}


