package example;

import org.testng.annotations.Test;

import static example.site.JDIExampleSite.*;

public class SimpleTest extends SimpleTestsInit {

    @Test
    public void loginTest() {
        homePage.open();
        login();
        homePage.checkOpened();
        metalPage.open();
        fillForm();
        checkFillFormOnAccordance();
    }
}
