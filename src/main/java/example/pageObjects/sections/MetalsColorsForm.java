package example.pageObjects.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JComboBox;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import example.entities.MetalColorsDataSet;
import example.enums.Colors;
import example.enums.Elements;
import example.enums.Vegetables;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class MetalsColorsForm extends Form<MetalColorsDataSet> {

    @JFindBy(css = "#odds-selector .radio")
    public RadioButtons odd;

    @JFindBy(css = "#even-selector .radio")
    public RadioButtons even;

    @JFindBy(css = "#elements-checklist .checkbox")
    public CheckList<Elements> elements;

    @JDropdown(
            jroot = @JFindBy(css = ".colors"),
            jexpand = @JFindBy(title = "Colors"),
            jlist = @JFindBy(tagName = "li"))
    public Dropdown<Colors> colors;

    @JFindBy(css = ".metals input")
    public TextField metals;

    @JComboBox(
            jroot = @JFindBy(css = ".dropdown salad"),
            jexpand = @JFindBy(type = "button"),
            jlist = @JFindBy(tagName = "li"))
    public ComboBox salad;

//    @FindBy(css = "#salad-dropdown button")
//    public Button saladButton;
//
//    @FindBy(css = "#salad-dropdown label")
//    public CheckList salad;
//
//    @Step
//    public void selectSalad(Vegetables salads) {
//        saladButton.click();
//        salad.isDisplayed(salads.text);
//        salad.check(salads);
//    }
}
