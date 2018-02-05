package example;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import example.site.JDISite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static example.parser.ParsingDataSet.*;

public class SimpleTest extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(JDISite.class);
    }

    @BeforeMethod
    public void beforeMethod() {
        JDISite.homePage.open();
        JDISite.login();
    }

    @Test
    public void FillingMetalsAndColorsForm() {
        JDISite.homePage.checkOpened();
        JDISite.metalAndColorsPage.open();
        JDISite.metalAndColorsPage.checkOpened();
        JDISite.parseJsonFile();
        JDISite.selectButton(summaryNumber);
        JDISite.pickElements(stringOfElements);
        JDISite.chooseTheColor(dataOfColors);
        JDISite.chooseTheMetal(dataOfMetals);
        JDISite.chooseSalad(stringOfVegetables);
        JDISite.submit();
        JDISite.checkFillFormOnAccordance();
    }
}
