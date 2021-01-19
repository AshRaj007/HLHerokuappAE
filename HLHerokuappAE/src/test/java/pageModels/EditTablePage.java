package pageModels;

import config.BasePageFactory;
import org.junit.Assert;

public class EditTablePage extends BasePageFactory {

    public void checkEditURL() {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("https://the-internet.herokuapp.com/tables#edit", actualURL);
    }
}
