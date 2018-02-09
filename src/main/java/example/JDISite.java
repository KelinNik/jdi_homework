package example;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import example.entities.MetalColorsDataSet;
import example.entities.User;
import example.enums.HeaderMenuEnum;
import example.pageObjects.pages.HomePage;
import example.pageObjects.pages.MetalsAndColorsPage;
import example.pageObjects.sections.HeaderMenu;
import example.pageObjects.sections.LoginForm;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;
import java.io.IOException;

import static example.entities.ParsingDataSet.parseJson;


@JSite("https://epam.github.io/JDI")
public class JDISite extends WebSite {

    public static HomePage homePage;
    public static MetalsAndColorsPage metalAndColorsPage;
    // public static MetalColorsDataSet metalColorsDataSet;

    public static LoginForm loginForm;

    @JFindBy(css = ".m-l8")
    public static HeaderMenu headerMenu;

    @FindBy(css = ".profile-photo")
    public static Label profilePhoto;

    @Step
    public static void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }

    @Step
    public static void openMetalsColorsPage(HeaderMenuEnum pages) {
        headerMenu.select(pages.item);
    }

    @Step
    public static MetalColorsDataSet parseData() throws IOException {
        File file = new File("ex8_jdi_metalsColorsDataSet.json");
        return parseJson(file);
    }

    @Step
    public static void fillMetalsColorsForm() throws IOException {
        metalAndColorsPage.metalsColorsForm.fill(parseData());
    }
}