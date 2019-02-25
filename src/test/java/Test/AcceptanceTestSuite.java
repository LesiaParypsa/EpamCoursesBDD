package Test;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.webdriver.Configuration;

public class AcceptanceTestSuite extends SerenityStories {
    private Configuration configuration;

    public AcceptanceTestSuite() {
        configuration = super.getSystemConfiguration();
        configuration.setIfUndefined(ThucydidesSystemProperty.WEBDRIVER_DRIVER.getPropertyName(), "provided");
        configuration.setIfUndefined(ThucydidesSystemProperty.WEBDRIVER_PROVIDED_TYPE.getPropertyName(), "mydriver");
        configuration.setIfUndefined("webdriver.provided.mydriver", "Test.drivers.ChromeWebDriver");
    }
}
