package checkBox;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTests {

    @Test
    public void testCheckBox(){
        driver.findElement(By.linkText("Checkboxes")).click();
    }
}
