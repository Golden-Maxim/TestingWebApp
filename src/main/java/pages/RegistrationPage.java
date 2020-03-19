package pages;

import driversConfig.DriverManager;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
@Slf4j
public class RegistrationPage extends BasePage{
    @FindBy(css = ".header__menu-link")
    private WebElementFacade buttonLogIn;

    public void goToRegistrationPage(){
        DriverManager driverManager = new DriverManager();
        driverManager.newDriver().get("https://eldritch-foundry.com/");
    }

}
