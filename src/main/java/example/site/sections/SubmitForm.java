package example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JComboBox;
import example.entities.MetalColors;
import org.openqa.selenium.support.FindBy;

@JComboBox
public class SubmitForm extends Form<MetalColors> {
    @FindBy(css = "label[for='p2']")
    public Button button3;
    @FindBy(css = "label[for='p8']")
    public Button button8;
}
