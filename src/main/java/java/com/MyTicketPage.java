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
    private final By lblErrorMessage = By.xpath("//div[@class='error message']");
    private final By lblNoteMessage = By.xpath("//div[@class='message']//li");

    //Elements
    WebDriver driver = new ChromeDriver();

    protected WebElement getCancelElement() {
        return driver.findElement(btnCancel);
    }

    protected WebElement getArriveStationElement() {
        return driver.findElement(selArriveStation);
    }

    protected WebElement getDepartDateElement() {
        return driver.findElement(txtDepartDate);
    }

    protected WebElement getApplyFilterElement() {
        return driver.findElement(btnApplyFilter);
    }

    protected WebElement getErrorMessageElement() {
        return driver.findElement(lblErrorMessage);
    }

    protected WebElement getNoteMessageElement() {
        return driver.findElement(lblNoteMessage);
    }

    //Methods

}
