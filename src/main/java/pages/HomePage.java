package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
     WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // locators
    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By uploadLink = By.linkText("File Upload");

    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    private final By dropdownLink = By.linkText("Dropdown");

    private void clickOnLink(By locator){
        driver.findElement(locator).click();
    }
    // Actions

    public LoginPage clickOnFormAuthenticationLink(){
        clickOnLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public UploadPage clickOnUploadLink(){
        clickOnLink(uploadLink);
        return new UploadPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        clickOnLink(dynamicLoadingLink);
        return new DynamicLoadingPage(driver);
    }
    public DropdownPage clickOnDropdownLink(){
        clickOnLink(dropdownLink);
        return new DropdownPage(driver);
    }
    public void addBorderToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.border = '2px solid red';", element);
    }
}
