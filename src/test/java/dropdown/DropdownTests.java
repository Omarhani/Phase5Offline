package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectFromDropdownList(){
        DropdownPage dropdownPage = homePage.clickOnDropdownLink();
        dropdownPage.selectFromDropdownList("2");
    }
}
