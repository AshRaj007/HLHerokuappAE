package pageModels;


import config.BasePageFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePageFactory {


    @FindBy(linkText = "Sortable Data Tables")
    WebElement sortableDataTablesOption;


    public void clickOnDataTable() {
        sortableDataTablesOption.click();
    }

    public void checkURL() {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("https://the-internet.herokuapp.com/", actual);
    }
}
