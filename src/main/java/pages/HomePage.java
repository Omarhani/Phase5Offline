package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // locators
    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By uploadLink = By.linkText("File Upload");


    // Actions

    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public UploadPage clickOnUploadLink(){
        driver.findElement(uploadLink).click();
        return new UploadPage(driver);
    }
}
