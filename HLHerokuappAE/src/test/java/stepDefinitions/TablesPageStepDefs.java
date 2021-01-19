package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageModels.EditTablePage;
import pageModels.TableSortingPage;

public class TablesPageStepDefs {

    private TableSortingPage tableSortingPage = new TableSortingPage();
    private EditTablePage editTablePage = new EditTablePage();


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


    @And("^I click on edit for user with first name \"([^\"]*)\"$")
    public void iClickOnEditForUserWithFirstName(String firstName) throws Throwable {
        tableSortingPage.clickOnEdit(firstName);
    }

    @Then("^the Edit page is displayed$")
    public void theEditPageIsDisplayed() {
        editTablePage.checkEditURL();

    }
}


