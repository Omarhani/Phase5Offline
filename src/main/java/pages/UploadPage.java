package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {



    WebDriver driver;
    public UploadPage(WebDriver driver) {
        this.driver =driver;
    }

    private final By fileUpload = By.id("file-upload");
    private final By fileSubmit = By.id("file-submit");

    private final By validationMessage = By.id("uploaded-files");

    public void uploadFile(String path){
        driver.findElement(fileUpload).sendKeys(path);
    }

    public void clickOnSubmitButton(){
        driver.findElement(fileSubmit).click();
    }
    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }


}
