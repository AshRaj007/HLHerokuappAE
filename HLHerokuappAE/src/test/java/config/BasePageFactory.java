package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePageFactory {

    public static WebDriver driver;

    public BasePageFactory() {
        PageFactory.initElements(driver, this);
    }

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    public void closeBrowser() throws InterruptedException {
        driver.quit();
    }


}

