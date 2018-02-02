package example.entities;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

public class MetalColors extends WebPage {

    @FindBy(css = "label[for='p2']")
    public Button button3;
    @FindBy(css = "label[for='p8']")
    public Button button8;
    @FindBy(css = "label[for='g1']")
    public CheckBox water;
    @FindBy(css = "label[for='g4']")
    public CheckBox fire;
    @FindBy(css = "[title=Colors]")
    public Dropdown colors;
    @FindBy(css = "li[rel='1']")
    public Button red;
    @FindBy(css = "[data-id=metals-combobox] span[class='caret']")
    public Button caret;
    @FindBy(css = "li[rel='4']")
    public Button selen;
    @FindBy(id = "salad-dropdown")
    public Button saladMenu;
    @FindBy(css = "label[for='g5']")
    public CheckBox cucumber;
    @FindBy(css = "label[for='g6']")
    public CheckBox tomato;
    @FindBy(css = "label[for='g7']")
    public CheckBox salad;
    @FindBy(id = "submit-button")
    public Button submit;

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
