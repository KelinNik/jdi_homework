package example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import example.entities.Summary;
import org.openqa.selenium.support.FindBy;


public class SummaryForm extends Form<Summary> {

    @FindBy(css = "label[for='p1']")
    public Button button1;
    @FindBy(css = "label[for='p2']")
    public Button button3;
    @FindBy(css = "label[for='p3']")
    public Button button5;
    @FindBy(css = "label[for='p4']")
    public Button button7;
    @FindBy(css = "label[for='p5']")
    public Button button2;
    @FindBy(css = "label[for='p6']")
    public Button button4;
    @FindBy(css = "label[for='p7']")
    public Button button6;
    @FindBy(css = "label[for='p8']")
    public Button button8;

    @FindBy(css = ".calculate-button")
    public Button Calculate;


}
