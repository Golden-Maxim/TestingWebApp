package StepDef.runners;

import net.serenitybdd.core.environment.WebDriverConfiguredEnvironment;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;

import static net.thucydides.core.ThucydidesSystemProperty.*;

public class RunnerConfig extends SerenityStories {


    private Configuration configuration;
    private EnvironmentVariables environmentVariables;

    public RunnerConfig() {
        environmentVariables = WebDriverConfiguredEnvironment.getEnvironmentVariables();
        configuration = this.getSystemConfiguration();
        configuration.setIfUndefined(WEBDRIVER_DRIVER.getPropertyName(), "provided");
        configuration.setIfUndefined(WEBDRIVER_PROVIDED_TYPE.getPropertyName(), "mydriver");
        configuration.setIfUndefined("webdriver.provided.mydriver", "driversConfig.DriverManager");
        configuration.setIfUndefined(WEBDRIVER_TIMEOUTS_IMPLICITLYWAIT.getPropertyName(),"5000");
        //environmentVariables.setProperty(WEBDRIVER_BASE_URL.getPropertyName(),"https://www.facebook.com/");
    }
}
