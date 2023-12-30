package upload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.UploadPage;

import static org.testng.Assert.assertEquals;

public class UploadTests extends BaseTests {
    String imagePath = "/Users/omarhany/IdeaProjects/Phase5Offilne/folder/1.png";
    @Test
    public void testUploadFile(){
        UploadPage uploadPage = homePage.clickOnUploadLink();
        uploadPage.uploadFile(imagePath);
        uploadPage.clickOnSubmitButton();
        String actualResult =uploadPage.getValidationMessage();
        String expectedResult = "1.png";
        assertEquals(actualResult,expectedResult);
    }
}
