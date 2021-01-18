package pageModels;


import config.BasePageFactory;
import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TableSortingPage extends BasePageFactory {

    private int columnNumber = 0;

    @FindBy(className = "dues")
    WebElement due;

    public void verifyTable(String orderValue, String headerNameValue) {
        getColumnNumber(headerNameValue);
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#table1 tr td:nth-child(" + columnNumber + ")"));
        ArrayList<String> actualTableValues = new ArrayList<String>();
        for (WebElement tableRow : tableRows) {
            String str = tableRow.getText();
            actualTableValues.add(str);
        }

        ArrayList<String> referenceValues = new ArrayList<String>();
        for (String tableValue : actualTableValues) {
            referenceValues.add(tableValue);
        }

        Collections.sort(referenceValues);

        if (orderValue.equalsIgnoreCase("Descending")) {
            Collections.reverse(referenceValues);
        }

        Assert.assertEquals(referenceValues, actualTableValues);

    }

    private int getColumnNumber(String headerName) {
        switch (headerName) {
            case "Last Name":
                columnNumber = 1;
                break;
            case "First Name":
                columnNumber = 2;
                break;
            case "Email":
                columnNumber = 3;
                break;
            case "Due":
                columnNumber = 4;
                break;
            case "Web Site":
                columnNumber = 5;
                break;
        }

        return columnNumber;

    }

    public void sortColumnInAscending(String header) {
        WebElement element = driver.findElement(By.xpath("//table[@id='table1']//span[contains(.,'" + header + "')]"));
        String className = element.getAttribute("class");
        if (className.contains("headerSortUp") || !className.contains("headerSortDown")) {
            element.click();
        }

    }


    public void sortColumnInDescending(String header) {
        WebElement element = driver.findElement(By.xpath("//table[@id='table1']//span[contains(.,'" + header + "')]"));
        String className = element.getAttribute("class");
        if (!className.contains("headerSortUp")) {
            element.click();
            if (!className.contains("headerSortDown")) {
                element.click();
            }
        }
    }

    public void verifyTable2(DataTable dataTable) {

        WebElement element = driver.findElement(By.xpath("//table[@id='table2']"));
        List<WebElement> rowElements = element.findElements(By.xpath(".//tr"));
        rowElements.remove(0);

        List<List<String>> dataTableRows = dataTable.asLists(String.class);

        for (List<String> row : dataTableRows) {
            int rowIdx = dataTableRows.indexOf(row);
            WebElement rowElem = rowElements.get(rowIdx);
            List<WebElement> cellElements = rowElem.findElements(By.xpath(".//td"));

            for (String expectedTable : row) {
                int cellIdx = row.indexOf(expectedTable);
                String actualTable = cellElements.get(cellIdx).getText();

                System.out.println("DataTable row " + rowIdx + ", cell " + cellIdx + ": " + expectedTable);
                System.out.println("Actual value on the page: " + actualTable);

                Assert.assertEquals("Table matches",
                        expectedTable, actualTable);
            }
        }
    }

    public void clickonDue() {
        due.click();
    }
}
