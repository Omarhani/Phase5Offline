package frame;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FrameTests extends BaseTests {

    @Test
    public void testFrame() {
        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickOnWYSIWYGEditorLink();
        wysiwygEditorPage.clearTextBox();
        wysiwygEditorPage.insertInTextBox("Hello world!");
        wysiwygEditorPage.clickOnIncreaseIndentButton();
    }
}
