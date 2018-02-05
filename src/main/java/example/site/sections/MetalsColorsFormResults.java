package example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import example.entities.MetalColorsResults;
import org.openqa.selenium.support.FindBy;

public class MetalsColorsFormResults extends MetalColorsResults {

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
