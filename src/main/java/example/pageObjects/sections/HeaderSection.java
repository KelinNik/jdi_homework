package example.pageObjects.sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import example.entities.User;
import example.pageObjects.forms.LoginForm;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class HeaderSection extends Section {

    @FindBy(css = ".m-l8")
    public HeaderMenu headerMenu;

    @FindBy(css = ".profile-photo")
    private Button expanderButton;

    @FindBy(css = ".logout .btn-login")
    private Button logoutButton;

    private LoginForm loginForm;

    @Step
    public void login(User user) {
        expanderButton.click();
        loginForm.loginAs(user);
        expanderButton.should(Condition.text(user.getName()));
    }

    @Step
    public void logout() {
        expanderButton.click();
        logoutButton.click();
    }
}
