package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageModels.HomePage;


public class HomePageStepDefs {

    HomePage homePage = new HomePage();


    @And("^I click on Sortable Data Tables$")
    public void IClickOnSortableDataTables() {
        homePage.clickOnDataTable();
    }

    @Given("^I am on Herokuapp website$")
    public void iAmOnHerokuappWebsite() {
        homePage.checkURL();
    }
}


