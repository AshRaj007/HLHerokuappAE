package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageStepDefs {

    WebDriver webDriver;

    @Given("^I open the Just Eat website$")
    public void iOpenTheJustEatWebsite() {
        System.setProperty("webdriver.chrome.driver", "/Users/ashikaanandraj/Downloads/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://just-eat.co.uk");
    }

    @When("^I enter the postcode \"([^\"]*)\"$")
    public void iEnterThePostcode(String postcode) {
        WebElement element = webDriver.findElement(By.id("postcode"));
        element.clear();
        element.sendKeys(postcode);
    }

    @And("^I click on Find restaurants$")
    public void iClickOnFindRestaurants() {
        WebElement element = webDriver.findElement(By.xpath("//span[text()='Find restaurants']"));
        element.click();
        webDriver.quit();
    }
}

