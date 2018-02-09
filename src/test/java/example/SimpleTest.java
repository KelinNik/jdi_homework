package example;


import org.testng.annotations.Test;

import java.io.IOException;

import static example.JDISite.*;
import static example.enums.HeaderMenuEnum.METALS_COLORS;


public class SimpleTest extends InitTests {

    @Test
    public void metalColorSelectionTest() throws IOException {

        //1 Login on JDI site as User
        homePage.open();
        login();
        homePage.checkOpened();

        //2 Open Metals & Colors page by Header menu
        openMetalsColorsPage(METALS_COLORS);

        //3 Fill form Metals & Colors
        fillMetalsColorsForm();
    }
}
