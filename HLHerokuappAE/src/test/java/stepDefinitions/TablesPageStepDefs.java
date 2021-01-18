package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageModels.TableSortingPage;

public class TablesPageStepDefs {

    TableSortingPage tableSortingPage = new TableSortingPage();


    @Then("^I can sort the table in \"([^\"]*)\" by \"([^\"]*)\"$")
    public void iCanSortTheTableInBy(String order, String headerName) throws Throwable {
        if (order.equalsIgnoreCase("Ascending")) {
            tableSortingPage.sortColumnInAscending(headerName);

        } else {
            tableSortingPage.sortColumnInDescending(headerName);
        }

        tableSortingPage.verifyTable(order, headerName);
    }

    @Then("^I can see the following displayed:$")
    public void iCanSeeTheFollowingDisplayed(DataTable dataTable) throws Throwable {
        tableSortingPage.verifyTable2(dataTable);

    }

    @And("^I click on Due to sort$")
    public void iClickOnDueToSort() throws Throwable {
        tableSortingPage.clickonDue();
    }
}


