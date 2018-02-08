package example.entities;

import com.epam.jdi.uitests.web.selenium.elements.common.Text;

import org.openqa.selenium.support.FindBy;

public class MetalsColorsFormResults{

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
