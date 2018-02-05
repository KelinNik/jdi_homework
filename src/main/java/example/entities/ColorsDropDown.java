package example.entities;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import org.openqa.selenium.support.FindBy;

public class ColorsDropDown extends Section {

    @FindBy(css = "li[rel='1']")
    public Button red;
    @FindBy(css = "li[rel='2']")
    public Button green;
    @FindBy(css = "li[rel='3']")
    public Button blue;
    @FindBy(css = "li[rel='4']")
    public Button yellow;


}
