package example.site;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import example.entities.MetalColors;
import example.entities.User;
import example.site.pages.HomePage;
import example.site.pages.MetalPage;
import example.site.sections.LoginForm;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

@JSite("https://epam.github.io/JDI")
public class JDIExampleSite extends WebSite {
    public static HomePage homePage;

    public static MetalPage metalPage;

    public static LoginForm loginForm;

    public static MetalColors metalColors;

    @FindBy(css = ".profile-photo")
    public static Label profilePhoto;

    @Step
    public static void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }

    // TODO this method should be parametrised with DormData class
    @Step
    public static void fillForm() {
        metalColors.button3.click();
        metalColors.button8.click();
        metalColors.water.click();
        metalColors.fire.click();
        metalColors.colors.click();
        metalColors.red.click();
        metalColors.caret.click();
        metalColors.selen.click();
        metalColors.saladMenu.click();
        metalColors.cucumber.click();
        metalColors.salad.click();
        metalColors.tomato.click();
        metalColors.submit.click();
    }

    // TODO exactly the same like fillForm
    @Step
    public static void checkFillFormOnAccordance() {
        metalColors.sumRes.shouldHave(Condition.exactText("Summary: 11"));
        metalColors.elementsRes.shouldHave(Condition.exactText("Elements: Water, Fire"));
        metalColors.colorRes.shouldHave(Condition.exactText("Color: Red"));
        metalColors.metalRes.shouldHave(Condition.exactText("Metal: Selen"));
        metalColors.saladRes.shouldHave(Condition.exactText("Vegetables: Cucumber, Tomato"));
    }
}