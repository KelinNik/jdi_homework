package example.site;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import example.entities.*;
import example.site.pages.HomePage;
import example.site.pages.MetalsAndColorsPage;
import example.site.sections.LoginForm;
import example.site.sections.MetalsColorsForm;
import example.site.sections.SaladDropDownForm;
import example.site.sections.SummaryForm;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.IOException;
import java.util.List;

@JSite("https://epam.github.io/JDI")
public class JDISite extends WebSite {

    @JPage(url = "/index.html", title = "Home Page")
    public static HomePage homePage;

    @JPage(url = "/metals-colors.html")
    public static MetalsAndColorsPage metalAndColorsPage;

    @FindBy(css = ".profile-photo")
    public static Label profilePhoto;

    @FindBy(id = "submit-button")
    public static Button submit;

    @FindBy(css = "[title=Colors]")
    public static Dropdown colors;

    @FindBy(css = "[data-id=metals-combobox] span[class='caret']")
    public static Button caret;

    @FindBy(id = "salad-dropdown")
    public static Button saladMenu;

    public static LoginForm loginForm;

    public static SummaryForm summaryForm;
    public static Elements elements;
    public static MetalsColorsForm metalColorsForm;
    public static DataSet data = new DataSet();
    public static ColorsDropDown colorsDropDown;
    public static MetalsDropDown metalDropDown;
    public static SaladDropDownForm saladDropDown;

    @Step
    public static void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }

    @Step
    public static void parseJsonFile() {
        try {
            data.parseJson();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Step
    public static void selectButton(List<Integer> numbers) {

        int number1 = numbers.get(0);
        int number2 = numbers.get(1);
        switch (number1) {
            case 1:
                summaryForm.button1.click();
                break;
            case 2:
                summaryForm.button2.click();
                break;
            case 3:
                summaryForm.button3.click();
                break;
            case 4:
                summaryForm.button4.click();
                break;
            default:
                switch (number2) {
                    case 5:
                        summaryForm.button5.click();
                        break;
                    case 6:
                        summaryForm.button6.click();
                        break;
                    case 7:
                        summaryForm.button7.click();
                        break;
                    case 8:
                        summaryForm.button8.click();
                        break;
                    default:
                        summaryForm.Calculate.click();
                        break;
                }
        }
    }

    @Step
    public static void pickElements(List<String> element) {
        for (String anElement : element) {
            if (anElement.toLowerCase().contains("water")) elements.water.click();
            if (anElement.toLowerCase().contains("earth")) elements.earth.click();
            if (anElement.toLowerCase().contains("wind")) elements.wind.click();
            if (anElement.toLowerCase().contains("fire")) elements.fire.click();
        }
    }

    @Step
    public static void chooseTheColor(String color) {
        colors.click();
        switch (color) {
            case "Red":
                colorsDropDown.red.click();
                break;
            case "Green":
                colorsDropDown.green.click();
                break;
            case "Blue":
                colorsDropDown.blue.click();
                break;
            case "Yellow":
                colorsDropDown.yellow.click();
                break;
            default:
                break;
        }
    }

    @Step
    public static void chooseTheMetal(String metal) {
        caret.click();
        switch (metal) {
            case "Gold":
                metalDropDown.gold.click();
                break;
            case "Silver":
                metalDropDown.silver.click();
                break;
            case "Bronze":
                metalDropDown.bronze.click();
                break;
            case "Selen":
                metalDropDown.selen.click();
                break;
            default:
                break;
        }
    }

    @Step
    public static void chooseSalad(List<String> salad) {
        saladMenu.click();
        if (saladDropDown.cucumber.isChecked()) saladDropDown.cucumber.click();
        if (saladDropDown.tomato.isChecked()) saladDropDown.tomato.click();
        if (saladDropDown.salad.isChecked()) saladDropDown.salad.click();
        if (saladDropDown.onion.isChecked()) saladDropDown.onion.click();
        for (String aSalad : salad) {
            if (aSalad.contentEquals("Cucumber")) {
                saladDropDown.cucumber.click();
            }
            if (aSalad.contentEquals("Tomato")) {
                saladDropDown.tomato.click();
            }
            if (aSalad.contentEquals("Salad")) {
                saladDropDown.salad.click();
            }
            if (aSalad.contentEquals("Onion")) {
                saladDropDown.onion.click();
            }
        }
    }

    @Step
    public static void submit() {
        submit.click();
    }
    // TODO exactly the same like fillForm

    @Step
    public static void checkFillFormOnAccordance() {
        metalColorsForm.sumRes.shouldHave(Condition.exactText("Summary: 3"));
        metalColorsForm.elementsRes.shouldHave(Condition.exactText("Elements: Water, Fire"));
        metalColorsForm.colorRes.shouldHave(Condition.exactText("Color: Red"));
        metalColorsForm.metalRes.shouldHave(Condition.exactText("Metal: Gold"));
        metalColorsForm.saladRes.shouldHave(Condition.exactText("Vegetables: Cucumber, Salad"));
    }
}