package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JSAlertsTests extends BaseTests {

    @Test
    public void testJSAlert(){
        var jsAlertPage =homePage.clickOnJSAlertLink();
        jsAlertPage.clickOnJSAlertButton();
        jsAlertPage.acceptAlert();
        String actualResult = jsAlertPage.getValidationMessage();
        String expectedResult = "You successfully clicked an alert";
        assertEquals(actualResult,expectedResult);
    }
}
