package example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import example.entities.MetalColors;
import org.openqa.selenium.support.FindBy;

public class MetalsColorsForm extends Form<MetalColors> {

    @FindBy(css = ".summ-res")
    public Text sumRes;
    @FindBy(css = ".elem-res")
    public Text elementsRes;
    @FindBy(css = ".col-res")
    public Text colorRes;
    @FindBy(css = ".met-res")
    public Text metalRes;
    @FindBy(css = ".sal-res")
    public Text saladRes;


}
