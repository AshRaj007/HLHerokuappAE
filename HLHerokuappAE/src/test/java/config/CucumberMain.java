package config;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberMain {

    BasePageFactory basePageFactory = new BasePageFactory();

    @Before
    public void setup() {
        basePageFactory.openBrowser();
    }

    @After
    public void tearDown() throws InterruptedException {
        basePageFactory.closeBrowser();
    }
}
