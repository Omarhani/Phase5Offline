package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;
import pages.TwoPage;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testDynamicWait() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        OnePage onePage = dynamicLoadingPage.clickOnExampleOneLink();
        onePage.clickOnStartButton();
        String actualResult = onePage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testDynamicWait2(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        TwoPage twoPage = dynamicLoadingPage.clickOnExampleTwoLink();
        twoPage.clickOnStartButton();
        String actualResult = twoPage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult,expectedResult);
    }
}
