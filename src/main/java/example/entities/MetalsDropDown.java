package example.entities;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

public class MetalsDropDown extends Section {
    @FindBy(css = "li[rel='1']")
    public Button gold;
    @FindBy(css = "li[rel='2']")
    public Button silver;
    @FindBy(css = "li[rel='3']")
    public Button bronze;
    @FindBy(css = "li[rel='4']")
    public Button selen;
}
