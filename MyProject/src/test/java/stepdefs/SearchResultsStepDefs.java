package stepdefs;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SearchResultsStepDefs {

    WebDriver webDriver;

    @Then("^I see the restaurants returned for postcode$")
    public void iSeeTheRestaurantsReturnedForPostcode() throws Throwable {
       String url = webDriver.getCurrentUrl();

    }
}
