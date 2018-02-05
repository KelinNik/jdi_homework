package example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import example.entities.SaladDropDown;
import org.openqa.selenium.support.FindBy;

public class SaladDropDownForm extends Form<SaladDropDown> {

    @FindBy(css = "label[for='g5']")
    public CheckBox cucumber;
    @FindBy(css = "label[for='g6']")
    public CheckBox tomato;
    @FindBy(css = "label[for='g7']")
    public CheckBox salad;
    @FindBy(css = "label[for='g8']")
    public CheckBox onion;
}
