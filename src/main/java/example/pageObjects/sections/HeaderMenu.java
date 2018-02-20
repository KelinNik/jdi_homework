package example.pageObjects.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import example.enums.HeaderMenuEnum;

public class HeaderMenu extends Menu {

    public void mySelection(HeaderMenuEnum page) {

        super.select(page.toString());
    }
}
