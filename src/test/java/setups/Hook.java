package setups;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends ChromeSetup{
    @Before
    public void before() throws Exception {
        chromeStart();
    }

    @After
    public void after() throws Exception {
        chromeStop();
    }
}
