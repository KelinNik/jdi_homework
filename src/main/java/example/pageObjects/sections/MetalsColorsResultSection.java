package example.pageObjects.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import example.entities.MetalColorsDataSet;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static org.testng.Assert.assertTrue;

public class MetalsColorsResultSection extends Section {

    @FindBy(css = ".results li")
    private TextList actualResultTextList;

    public void checkResultSection(MetalColorsDataSet metalColorsDataSet) {
        Map<String, String> expectedLogMap = metalColorsDataSet.getResultLog();
        Object[] s = expectedLogMap.values().toArray();
        for (Object value : s) {
            System.out.println(value);
            assertTrue(actualResultTextList.getValue().contains((CharSequence) value));
        }
    }
}