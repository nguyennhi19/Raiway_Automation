package java.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketPricePage {
    //Locator
    //td[text()='Hard seat']//following-sibling::td//a           get seatype from ticketprice
    //th[contains(text(),'Price')]//following-sibling::td[1]     get price from ticketprice

    private By btnCheckPrice = By.xpath("//li[text()='%s to %s']/parent::td//following-sibling::td//a[text()='Check Price']");

    //Elements
    WebDriver driver = new ChromeDriver();

    private WebElement getBtnCheckPrice(){
        return driver.findElement(btnCheckPrice);
    }

    public String getTrain(String departFrom, String arriveAt){
        String text = "//li[text()='"+departFrom+" to "+arriveAt+"']/parent::td//following-sibling::td//a[text()='Check Price']";
        return text;
    }

    //Methods
    public void checkPriceFromTicketPricePage(String departFrom, String arriveAt){
        driver.findElement(By.xpath(getTrain(departFrom,arriveAt))).click();
    }
}
