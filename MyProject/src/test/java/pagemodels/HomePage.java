/*package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static final String PAGE_RELATIVE_URL = "";
    private static final By POSTCODE = By.id("postcode");

    public HomePage(WebDriver webDriver) {
       this.webDriver = webDriver;
    }

    public static HomePage load(PageContext pageContext) {
        pageContext.load(PAGE_RELATIVE_URL);
        return new HomePage(pageContext);
    }

    public void enterPostcode(String postcode) {
        WebElement element = webDriver.findElement(POSTCODE);
        element.clear();
        element.sendKeys(postcode);

    }
}

*/