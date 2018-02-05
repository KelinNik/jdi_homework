package example.entities;

import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;

import org.openqa.selenium.support.FindBy;

public class Elements extends Section {
    @FindBy(css = "label[for='g1']")
    public CheckBox water;
    @FindBy(css = "label[for='g2']")
    public CheckBox earth;
    @FindBy(css = "label[for='g3']")
    public CheckBox wind;
    @FindBy(css = "label[for='g4']")
    public CheckBox fire;
}
