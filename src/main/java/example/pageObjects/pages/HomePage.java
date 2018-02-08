package example.pageObjects.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import org.openqa.selenium.support.FindBy;

@JPage(url = "/index.html", title = "Home Page")
public class HomePage extends WebPage {

    @FindBy(css = ".profile-photo span")
    public Button profile;
}
