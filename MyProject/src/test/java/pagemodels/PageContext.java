/*package pagemodels;

import enums.WebDriverSelection;
import jdk.internal.jline.internal.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageContext {

    public static final String BASE_URL = "";

    private final WebDriver webDriver;
    private final WebDriverWait webDriverWait;
    private String relativeUrlPrefix = "";
    private boolean refreshOnNextLoad;
    private WebDriverSelection webDriverSelection;


    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;

    }

    public PageContext(WebDriver)

    public void load(String relativeUrl) {
        load(relativeUrlPrefix + relativeUrl, false);
    }

    private void load(String relativeUrl, boolean refreshIfCurrentUrl) {
        boolean forceload = refreshOnNextLoad || refreshIfCurrentUrl;
        refreshOnNextLoad = false;

        String url = getUrl(relativeUrl);
        if (!forceload && getWebDriver().getCurrentUrl().equals(url)) {
            return;
        }
        Log.info("Getting" + url);
        getWebDriver().navigate().to(url);
    }

    private String getUrl(String relativeUrl) {
        if (relativeUrl.startsWith("/")) {
            return getBaseUrl() + relativeUrl;
        } else {
            return getBaseUrl() + "/" + relativeUrl;
        }
    }

    public String getBaseUrl() {
        return BASE_URL;
    }
}
*/

