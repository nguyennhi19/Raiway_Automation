package java.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicketPage {
    //Locator
    private By SelectDate = By.xpath("//select[@name='Date']");
    private By SelectDepartFrom = By.xpath("//select[@name='DepartStation']");
    private By SelectArriverAt = By.xpath("//select[@name='ArriveStation']");
    private By SelectSeatType = By.xpath("//select[@name='SeatType']");
    private By SelectTicketAmount = By.xpath("//select[@name='TicketAmount']");
    private By btnLBookTicket = By.xpath("//input[@value='Book ticket']");

    //Elements
    WebDriver driver = new ChromeDriver();

    private WebElement getSelectDate(){
        return driver.findElement(SelectDate);
    }

    private WebElement getSelectDepartFrom(){
        return driver.findElement(SelectDepartFrom);
    }
    private WebElement getSelectArriverAt(){
        return driver.findElement(SelectArriverAt);
    }

    private WebElement getSelectSeatType(){
        return driver.findElement(SelectSeatType);
    }
    private WebElement getSelectTicketAmount(){
        return driver.findElement(SelectTicketAmount);
    }

    private WebElement getBtnBookTicket(){
        return driver.findElement(btnLBookTicket);
    }

    //Methods
    public void chooseDate(String date) {
        getSelectDate().click();
        driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+date+"']")).click();
    }

    public void chooseDepartFrom(String departFrom) {
        getSelectDepartFrom().click();
        driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+departFrom+"']")).click();
    }

    public void chooseArriveAt(String arriveAt) {
        getSelectArriverAt().click();
        driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+arriveAt+"']")).click();
    }

    public void chooseSeatType(String seatType) {
        getSelectSeatType().click();
        driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+seatType+"']")).click();
    }

    public void chooseTicketAmount(String ticketAmount) {
        getSelectTicketAmount().click();
        driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+ticketAmount+"']")).click();
    }

    public void bookTicket(String date, String departFrom, String arriverAt, String seatType, String ticketAmount){
        chooseDate(date);
        chooseDepartFrom(departFrom);
        chooseArriveAt(arriverAt);
        chooseSeatType(seatType);
        chooseTicketAmount(ticketAmount);
        getBtnBookTicket().click();
    }
}
