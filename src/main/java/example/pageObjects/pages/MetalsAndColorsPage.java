package example.pageObjects.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import example.pageObjects.sections.MetalsColorsForm;

@JPage(url = "/metals-colors.html")
public class MetalsAndColorsPage extends WebPage {

    @JFindBy(css = ".form")
    public MetalsColorsForm metalsColorsForm;

}
