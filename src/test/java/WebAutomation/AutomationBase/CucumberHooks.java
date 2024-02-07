package WebAutomation.AutomationBase;

import io.cucumber.java.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseTest {

    @Before
    public void beforeScenario() {
        BaseTest.setup();
    }

    @After
    public void afterScenario() {
        BaseTest.resetSession();
        BaseTest.tearDown();
    }
}