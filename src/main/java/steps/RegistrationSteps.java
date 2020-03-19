package steps;

import net.thucydides.core.annotations.Step;

public class RegistrationSteps extends DefaultStepsData {

    @Step
    public void getStartPage(){
        registrationPage.goToRegistrationPage();
    }

}
