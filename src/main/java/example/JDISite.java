package example;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import example.pageObjects.pages.HomePage;
import example.pageObjects.pages.MetalsAndColorsPage;


@JSite("https://epam.github.io/JDI")
class JDISite extends WebSite {

    @JPage(url = "index.html", title = "Home Page")
    static HomePage homePage;

    @JPage(url = "metals-colors.html", title = "Metal and Colors")
    static MetalsAndColorsPage metalsAndColorsPage;
}