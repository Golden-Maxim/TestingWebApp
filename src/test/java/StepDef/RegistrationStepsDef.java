package StepDef;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import steps.DefaultStepsData;
import steps.RegistrationSteps;

public class RegistrationStepsDef extends DefaultStepsData {

    @Steps
    private RegistrationSteps registrationSteps;


    @Given("I open the registration page")
    public void goToRegistPage(){
        registrationSteps.getStartPage();
    }
}
