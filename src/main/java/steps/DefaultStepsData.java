package steps;

import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.SoftAssertions;
import org.jbehave.core.annotations.AfterScenario;
import pages.RegistrationPage;


public class DefaultStepsData extends ScenarioSteps {

   protected static RegistrationPage registrationPage;

    protected SoftAssertions softly = new SoftAssertions();

    @AfterScenario
    public void softlyAssertAll() {
        softly.assertAll();
    }
}
