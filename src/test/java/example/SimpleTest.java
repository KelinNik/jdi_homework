package example;


import example.entities.MetalColorsDataSet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static example.JDISite.homePage;
import static example.JDISite.metalsAndColorsPage;
import static example.entities.User.PITER_CHAILOVSKII;
import static example.enums.HeaderMenuEnum.METALS_COLORS;


public class SimpleTest extends InitTests {

    @BeforeMethod
    public void openHomePage() {
        homePage.open();
        homePage.checkOpened();
    }

    @AfterMethod
    public void tearDown() {
        metalsAndColorsPage.headerSection.logout();
    }

    @DataProvider
    public Object[] getData() throws FileNotFoundException {
        return new DataLoader().data;
    }

    @Test(dataProvider = "getData")
    public void metalColorSelectionTest(MetalColorsDataSet metalColorsDataSet) {

        //1 Login on JDI site as User
        homePage.headerSection.login(PITER_CHAILOVSKII);

        //2 Open Metals & Colors page by Header menu
        homePage.headerSection.headerMenu.mySelection(METALS_COLORS);
        metalsAndColorsPage.checkOpened();

        //3 Fill form Metals & Colors
        metalsAndColorsPage.metalsColorsForm.fillMetalsColorsForm(metalColorsDataSet);

        //4 Some kind of checking
        metalsAndColorsPage.metalsColorsResultSection.checkResultSection(metalColorsDataSet);
    }
}
