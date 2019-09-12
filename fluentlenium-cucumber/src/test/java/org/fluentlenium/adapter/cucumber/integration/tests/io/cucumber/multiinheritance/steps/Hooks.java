package org.fluentlenium.adapter.cucumber.integration.tests.io.cucumber.multiinheritance.steps;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.fluentlenium.adapter.cucumber.FluentCucumberTest;

public class Hooks extends FluentCucumberTest {

    @Override
    public String getWebDriver() {
        return "htmlunit";
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        before(scenario);
    }

    @After
    public void afterScenario(Scenario scenario) {
        after(scenario);
    }
}
