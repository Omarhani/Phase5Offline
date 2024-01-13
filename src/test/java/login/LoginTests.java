package login;

import base.BaseTests;
import org.openqa.selenium.*;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String expectedResult = "You logged into a secure area!";
        String actualResult = secureAreaPage.getValidationMessage();
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testInvalidUsername() {

        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("fasdfd");
        loginPage.insertPassword("adsfds");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualResult = secureAreaPage.getValidationMessage();
        String expectedResult= "Your username is invalid!";
        assertTrue(actualResult.contains(expectedResult));

    }

    @Test(priority = 3)
    public void testInvalidPassword() {
        LoginPage loginPage=  homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("adsfds");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualResult = secureAreaPage.getValidationMessage();
        String expectedResult= "Your password is invalid!";
        assertTrue(actualResult.contains(expectedResult));

    }

//    @Test
//    public void t1() throws InterruptedException {
//        homePage.clickOnFormAuthenticationLink();
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.navigate().to("https://google.com");
//        driver.findElement(By.linkText("Gmail")).click();
//
//        var windows = driver.getWindowHandles();
//        for (String window : windows){
//            driver.switchTo().window(window);
//            if ("The Internet".equalsIgnoreCase(driver.getTitle())){
//                break;
//            }
//        }
//        driver.findElement(By.id("username")).sendKeys("hello");
//        for (String window : windows){
//            driver.switchTo().window(window);
//            if ("Gmail: Private and secure email at no cost | Google Workspace".equalsIgnoreCase(driver.getTitle())){
//                break;
//            }
//        }
//        driver.findElement(By.xpath("//a[contains(text(),'For work')]")).click();
//
//    }

//    @Test(priority = 3)
//    public void t2() {
//        homePage.addBorderToElement(driver,homePage.clickOnFormAuthenticationLink1());
////        driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("password"))).sendKeys("Helo");
////        driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username"))).sendKeys("fadsfdsafasdfdsa");
//
//    }


}
