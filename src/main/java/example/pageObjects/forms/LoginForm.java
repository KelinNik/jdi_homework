package example.pageObjects.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import example.entities.User;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends Form<User> {
    @FindBy(id = "Login")
    public TextField login;

    @FindBy(id = "Password")
    public TextField password;

    @FindBy(css = "form [type='submit']")
    public Button submit;
}
