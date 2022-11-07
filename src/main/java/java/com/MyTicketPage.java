package java.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTicketPage {
    //Locators
    private By btnCancel = By.xpath("//input[@value='Cancel']");
    private final By selArriveStation = By.name("FilterArStation");
    private final By txtDepartDate = By.name("FilterDpDate");
    private final By btnApplyFilter = By.xpath("//input[@value='Apply Filter']");

    //Elements
    WebDriver driver = new ChromeDriver();

    private WebElement getCancelElement() {
        return driver.findElement(btnCancel);
    }

    private WebElement getArriveStationElement() {
        return driver.findElement(selArriveStation);
    }

    private WebElement getDepartDateElement() {
        return driver.findElement(txtDepartDate);
    }

    private WebElement getApplyFilterElement() {
        return driver.findElement(btnApplyFilter);
    }


    //Methods

}
